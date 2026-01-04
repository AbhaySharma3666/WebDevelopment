
import { Link, Outlet } from "react-router"
import './Navbar.css'

function Navbar() {
  return (
    <>
      <div className="header">
        <div>
          <Link className="logo" to={'/'}>Company Logo</Link>
        </div>
        <div>
          <ul>
            <li><Link to={'/'}>HOME</Link></li>
            <li><Link to={'/about'}>ABOUT</Link></li>
            <li><Link to={'/contact'}>CONTACT</Link></li>
            <li><Link to={'/users'}>Users</Link></li>
            <li><Link to={'/login'}>LOGIN</Link></li>
          </ul>
        </div>
      </div>
      <Outlet />
    </>
  )
}

export default Navbar