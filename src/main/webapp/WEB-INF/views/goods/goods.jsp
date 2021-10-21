<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="goods">
    <div class="goods-top-section">
        <span>HOME    >    </span>
        <div class="top-select-box">${requestScope.nowSort.sort}
            <span class="top-select-box-btn"></span>
            <div class="top-select-dropdown">
                <c:forEach items="${requestScope.sort}" var="item">
                    <a href="/goods/${item.sort_id}/1">${item.sort}</a>
                </c:forEach>
            </div>
        </div>
        <div class="top-title">${requestScope.list[0].sort}</div>
        <img src="${banner}">
    </div>
    <div class="goods-middle-section">
        <div class="middle-count">상품  <b>${requestScope.count}</b> 개</div>
        <div class="middle-orderby">
            <a href="/goods/${requestScope.nowSort.sort_id}/1">판매인기순</a>
            <a href="/goods/${requestScope.nowSort.sort_id}/2">높은가격순</a>
            <a href="/goods/${requestScope.nowSort.sort_id}/3">낮은가격순</a>
        </div>
        <div class="middle-list">
            <c:forEach items="${requestScope.list}" var="item">
                <div class="middle-list-item">
                    <div><img src="${item.src}"></div>
                    <span>${item.nm}</span>
                    <span>${item.price}원</span>
                </div>
            </c:forEach>
        </div>
    </div>
</div>