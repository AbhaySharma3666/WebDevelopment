import { Routes, Route, Link } from 'react-router'
import Home from './pages/Home'
import About from './pages/About'
import Contact from './pages/Contact'
import PageNotFound from './pages/PageNotFound'
import Navbar from './pages/Navbar'
import Login from './pages/Login'
import Admin from './pages/Admin'
import Employee from './pages/Employee'
import Freelancer from './pages/Freelancer'
import User from './pages/User'
import UserDetails from './pages/UserDetails'

function App() {


  return (
    <>
      <Routes>
          <Route element={< Navbar />} >
            <Route path='/' element={<Home />} />
            <Route path='/about' element={<About />} />
            <Route path='/contact' element={<Contact />} />
            <Route path='/users' element={<User />} />
            <Route path='/users/:id' element={<UserDetails />} />
          </Route>

        <Route path='/login' element={<Login />} >
          <Route path='admin' element={<Admin />} />
          <Route path='employee' element={<Employee />} />
          <Route path='freelancer' element={<Freelancer />} />
        </Route>
        <Route path='/*' element={<PageNotFound />} />
      </Routes>

    </>
  )
}

export default App
