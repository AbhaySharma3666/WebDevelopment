document.addEventListener('DOMContentLoaded', function() {
    const searchInput = document.querySelector('main input');

    searchInput.addEventListener('focus', function() {
        searchInput.style.borderColor = '#ff0000'; // Red theme
    });

    searchInput.addEventListener('blur', function() {
        searchInput.style.borderColor = '#ccc';
    });

    // Add more animations or front-end JavaScript as needed
});