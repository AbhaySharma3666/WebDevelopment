
import { Link, Outlet } from 'react-router';
import './Login.css';

function Login() {
    return (
        <>
            <div className='main' style={{ textAlign: 'center' }}>
                <h1>It's login page.</h1>
                <div>
                    <Link className='link' to={"/"}>Go To Home Page</Link>
                    <Link className='link' to={'admin'}>Admin</Link>
                    <Link className='link' to={'employee'}>Employee</Link>
                    <Link className='link' to={'freelancer'}>Freelancer</Link>
                    <Outlet />
                </div>
            </div>
        </>
    )
}

export default Login;