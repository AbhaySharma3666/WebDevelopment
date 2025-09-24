<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow-lg">
        <div class="card-header bg-primary text-white">
            <h3>Submitted Student Details</h3>
        </div>
        <div class="card-body">
            <table class="table table-hover table-bordered text-center align-middle">
               <thead class="table-primary">
                <tr>
                    <th>Name</th>
                    <th>Mother's Name</th>
                    <th>Father's Name</th>
                    <th>Gender</th>
                    <th>Date of Birth</th>
                    <th>Course</th>
                    <th>Email</th>
                    <th>Street</th>
                    <th>City</th>
                    <th>State</th>
                    <th>Pin Code</th>
                </tr>
               </thead>
               <tbody>
               		<tr>
               			<td>${student.name}</td>
                    	<td>${student.motherName}</td>
                    	<td>${student.fatherName}</td>
                    	<td>${student.gender}</td>
                    	<td>${student.dob}</td>
                    	<td>${student.course}</td>
                    	<td>${student.email}</td>
                    	<td>${student.address.street}</td>
                    	<td>${student.address.city}</td>
                    	<td>${student.address.state}</td>
                    	<td>${student.address.pincode}</td>
                	</tr>
               </tbody>
            </table>
            <a href="register" class="btn btn-secondary">Register Another Student</a>
        </div>
    </div>
</div>

</body>
</html>
