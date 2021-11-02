import React, { useEffect, useState } from 'react';
import { UserListForm } from '..';
import { useDispatch, useSelector } from 'react-redux';
import { listPage } from '../reducer/userSlice';
import { produceWithPatches } from 'immer';



export default function UserList() {
  const dispatch = useDispatch()
  const [list, setList] = useState([])
  const users = useSelector((state) => state.users[produceWithPatches.id])
 
  const userList = () => {
      userList()
      .then(res => setList(res.data) )
      .catch(err => console.log(err))
  }

  useEffect(() =>{
    dispatch(listPage) 
  }, [])
  return (
    <div>
      <h1>사용자 목록</h1>
      <UserListForm list={list}/>
    </div>
  );
}