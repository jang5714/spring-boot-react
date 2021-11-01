import React from 'react'
import { useHistory  } from 'react-router-dom';
import { Logout } from 'features/users'
export default function Home(){
    // const history = useHistory()
    return(<div>
        {localStorage.length > 0 ?
        <><h3>{JSON.parse(window.localStorage.getItem('sessionUser')).name}님 접속중</h3> <Logout/></>
        : <><h3>로그인 필요</h3>
        <button onClick = {e => window.location.href = `/users/add`}>회원가입</button>
        <button onClick = {e => window.location.href = `/users/login`}>로그인</button>
        </>}
        <h1>시간이란...</h1>
        <p>내일 죽을 것처럼 오늘을 살고
            영원히 살 것처럼 내일을 꿈꾸어라.</p>
        </div>)
}