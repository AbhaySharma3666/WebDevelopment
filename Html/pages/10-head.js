document.addEventListener('DOMContentLoaded', function() {
    alert('Page has loaded!');
    
    const submitButton = document.querySelector('button[type="submit"]');
    if (submitButton) {
        submitButton.addEventListener('click', function(event) {
            event.preventDefault(); // Prevent the form from submitting
            alert('Submit button clicked!');
            alert('Form submission is in progress...');
        });
    }
});