<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<img id="background_fixed_img" src="/res/img/background/background_fixed_img.jpg" />
<div class="slide">
    <div class="slide_img">
        <ul>
            <li class="slide_list1">
                <img src="/res/img/slide/slide_item_1.jpg" alt="IU 이미지1">
            </li>
            <li class="slide_list2">
                <img src="/res/img/slide/slide_item_2.jpg" alt="IU 이미지2">
                <span class="slide_text1">The Present I, II</span>
            </li>
            <li class="slide_list3">
                <img src="/res/img/slide/slide_item_3.jpg" alt="IU 이미지3">
                <span class="slide_text2">APRIL,</span>
                <span class="slide_text3">2020</span>
            </li>
        </ul>
        <div class="slide_btn1">
            <span class="dot_btn"></span>
            <span class="dot_btn"></span>
            <span class="dot_btn"></span>
        </div>
        <div class="slide_leftbtn">
                <img src="/res/img/slide/btn_prev.png" alt="왼쪽 버튼" onclick="">
        </div>
        <div class="slide_rightbtn">
                <img src="/res/img/slide/btn_next.png" alt="오른쪽 버튼" onclick="">
        </div>
    </div>
</div>
<div class="section_1_wrap">
    <div class="section_1">
        <div class="sec1_new_title">NEW PRODUCT</div>
        <div class="sec1_new_list">
            <c:forEach items="${requestScope.newList}" var="item">
                <div class="sec1_new_item">
                    <div><img src="${item.src}"></div>
                    <span>${item.nm}</span>
                    <span>${item.price}</span>
                </div>
            </c:forEach>
        </div>
        <div class="sec1_best_title">BEST PRODUCT</div>
        <div class="sec1_best_list">
            <c:forEach items="${requestScope.bestList}" var="item">
                <div class="sec1_best_item">
                    <div>
                        <img src="${item.src}">
                        <div class="hover-black-box">
                                ${item.nm}<br>
                                ${item.price}
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</div>
<div class="section_2">
    <img src="/res/img/background/section_empty_text_test.png" alt="">
    <!-- <div class="sec2_img"></div> -->
</div>
<div class="section_3_wrap">
    <div class="section_3">
        <div class="sec3_mds_title">MDs PICK</div>
        <div class="sec3_mds_list">
            <c:forEach items="${requestScope.mdsList}" var="item">
                <div class="sec3_mds_item">
                    <div>
                        <img src="${item.src}">
                        <div class="hover-black-box">
                            ${item.nm}<br>
                            ${item.price}
                        </div>
                    </div>

                </div>
            </c:forEach>
        </div>
        <div class="sec3_steady_title">STEADY SELLER</div>
        <div class="sec3_steady_list">
            <c:forEach items="${requestScope.steadyList}" var="item">
                <div class="sec3_steady_item">
                    <div><img src="${item.src}"></div>
                    <span>${item.nm}</span>
                    <span>${item.price}원</span>
                </div>
            </c:forEach>
        </div>
    </div>
</div>
