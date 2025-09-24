$(document).ready(function () {
    // Hide the result div initially
    $('#result').hide();

    $("#btn1").click(function (e) { 
        e.preventDefault();
        let fn = $('#firstname').val();
        $('#firstname').val("");
        let ln = $('#lastname').val();
        $('#lastname').val("");
        let un = $('#uname').val();
        $('#uname').val("");
        let em = $('#email').val();
        $('#email').val("");

        $('#result').html(
            "First name is : " + fn +
            "<br>Last name is : " + ln +
            "<br>User name is :" + un +
            "<br>Email is : " + em
        ).show(); // Show the result div
    });
});