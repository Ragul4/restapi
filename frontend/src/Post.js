import React, { Component } from 'react';
import './Post.css';
import axios from 'axios';
import { Link } from 'react-router-dom';

class Post extends Component {
  constructor(props) {
    super(props);
    this.state = {
      id: '',
      c_name: '',
      book_name: '',
      author: '',
      domain: '',
      university: ''
    };
  }

  handleIdChange = (event) => {
    this.setState({id: event.target.value });
  };

  handleC_nameChange = (event) => {
    this.setState({c_name: event.target.value });
  };

  handleBook_nameChange = (event) => {
    this.setState({ book_name: event.target.value });
  };

  handleAuthorChange = (event) => {
    this.setState({ author: event.target.value });
  };

  handleDomainChange = (event) => {
    this.setState({ domain: event.target.value });
  };

  handleUniversityChange = (event) => {
    this.setState({ university: event.target.value });
  };
  handleSubmit = (event) => {
    event.preventDefault();
    const data = {
      id: this.state.id,
      c_name: this.state.c_name,
      book_name: this.state.book_name,
      author: this.state.author,
      domain: this.state.domain,
      university: this.state.university
    };

    axios.post('http://127.0.0.1:8080/post', data);
  };

  render() {
    return (
      <><body>
        <h1 className="head">Create the content details</h1>
      <form onSubmit={this.handleSubmit} className="sign-form">
        <label className="sign-label">Id</label>
        <input
          className="sign-input"
          type="text"
          value={this.state.id}
          onChange={this.handleIdChange}
        />

        <label className="sign-label">c_name</label>
        <input
          className="sign-input"
          type="text"
          value={this.state.c_name}
          onChange={this.handleC_nameChange}
        />

        <label className="sign-label">book_name</label>
        <input
          className="sign-input"
          type="text"
          value={this.state.book_name}
          onChange={this.handleBook_nameChange}
        />

        <label className="sign-label">author</label>
        <input
          className="sign-input"
          type="text"
          value={this.state.author}
          onChange={this.handleAuthorChange}
        />

        <label className="sign-label">domain</label>
        <input
          className="sign-input"
          type="text"
          value={this.state.domain}
          onChange={this.handleDomainChange}
        />

        <label className="sign-label">university</label>
        <input
          className="sign-input"
          type="text"
          value={this.state.university}
          onChange={this.handleUniversityChange}
        />

        <button className="login-button" type="submit">
          Create
        </button>
      </form>
      
<button className='button1'>
        <Link  to="/Put" >Update</Link>
      </button >
      <button className='button2'>
        <Link  to="/Get">See All</Link>
      </button>
      <button className='button3'>
        <Link  to="/Delete">Delete</Link>
      </button>
      </body></>
    );
  }
}

export default Post;