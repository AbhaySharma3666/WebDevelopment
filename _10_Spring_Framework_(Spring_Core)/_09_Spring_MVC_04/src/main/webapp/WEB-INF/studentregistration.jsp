<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Student Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <style>
      .card-registration .select-input.form-control[readonly]:not([disabled]) {
        font-size: 1rem;
        line-height: 2.15;
        padding-left: .75em;
        padding-right: .75em;
      }
      .card-registration .select-arrow {
        top: 13px;
      }
    </style>
  </head>
  <body class="bg-dark">
    
    <section class="h-100">
      <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
          <div class="col">
            <div class="card card-registration my-4 shadow-lg">
              <div class="row g-0">
                <div class="col-xl-6 d-none d-xl-block">
                  <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img4.webp"
                       alt="Sample photo" class="img-fluid"
                       style="border-top-left-radius: .25rem; border-bottom-left-radius: .25rem;" />
                </div>
                <div class="col-xl-6">
                  <div class="card-body p-md-5 text-black">
                    <h3 class="mb-5 text-uppercase">Student Registration Form</h3>

                    <!-- Wrap form -->
                    <form action="showresult" method="post">

                      <!-- Name fields -->
                      <div class="row">
                        <div class="mb-4">
                          <label class="form-label" for="Name">Name</label>
                          <input type="text" name="name" id="name" class="form-control form-control-lg" placeholder="Enter your name" required />
                        </div>          

                      <!-- Parents -->
                      <div class="row">
                        <div class="col-md-6 mb-4">
                          <label class="form-label" for="motherName">Mother's name</label>
                          <input type="text" name="motherName" id="motherName" class="form-control form-control-lg" placeholder="Enter mother name" required />
                        </div>
                        <div class="col-md-6 mb-4">
                          <label class="form-label" for="fatherName">Father's name</label>
                          <input type="text" name="fatherName" id="fatherName" class="form-control form-control-lg" placeholder="Enter father name" required />
                        </div>
                      </div>

                      <!-- Address -->
					<div class="mb-4">
					  <label class="form-label" for="addressStreet">Street</label>
					  <input type="text" name="address.street" id="addressStreet" class="form-control form-control-lg" placeholder="Enter your street" required/>
					</div>
					
					<!-- State & City,  Pincode -->
					<div class="row">
					  <div class="col-md-6 mb-4">
					    <label class="form-label" for="city">City</label>
					    <select name="address.city" id="city" class="form-select form-select-lg">
					      <option selected disabled>Choose...</option>
					      <option>City 1</option>
					      <option>City 2</option>
					      <option>City 3</option>
					    </select>
					  </div>
					  <div class="col-md-6 mb-4">
					    <label class="form-label" for="state">State</label>
					    <select name="address.state" id="state" class="form-select form-select-lg">
					      <option selected disabled>Choose...</option>
					      <option>State 1</option>
					      <option>State 2</option>
					      <option>State 3</option>
					    </select>
					  </div>
					</div>

					<!-- Pincode -->
					<div class="col-md-6 mb-4">
					  <label class="form-label" for="pincode">Pincode</label>
					  <input type="text" name="address.pincode" id="pincode" class="form-control form-control-lg" placeholder="Enter pincode" />
					</div>
					
					<!-- DOB -->
					 <div class="col-md-6 mb-4">
                        <label class="form-label" for="dob">DOB</label>
                        <input type="text" name="dob" id="dob" class="form-control form-control-lg" placeholder="Enter DOB(dd/mm/yyyy)" required/>
                      </div>

                      <!-- Gender -->
                      <div class="d-md-flex justify-content-start align-items-center mb-4 py-2">
                        <h6 class="mb-0 me-4">Gender: </h6>
                        <div class="form-check form-check-inline">
                          <input class="form-check-input" type="radio" name="gender" id="femaleGender" value="Female">
                          <label class="form-check-label" for="femaleGender">Female</label>
                        </div>
                        <div class="form-check form-check-inline">
                          <input class="form-check-input" type="radio" name="gender" id="maleGender" value="Male">
                          <label class="form-check-label" for="maleGender">Male</label>
                        </div>
                        <div class="form-check form-check-inline">
                          <input class="form-check-input" type="radio" name="gender" id="otherGender" value="Other">
                          <label class="form-check-label" for="otherGender">Other</label>
                        </div>
                      </div>

                      <!-- DOB, Course, Email -->
                     
                      <div class="mb-4">
                        <label class="form-label" for="course">Course</label>
                        <input type="text" name="course" id="course" class="form-control form-control-lg" placeholder="Enter your course"/>
                      </div>
                      <div class="mb-4">
                        <label class="form-label" for="email">Email ID</label>
                        <input type="email" name="email" id="email" class="form-control form-control-lg" placeholder="Enter your email"/>
                      </div>

                      <!-- Buttons -->
                      <div class="d-flex justify-content-end pt-3">
                        <button type="reset" class="btn btn-light btn-lg">Reset all</button>
                        <button type="submit" class="btn btn-warning btn-lg ms-2">Submit form</button>
                      </div>

                    </form>
                    <!-- Form ends here -->

                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
  </body>
</html>
