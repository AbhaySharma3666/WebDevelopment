import { useNavigate } from 'react-router-dom';
import { useState, useEffect } from 'react';

function DisplayPage() {
  const navigate = useNavigate();
  const [data, setData] = useState([]);

  useEffect(() => {
    fetchData();
  }, []);

  //  Fetch data from API
  async function fetchData() {
    try {
      const response = await fetch('http://localhost:3000/students');
      if (!response.ok) {
        throw new Error('Failed to fetch data');
      }
      const result = await response.json();
      setData(result);
    } catch (error) {
      console.error('Error fetching data:', error);
      alert('Error fetching data. Please check your server.');
    }
  }

  //  Delete record from API server + update UI
  const deleteData = async (id) => {
    const confirmDelete = window.confirm('Are you sure you want to delete this record?');
    if (!confirmDelete) return;

    try {
      const response = await fetch(`http://localhost:3000/students/${id}`, {
        method: 'DELETE',
      });

      if (response.ok) {
        // Remove from local state
        setData((prev) => prev.filter((item) => item.id !== id));
        alert(' Data deleted successfully!');
      } else {
        alert(' Failed to delete data from server.');
      }
    } catch (error) {
      console.error('Error deleting data:', error);
      alert('Error deleting data. Please check your connection.');
    }
  };

  const editData = (id) => {
    navigate(`/edit/${id}`);
  };

  return (
    <>
      <h2 className="text-center text-primary mt-4">Fetching Data from API</h2>
      <br />
      <table className="table table-hover mx-auto w-50">
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th colSpan="2" className="text-center">
              Action
            </th>
          </tr>
        </thead>
        <tbody>
          {data.length > 0 ? (
            data.map((item) => (
              <tr key={item.id}>
                <td>{item.id}</td>
                <td>{item.name}</td>
                <td>{item.email}</td>
                <td>
                  <button
                    onClick={() => deleteData(item.id)}
                    className="btn btn-danger"
                  >
                    Delete
                  </button>
                </td>
                <td>
                  <button
                    onClick={() => editData(item.id)}
                    className="btn btn-warning"
                  >
                    Edit
                  </button>
                </td>
              </tr>
            ))
          ) : (
            <tr>
              <td colSpan="5" className="text-center text-muted">
                No data available
              </td>
            </tr>
          )}
        </tbody>
      </table>
    </>
  );
}

export default DisplayPage;
