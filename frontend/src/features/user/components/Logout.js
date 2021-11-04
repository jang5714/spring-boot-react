import React, { useState, useEffect, useCallback } from 'react';
import { useHistory } from 'react-router-dom';
import axios from 'axios';
import { useDispatch } from 'react-redux';


const Logout = () => {
    const history = useHistory()
    return <button
    onClick = { e => {
        e.preventDefault()
        e.stopPropagation()
        localStorage.clear(e)
        history.push('/')
        
        }}> 로그아웃
    </button>}

export default Logout