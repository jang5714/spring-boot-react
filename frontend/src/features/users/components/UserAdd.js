import React, { useState, useCallback } from 'react';
import { useHistory  } from 'react-router-dom';
import { useDispatch } from 'react-redux';
import { joinPage } from 'features/users/reducer/userSlice'
import { register } from 'serviceWorker';
import {useForm} from "react-hook-form";
import styled from 'styled-components'


export default function UserAdd() {
    const { register, handleSubmit, formState: { errors } } = useForm();
    const dispatch = useDispatch()
    return (
        <div>
            <h1>회원 가입을 환영합니다.</h1>
        <form onSubmit={handleSubmit(async ({data}) => {await dispatch(joinPage({...data, 
                                                    regDate: new Date().toLocaleDateString()}))})} method='POST'>
            <ul>
                <li>
                    <label>
                        아이디 : <input type="text" id="username" 
                        aria-invalid={errors.name ? "true" : "false"}
                        {...register('username', {required: true, maxlength:30})}
                        size="10" minlength="1" maxlength="15"/>
                    </label>
                        {/* use role="alert" to announce the error message */}
                        {errors.username && errors.username.type === "required" && (
                        <Span role="alert">아이디를 입력해 주세요</Span>
                        )}
                    <br/>
                    <small>4~15자리 이내의 영문과 숫자</small>
                </li>
                <li>
                    <label>
                        이메일 : <input type="email" id="email"  
                        aria-invalid={errors.name ? "true" : "false"}
                        {...register('email', {required: true, maxlength:30})}
                    />
                        {/* use role="alert" to announce the error message */}
                        {errors.email && errors.email.type === "required" && (
                            <Span role="alert">이메일을 입력해 주세요!</Span>
                        )}
                    </label>
                    
                </li>
                <li>
                    <label>
                        비밀 번호 : <input type="password" id="password" 
                        aria-invalid={errors.name ? "true" : "false"}
                        {...register('password', {required: true, maxlength:30})}
                    />
                        {/* use role="alert" to announce the error message */}
                        {errors.password && errors.password.type === "required" && (
                            <Span role="alert">비밀번호를 입력해 주세요</Span>
                        )}
                    </label>
                </li>
                <li>
                    <label>
                        이름 : <input type="text" id="name"  
                        aria-invalid={errors.name ? "true" : "false"}
                        {...register('name', {required: true, maxlength:30})}
                        />
                        {/* use role="alert" to announce the error message */}
                        {errors.name && errors.name.type === "required" && (
                            <Span role="alert">이름을 입력해 주세요</Span>
                        )}
                    </label>
                </li>
                <li>
                    <input type="submit" onClick={ e => handleSubmit(e)} value="회원가입"/>
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