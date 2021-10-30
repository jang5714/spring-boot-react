import React, { useState, useCallback } from 'react';
import { useDispatch } from 'react-redux';
import { useHistory  } from 'react-router-dom';
import { loginPage } from 'features/users/reducer/userSlice'
import {useForm} from "react-hook-form";
import styled from 'styled-components'

export default function UserLogin() {
  const { register, handleSubmit, formState: { errors } } = useForm();
  const [login, setLogin] = useState({})
  const {username, password} = login
  const history = useHistory()
  const dispatch = useDispatch()

  const handleChange = useCallback (
    e => {
    const {value, name} = e.target
    setLogin({
      ...login,
      [name] : value
    })
  }, [login]
  )
  const changeNull = ls =>{
    for(const i of ls ){
      document.getElementById(i).value = ''
    }
  }

  const onSubmit = async(e) => {
    const loginRequest = {username, password}
    await dispatch(loginPage(loginRequest))
    const loginUser = JSON.parse(localStorage.getItem('sessionUser'))
    if(loginUser.username != null){
      alert(`${loginUser.name}님 환영합니다.`)
      history.push("/users/detail")
    }else{
      alert('아이디, 비번 오류로 로그인 실패  ')
      changeNull(['username','password'])
    }
  }
  
  return (
    <div>
      <form method="POST" onSubmit={handleSubmit(onSubmit)}>
      <ul>
          <li>
            <label for="id">아이디
              <input type="text" id="username" name='username' value={username} 
                aria-invalid={errors.name ? "true" : "false"}
                {...register('username', {required: true, maxlength:30})}
                onChange={handleChange}/>
            </label>
          </li>
          <small> 
              {errors.password && errors.password.type === "required" && <Span>아이디를 입력해 주세요</Span>}
              {errors.password && errors.password.type === "maxLength" && <Span>Max length exceeded</Span>}
            </small>
          <li>
            <label for="pw">비밀번호
            </label>
                <input type="password" id="password" name="password"
                aria-invalid={errors.name ? "true" : "false"}
                {...register('password', {required: true, maxlength:30})}
                onChange={handleChange}/>
            </li>
            <li >
            <small> 
              {errors.password && errors.password.type === "required" && <Span>비밀번호를 입력해 주세요</Span>}
              {errors.password && errors.password.type === "maxLength" && <Span>Max length exceeded</Span>}
            </small>
          </li>
          <li>
          <input type="submit" title="로그인" value="로그인" onClick={ e => handleSubmit(e)}/>
          </li>
      </ul>
  </form>
</div>
  );
}

const Span = styled.span`
    color: red;
    font-weight: bold;
`