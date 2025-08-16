$(document).ready(function () {
    // Focus and blur effects
    $('#name, #email, #city').on({
        focus: function () {
            $(this).css({
                "background-color": "cyan",
                "color": "brown"
            });
        },
        blur: function () {
            $(this).css({
                "background-color": "",
                "color": ""
            });
        }
    });

    // Form submission
    $("#myform").on('submit', function (e) {
        e.preventDefault();

        const formData = {
            name: $('#name').val().trim(),
            email: $('#email').val().trim(),
            city: $('#city').val()
        };

        if (!formData.name || !formData.email || !formData.city) {
            alert('Please fill all fields');
            return;
        }

        alert(`Name: ${formData.name}\nEmail: ${formData.email}\nCity: ${formData.city}`);
    });
});