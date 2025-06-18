document.addEventListener('DOMContentLoaded', function() {
    const form = document.querySelector('form');
    const submitButton = document.querySelector('button[type="submit"]');

    if (form && submitButton) {
        form.addEventListener('submit', function(event) {
            event.preventDefault();
            
            // Disable button and show loading state
            submitButton.disabled = true;
            submitButton.textContent = 'Submitting...';

            // Simulate form submission (replace with actual submission logic)
            setTimeout(() => {
                alert('Form submitted successfully!');
                form.reset();
                
                // Reset button state
                submitButton.disabled = false;
                submitButton.textContent = 'Submit';
            }, 1000);
        });
    }
});