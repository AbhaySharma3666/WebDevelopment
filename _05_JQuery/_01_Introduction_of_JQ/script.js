// all document is loaded then JQuery run 

$(document).ready(function () {
    // select h1 tag then style (attribute , value)
    $("h1").css("color", "red");

    // group selector
    $("h2,h3").css("color", "blue");

    // universal setector *
    $("*").css("font-size", "16px");

    //class selector
    $(".para1").css("color", "green");

    // id selector
    $("#para2").css("color", "cyan");

})