const banner = document.querySelector('.hd_banner');
const logo = document.querySelector('.hd_logo');

banner.addEventListener('click', () => {
   location.href = '/goods/7/1';
});

logo.addEventListener('click', () => {
    location.href = '/main';
});

// 스크롤 시 헤더 줄어듬
const scrollEvent = () => {
    const header = document.querySelector('header');
    const hd_center = document.querySelector('.hd_center_wrapper');
    const section = document.querySelector('section');

    if (window.matchMedia("screen and (min-width: 860px)").matches) {
        if (window.scrollY > 0) {
            section.style.paddingTop = '204px';
            header.style.height = '204px';
            hd_center.style.height = '110px';
        } else {
            section.style.paddingTop = '244px';
            header.style.height = '244px';
            hd_center.style.height = '150px';
        }
    } else if (window.matchMedia("screen and (min-width: 770px)").matches) {
        hd_center.style.height = '80px';
        header.style.height = '168px';
        section.style.paddingTop = '168px';
    } else if (window.matchMedia("screen and (max-width: 769px)").matches) {
        hd_center.style.height = '80px';
        header.style.height = '128px';
        section.style.paddingTop = '128px';
    }
}

window.addEventListener('scroll', () => {
    scrollEvent();
});

window.addEventListener('resize', () => {
    scrollEvent();
});


