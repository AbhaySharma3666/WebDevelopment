document.addEventListener("DOMContentLoaded", () => {
  const form = document.getElementById("regForm");

  form.addEventListener("submit", function (e) {
    e.preventDefault(); // stop form from submitting until validation passes

    let isValid = true;

    // Clear previous errors
    document.querySelectorAll(".error").forEach(el => el.textContent = "");
    document.querySelectorAll(".error-field").forEach(el => el.classList.remove("error-field"));

    // First Name
    const fname = document.getElementById("fname");
    if (fname.value.trim() === "") {
      document.getElementById("fnameError").textContent = "First name is required";
      fname.classList.add("error-field");
      isValid = false;
    }

    // Last Name
    const lname = document.getElementById("lname");
    if (lname.value.trim() === "") {
      document.getElementById("lnameError").textContent = "Last name is required";
      lname.classList.add("error-field");
      isValid = false;
    }

    // Email
    const email = document.getElementById("email");
    const emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
    if (!email.value.match(emailPattern)) {
      document.getElementById("emailError").textContent = "Enter a valid email";
      email.classList.add("error-field");
      isValid = false;
    }

    // Password
    const password = document.getElementById("password");
    if (password.value.length < 6) {
      document.getElementById("passwordError").textContent = "Password must be at least 6 characters";
      password.classList.add("error-field");
      isValid = false;
    }

    // Gender
    const gender = document.querySelector('input[name="gender"]:checked');
    if (!gender) {
      document.getElementById("genderError").textContent = "Please select a gender";
      isValid = false;
    }

    // Skills (at least 1 required)
    const skills = document.querySelectorAll('input[name="skills"]:checked');
    if (skills.length === 0) {
      document.getElementById("skillsError").textContent = "Select at least one skill";
      isValid = false;
    }

    // City
    const city = document.getElementById("city");
    if (city.value === "") {
      document.getElementById("cityError").textContent = "Please select a city";
      city.classList.add("error-field");
      isValid = false;
    }

    // If valid -> submit form (for demo we’ll alert)
    if (isValid) {
      alert("Form submitted successfully!");
      form.reset();
    }
  });
});
