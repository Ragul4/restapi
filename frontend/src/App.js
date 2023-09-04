import './App.css';
import Delete from './Delete';
import Post from './Post';
import Get from './Get';
import Put from './Put';
import { BrowserRouter as Router ,Route,Routes } from 'react-router-dom';

function App() {
  return (
    <Router>
    <div className="App">
      <Routes>
      <Route exact path='/' element={<Post />}></Route>
          <Route exact path='/Put' element={<Put />}></Route>
          <Route exact path='/Get' element={<Get />}></Route>
          <Route exact path='/Delete' element={<Delete />}></Route>
     </Routes>
    </div></Router>
  );
}

export default App;