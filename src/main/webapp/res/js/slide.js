$(function() {

  var slide_item = $('.slide_img>ul>li');
  var curIndex = 0;
  $('.dot_btn').eq(curIndex).css('opacity', 0.95);

  // slide 기능
  function slideController() {
    slide_item.eq(curIndex).fadeOut(1000);

    if (curIndex == 2) {
      slide_item.eq(0).fadeIn(1000);
      curIndex = 0;
    } else {
      slide_item.eq(curIndex+1).fadeIn(1000);
      curIndex++;
    }

    $('.dot_btn').eq(curIndex).css('opacity', 0.95);
    $('.dot_btn').not(':eq(' + curIndex + ')').css('opacity', 0.4);
  }
  
  // setInterval
  setInterval(slideController, 9000);
 
  // dot 버튼 컨트롤러
  $('.dot_btn').click(function() {
    var btnIndex = $(this).index();

    if (curIndex != btnIndex) {
      slide_item.eq(curIndex).fadeOut(1000);
      slide_item.eq(btnIndex).fadeIn(1000);
    }

    curIndex = btnIndex;

    $(this).css('opacity', 0.75);
    $('.dot_btn').not(this).css('opacity', 0.4);
  });


  // prev 버튼 컨트롤러
  $('.slide_leftbtn').click(function() {
    slide_item.eq(curIndex).fadeOut(1000);

    if (curIndex == 0) {
      slide_item.eq(2).fadeIn(1000);
      curIndex = 2;
    } else {
      slide_item.eq(curIndex-1).fadeIn(1000);
      curIndex--;
    }
  });

  // next 버튼 컨트롤러
  $('.slide_rightbtn').click(slideController);

  // prev, next 버튼 hover 
  $('.slide').hover(function() {
    $('.slide_leftbtn').stop().animate({ left: '11vw', opacity: 0.4 });
    $('.slide_rightbtn').stop().animate({ right: '11vw', opacity: 0.4 });
  }, function() {
    $('.slide_leftbtn').stop().animate({ left: '9.5vw', opacity: 0 });
    $('.slide_rightbtn').stop().animate({ right: '9.5vw', opacity: 0 });
  });

});

