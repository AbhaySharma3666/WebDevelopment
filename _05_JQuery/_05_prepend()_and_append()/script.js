
$(document).ready(function () {
    $(".addtotop").click(function () {
        $(".mylistcontainer").prepend("<li>My List1</li>");
    });

    $(".addtoend").click(function () {
        $(".mylistcontainer").append("<li>My List end</li>");
    });

    // comment btn
    

    $(".addtotop1").click(function () {
        let newcom = $("#newcomment").val();
        if (newcom.trim != "") {
            $("#mycontainer").prepend('<div class="mydiv">' + newcom + '</div>');

            $("#newcomment").val("");
        }else{
            alert("Please enter comment...");
        }
    });

    $(".addtoend1").click(function () {
        let newcom = $("#newcomment").val();
        if (newcom.trim != "") {
            $("#mycontainer").append('<div class="mydiv">' + newcom + '</div>');
        }else{
            alert("Please enter comment...");
        }
        $("#newcomment").val("");
    });

});