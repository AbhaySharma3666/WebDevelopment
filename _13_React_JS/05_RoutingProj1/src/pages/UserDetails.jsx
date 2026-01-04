import React from 'react'
import { Link, useParams } from 'react-router'

function UserDetails() {
    const {id} = useParams();

  return (
    <>
        <Link to={'/users'}>Go To to Users Page </Link>
        <h2>User Details :</h2>
        <p>You are viewing the details of User id : <strong>{id}</strong></p>
    </>
  )
}

export default UserDetails