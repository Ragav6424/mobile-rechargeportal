import React from 'react'
import './Service.css';
export default function Service() {
  return ( 
    <div class='service'>
    <div class='ser'>
    <h1><center>service</center></h1>
    <form action="home">
    <div class="input-box">
      <span class="icon"></span>
      <input type="text" required/>
      <label>Mobile no</label>
    </div>
    <div class="input-box">
      <span class="icon"></span>
      <input type="text" required/>
      <label>Plans</label>
    </div>
    <div class="remember-forgot">
      <label><input type="checkbox"/>Confirm</label>
    </div>
    <button type="submit" class="btn">Proceed</button>
    <a href="home" ></a>
  </form>
    </div>
    </div>
    )
}
