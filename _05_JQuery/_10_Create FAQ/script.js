<<<<<<< HEAD
$(document).ready(function () {
    $(".faq h3").on("click",function(){
        const answer = $(this).next("p");

        $(".faq p").not(answer).slideUp();
        answer.slideToggle();
    });
=======
$(document).ready(function () {
    $(".faq h3").on("click",function(){
        const answer = $(this).next("p");

        $(".faq p").not(answer).slideUp();
        answer.slideToggle();
    });
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
});