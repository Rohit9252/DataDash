import axios from 'axios';

const API_BASE_URL = 'http://localhost:8080/api/news'; 

export const fetchNews = () => {
  return axios.get(`${API_BASE_URL}`);
};