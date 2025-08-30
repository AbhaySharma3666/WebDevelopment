$(document).ready(function () {
    $('button').click(function(){
        // $('.mydiv').load("external.txt").toggle();
        // $('.mydiv').load("external.html").toggle();
        $('.mydiv').load("https://jsonplaceholder.typicode.com/users").toggle();
    })
});