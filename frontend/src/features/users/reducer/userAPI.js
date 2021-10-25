import axios from 'axios';
const SERVER = 'http://localhost:8080'
const headers = {
  'Content-Type' : 'application/json',
  'Authorization' : 'JWT fefege..'
}

const userJoin = param => axios.post(`${SERVER}/users`, JSON.stringify(param),{headers})
  
