import React from 'react'
// import './External_CSS.css'; // it's Global CSS
import style from './External_CSS.module.css'; // paticular page css 
 
function External_CSS() {
  return (
    // <div className='heading'>
    <div className={style.heading}>
    <h3>
        External CSS
    </h3>
    </div>
  )
}

export default External_CSS