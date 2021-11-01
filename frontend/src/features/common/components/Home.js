import { Logout } from "features/users";
import React, { useEffect, useState } from "react";

export default function Home() {
return (<>
        <form style={{margin:'20px'}}>
            { localStorage.length == 0 && <input type="button" value="로그인" onClick={e => window.location.href='/users/login'}/> }
            { localStorage.length > 0 && <Logout/> }
            <h1>Home</h1>
            {  localStorage.length == 0  ?<><button onClick = {e => window.location.href='/users/add'  // =  history.push('/users/add')
            }>회원가입</button><button onClick = {e => window.location.href='/users/login'}>로그인</button></>
            :<><h1>안녕 :) <br/> {JSON.parse(window.localStorage.getItem('sessionUser')).name} 아 <br/> 로그인 중이네? ...</h1></>}
     </form>
    </>)
}