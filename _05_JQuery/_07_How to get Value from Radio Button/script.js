$(document).ready(function () {
    // Hide the result div initially
    $('#result').hide();

    $("#btn1").click(function (e) {
        e.preventDefault();
        let output1 = $('input[type="radio"]:checked');

        
        if (output1.length > 0) {
            $('#result').text(output1.val()).show();
        } else {
            $('#result').text("Plz select gender!!").show();
        }
    })
});