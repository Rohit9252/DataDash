import { useState } from 'react'
import NewsTable from "./component/NewsTable";
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <div className="App">
      <NewsTable />
    </div>
  )
}

export default App
