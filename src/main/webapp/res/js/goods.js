const selectBox = document.querySelector('.top-select-box');
const select_dropdown = document.querySelector('.top-select-dropdown');

selectBox.addEventListener('mouseover', () => {
    select_dropdown.style.display = 'inline-block';
})

selectBox.addEventListener('mouseout', () => {
    select_dropdown.style.display = 'none';
})