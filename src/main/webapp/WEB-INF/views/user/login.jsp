<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h2 class="login-title">로그인</h2>
<div class="login-box">
    <h3>회원 로그인</h3>
    <form action="/user/login" method="POST">
        <div>
            <input type="text" name="username" placeholder="아이디">
            <input type="password" name="password" placeholder="비밀번호">
        </div>
        <input type="submit" name="submit" value="로그인">
    </form>
    <div class="login-underBtn-box">
        <div>회원가입</div>
        <div>아이디 찾기</div>
        <div>비밀번호 찾기</div>
    </div>
</div>