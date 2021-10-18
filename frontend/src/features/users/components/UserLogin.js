import React, { useState } from 'react';
// import { useSelector, useDispatch } from 'react-redux';
// import {
//   decrement,
//   increment,
//   incrementByAmount,
//   incrementAsync,
//   incrementIfOdd,
//   selectCount,
// } from './counterSlice';


export default function UserLogin() {
  
  return (
    <div>
     <form action="login.php" method="POST">
      <ui>
        <li>
            <label for="id"/>아이디
            <input type="text" id="id"/>
        </li>
        <li>
            <label for="pw"/>패스워드
            <input type="password" id="pw"/>
        </li>
        <li>
            <input type="submit" title="로그인" value="로그인"/>
        </li>
      </ui>
    </form>
    </div>
  );
}
