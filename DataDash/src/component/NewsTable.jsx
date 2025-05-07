import React, { useEffect, useState } from 'react';
import { fetchNews } from "../service/api";
import '../css/NewsTable.css';

const NewsTable = () => {

  const [articles, setArticles] = useState([]);
  const [status, setStatus] = useState('');
  const [totalResults, setTotalResults] = useState(0);
  const [loading, setLoading] = useState(true);
  const [page, setPage] = useState(1);


  const loadNews = () => {
    fetchNews()
      .then((response) => {
        const data = response.data;
        setStatus(data.status);
        setTotalResults(data.totalResults);
        setArticles(data.articles);
      })
      .catch((error) => {
        console.error('Error fetching news:', error);
      });
  };

  useEffect(() => {

    loadNews(); // initial fetch
    console.log(articles)
    const intervalId = setInterval(() => {
      console.log('Refreshing news data...');
      loadNews();
    }, 100000);

    return () => clearInterval(intervalId);
  }, []);

  return (
    <div className="news-table-container">
      <h2>News Feed</h2>
      <p>Status: {status} | Total Results: {totalResults}</p>
      <table>
        <thead>
          <tr>
            <th>Image</th>
            <th>Source Name</th>
            <th>Source ID</th>
            <th>Author</th>
            <th>Title</th>
            <th>Description</th>
            <th>Published At</th>
            <th>Content</th>
            <th>Link</th>
          </tr>
        </thead>
        <tbody>
          {articles.map((article, idx) => (
            <tr key={idx}>
              <td>
                {article.urlToImage ? (
                  <img
                    src={article.urlToImage}
                    alt="article"
                    style={{ width: '100px', height: '60px', objectFit: 'cover' }}
                  />
                ) : (
                  'N/A'
                )}
              </td>
              <td>{article.source?.name || 'N/A'}</td>
              <td>{article.source?.id || 'N/A'}</td>
              <td>{article.author || 'N/A'}</td>
              <td>{article.title || 'N/A'}</td>
              <td>{article.description || 'N/A'}</td>
              <td>{new Date(article.publishedAt).toLocaleString()}</td>
              <td>
                {article.content
                  ? article.content.length > 100
                    ? article.content.substring(0, 100) + '...'
                    : article.content
                  : 'N/A'}
              </td>
              <td>
                <a href={article.url} target="_blank" rel="noopener noreferrer">
                  Read
                </a>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default NewsTable