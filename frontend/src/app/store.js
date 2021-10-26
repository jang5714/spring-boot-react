import { configureStore } from '@reduxjs/toolkit';
import { userReducer } from 'features/users';
import counterReducer from '../features/counter/counterSlice';

export const store = configureStore({
  reducer: {
    counter: counterReducer,
    user: userReducer
  },
});
