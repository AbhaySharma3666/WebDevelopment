<<<<<<< HEAD
$(document).ready(function () {
    var x = $(".mydiv1").html();
    console.log(x);

    // Event on click
    $(".btn").click(function () {
        alert("hello, You click me !!...")
    })

    // on one click
    $(".mydiv1").click(function () {
        $(this).css("color", "red");
        $(".sp1").css("color", "green");
        $(".sp2").css("color", "red");
        $(".sp3").css("color", "red");
        $(this).css("background-color", "black");
        $(this).css("padding", "10px");
    });

    // on double-click
    $(".mydiv1").dblclick(function () {
        $("h2").css("color", "green");
        $(".sp1").css("color", "red");
        $(".sp2").css("color", "green");
        $(".sp3").css("color", "red");
        $(this).css("border", "5px solid blue");
        $(this).css("border-radius", "10px");
        $(this).css("padding", "10px");
    });

    // on right click
    $(".mydiv1").contextmenu(function () {
        $("h2").css("color", "green");
        $(".sp1").css("color", "black");
        $(".sp2").css("color", "black");
        $(".sp3").css("color", "green");
        $(this).css("border", "5px solid blue");
        $(this).css("border-radius", "10px");
        $(this).css("padding", "10px");
        $(this).css("width", "250px");
    });

    // on hover 
    $(".mydiv1").mouseenter(function () {
        $(this).css("background-color", "cyan");
        $(this).css('width' , " 550px");
        $(this).css("border", "5px dotted red");
    });
    // leave hover
    $(".mydiv1").mouseleave(function () {
        $(this).css("background-color", "");
        $(this).css('width' , "100%");
        $(this).css("border", "");
    });
    // any key press
    $("body").keypress(function () {
        $(this).css("background-color", "grey");
    });
=======
$(document).ready(function () {
    var x = $(".mydiv1").html();
    console.log(x);

    // Event on click
    $(".btn").click(function () {
        alert("hello, You click me !!...")
    })

    // on one click
    $(".mydiv1").click(function () {
        $(this).css("color", "red");
        $(".sp1").css("color", "green");
        $(".sp2").css("color", "red");
        $(".sp3").css("color", "red");
        $(this).css("background-color", "black");
        $(this).css("padding", "10px");
    });

    // on double-click
    $(".mydiv1").dblclick(function () {
        $("h2").css("color", "green");
        $(".sp1").css("color", "red");
        $(".sp2").css("color", "green");
        $(".sp3").css("color", "red");
        $(this).css("border", "5px solid blue");
        $(this).css("border-radius", "10px");
        $(this).css("padding", "10px");
    });

    // on right click
    $(".mydiv1").contextmenu(function () {
        $("h2").css("color", "green");
        $(".sp1").css("color", "black");
        $(".sp2").css("color", "black");
        $(".sp3").css("color", "green");
        $(this).css("border", "5px solid blue");
        $(this).css("border-radius", "10px");
        $(this).css("padding", "10px");
        $(this).css("width", "250px");
    });

    // on hover 
    $(".mydiv1").mouseenter(function () {
        $(this).css("background-color", "cyan");
        $(this).css('width' , " 550px");
        $(this).css("border", "5px dotted red");
    });
    // leave hover
    $(".mydiv1").mouseleave(function () {
        $(this).css("background-color", "");
        $(this).css('width' , "100%");
        $(this).css("border", "");
    });
    // any key press
    $("body").keypress(function () {
        $(this).css("background-color", "grey");
    });
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
})