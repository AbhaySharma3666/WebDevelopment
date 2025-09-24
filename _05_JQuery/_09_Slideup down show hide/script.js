<<<<<<< HEAD
$(document).ready(function () {
    $('li').css("color", "cyan").slideUp(3000).slideDown(3000)
    // $('li').slideUp(3000);
    // $('li').slideDown(3000);

    $('#showbtn').click(function () {
        $('.box').show();
    })

    $('#hidebtn').click(function () {
        $('.box').hide();
    })

    $('#togglebtn').click(function () {
        $(".box").toggle();
    })

    $('.errordiv').hide();
    $('.successdiv').hide();
    $("#myform").on("submit", function (e) {
        e.preventDefault();
        const un = $('#uname').val().trim();

        if (un.length < 5) {
            $('.errordiv').show();
            $('.successdiv').hide();
        } else {
            $('.errordiv').hide();
            $('.successdiv').show();
        }
    })
=======
$(document).ready(function () {
    $('li').css("color", "cyan").slideUp(3000).slideDown(3000)
    // $('li').slideUp(3000);
    // $('li').slideDown(3000);

    $('#showbtn').click(function () {
        $('.box').show();
    })

    $('#hidebtn').click(function () {
        $('.box').hide();
    })

    $('#togglebtn').click(function () {
        $(".box").toggle();
    })

    $('.errordiv').hide();
    $('.successdiv').hide();
    $("#myform").on("submit", function (e) {
        e.preventDefault();
        const un = $('#uname').val().trim();

        if (un.length < 5) {
            $('.errordiv').show();
            $('.successdiv').hide();
        } else {
            $('.errordiv').hide();
            $('.successdiv').show();
        }
    })
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
});