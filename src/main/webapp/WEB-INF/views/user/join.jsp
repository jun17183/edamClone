<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h2 class="join-title">회원가입</h2>
<div class="join-box">
    <form action="/user/join" method="POST">
        <div>
            <h3>정보 입력</h3>
            <input type="text" name="username" placeholder="아이디">
            <input type="password" name="password" placeholder="비밀번호">
            <input type="password" name="passwordChk" placeholder="비밀번호 확인">
            <h3>이메일 인증</h3>
            <input type="text" name="email" placeholder="이메일 입력">
            <input type="text" name="emailChkNum" placeholder="인증번호">
        </div>
        <span class="chkIdBtn">중복 확인</span>
        <span class="emailChkBtn">인증번호 전송</span>
    </form>
    <div class="joinBtn">회원가입</div>
</div>