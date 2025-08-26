$(document).ready(function () {
    // Hide the result div initially
    $('#result').hide();

    $("#btn1").click(function (e) {
        e.preventDefault();

        let r = $('input[type="checkbox"]:checked');

        
        if (r.length > 0) {
            
            let finalr = r.length + " checkbox has been checked..<br>"
            r.each(function () { 
                 finalr += $(this).val() + "<br>";
            });
            $('#result').html(finalr).show();
        } else {
            $('#result').html("Plz select your skills!!").show();
        }
    })
});