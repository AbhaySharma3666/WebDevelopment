import { Routes, Route , Link} from 'react-router-dom'
import DisplayPage from './Pages/DisplayPage'
import AddNewData from './Pages/AddNewData'
import EditPage from './Pages/EditPage'

function App() {
  

  return (
    <>
      <div className='container text-center  mt-3'>
        <Link className='btn btn-primary me-5' to='/'>Display Data</Link>
        <Link className='btn btn-secondary' to='/add'>Add New Data</Link>
      </div>

      <Routes>
        <Route path='/' element={<DisplayPage/>}/>
        <Route path='/add' element={<AddNewData/>}/>
        <Route path='/edit/:id' element={<EditPage/>}/>
      </Routes>
    </>
  )
}

export default App
