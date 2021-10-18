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


export default function UserDetail() {
  
  return (
    <div>
      <h1>사용자 상세 정보</h1>
      <figcaption>오늘은 남은 인생이 시작되는 첫쨰날</figcaption>
      <h1>InSung Jang</h1>
      <p>이메일 : roomate1245@gmail.com</p>
      <h2>Who I am ?</h2>
      <p>웹 개발 경력 0년차이고 현재 비트캠프 학원에서 뢀동중입니다.</p>
      <h2>GitHub</h2>
      <ul>
      <li><a href="https://github.com/jang5714?tab=repositories" target="_blank">GitHub</a></li>
      </ul>
      <hr></hr>
      <h2>skills</h2>
      <ul>
      <li>사용 언어
          <ul>
              <li><mark>HTML</mark></li>
              <li><mark>CSS</mark></li>
              <li>JAVA</li>
              <li>Javascript</li>
              <li>Jquery</li>
              <li>Oracle</li>   
          </ul>
      </li>
      <li>사용 툴
          <ul>
              <li>Spring boot</li>
              <li>Spring Framework</li>
              <li>docker</li>
              <li>Intellij</li>
              <li>pycharm</li>
          </ul>
      </li>
      </ul>
      <h2>Academic</h2>
      <table>
      <caption>학력 사항</caption>
      <thead>
              <tr>
                  <th>출신학교</th>
                  <th>전공</th>
                  <th>기간</th>
                  <th>졸업구분</th>
              </tr>
          </thead>
          <tbody>
              <tr>
                  <td>ooo 고등학교</td>
                  <td>(해당사항 없음)</td>
                  <td>2009.3 ~ 2012.3</td>
                  <td>졸업</td>
              </tr>
              <tr>
                  <td>ooo 대학교</td>
                  <td>산업경영과</td>
                  <td>2012.3 ~ 2016.3</td>
                  <td>졸업</td>
              </tr>
          </tbody>
      </table>
    </div>
  );
}
