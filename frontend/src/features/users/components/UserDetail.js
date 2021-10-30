import React, { useState, useEffect, useCallback} from 'react';
import { useDispatch } from 'react-redux';
import { Link, useHistory } from 'react-router-dom';
import { loginPage, logoout } from '../reducer/userSlice';



export default function UserDetail() {
    const detail = JSON.parse(localStorage.getItem('sessionUser'))
    const dispatch = useDispatch()
    const history = useHistory()

  return (
    <div>
        <h1>회원 정보</h1>
        <ul>
            <li>
                <label>
                    <span>아이디: {detail.userId}</span>
                </label>
            </li>
            <li>
                <label>
                <span>email: {detail.email}</span>
                </label>
            </li>
            <li>
                <label>
                <span>비밀번호: *******</span>
                </label>
            </li>
            <li>
                <label>
                <span>이름: {detail.name}</span>
                </label>
            </li>
            <li>
                <input type="button" value="회원정보수정" onClick={()=> history.push('/users/modify')}/>
                <input type="button" value="로그아웃" onClick={dispatch(logoout)}/>
            </li>
        </ul>
    </div>
  );
}
