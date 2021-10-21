const bestItem = document.querySelectorAll('.sec1_best_item');
const mdsItem = document.querySelectorAll('.sec3_mds_item');

for (let i = 0; i < bestItem.length; i++) {
    let best_img = bestItem[i].querySelector('img');
    let best_hoverBlackBox = bestItem[i].querySelector('.hover-black-box');

    bestItem[i].addEventListener('mouseover', () => {
        best_img.style.transform = 'scale(1.2)';
        best_hoverBlackBox.style.display = 'block';
    });
    bestItem[i].addEventListener('mouseout', () => {
        best_img.style.transform = 'scale(1)';
        best_hoverBlackBox.style.display = 'none';
    });
}

for (let i = 0; i < mdsItem.length; i++) {
    let mds_img = mdsItem[i].querySelector('img');
    let mds_hoverBlackBox = mdsItem[i].querySelector('.hover-black-box');

    mdsItem[i].addEventListener('mouseover', () => {
        mds_img.style.transform = 'scale(1.2)';
        mds_hoverBlackBox.style.display = 'block';
    });
    mdsItem[i].addEventListener('mouseout', () => {
        mds_img.style.transform = 'scale(1)';
        mds_hoverBlackBox.style.display = 'none';
    });
}
