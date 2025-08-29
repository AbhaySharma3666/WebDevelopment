$(document).ready(function () {
    $(".faq h3").on("click",function(){
        const answer = $(this).next("p");

        $(".faq p").not(answer).slideUp();
        answer.slideToggle();
    });
});