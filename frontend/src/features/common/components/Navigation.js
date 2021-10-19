import React, { useState } from 'react';
// import { useSelector, useDispatch } from 'react-redux';
// import {
//   decrement,
//   increment,
//   incrementByAmount,
//   incrementAsync,
//   incrementIfOdd,
//   selectCount,
// } from '../counterSlice';
import { Link } from 'react-router-dom'
import styled from 'styled-components'


export default function Navigation() {
  
  return (
    <Nav>
        <NavList>
            <NavItem><Link to="home">Home</Link></NavItem>
            <NavItem><Link to="useradd">UserAdd</Link></NavItem>
            <NavItem><Link to="userdetail">UserDetail</Link></NavItem>
            <NavItem><Link to="userlist">UserList</Link></NavItem>
            <NavItem><Link to="userlogin">UserLogin</Link></NavItem>
            <NavItem><Link to="usermodify">UserModify</Link></NavItem>
            <NavItem><Link to="userremove">UserRemove</Link></NavItem>
        </NavList>
    </Nav>
  );
}

const Nav = styled.div`
    width: 100%;
    height: 30px;
    border-bottom: 1px solid #d1d8e4;
    color: white;
    z-index: 5;
    margin-bottom: 100px
`

const NavList = styled.ul`
    width: 1080px;
    display: flex;
    margin: 0 auto;
    color: white;
`

const NavItem = styled.li`
    width: auto;
    margin-left: 18px;
    margin-top: 5px;
    display: flex;
    color: white;
`