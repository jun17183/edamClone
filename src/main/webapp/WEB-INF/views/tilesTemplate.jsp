<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>made EDAM</title>
    <link rel="stylesheet" href="/res/css/main.css">
    <link rel="stylesheet" href="/res/css/header.css">
    <link rel="stylesheet" href="/res/css/footer.css">
    <link rel="stylesheet" href="/res/css/section.css">
    <link rel="stylesheet" href="/res/css/sidebar.css">
    <link rel="stylesheet" href="/res/css/slide.css">
    <link rel="stylesheet" href="/res/css/goods.css">
    <link rel="stylesheet" href="/res/css/login.css">
    <link rel="stylesheet" href="/res/css/join.css">
    <link rel="shortcut icon" type="image/x-icon" href="/res/icon/edam.ico">
    <link rel="icon" type="image/x-icon" href="/res/icon/edam.ico">
<%--    <link rel="stylesheet" href="/res/css/<tiles:getAsString name="res"/>.css">--%>
    <script defer src="/res/js/header.js"></script>
    <script defer src="/res/js/main.js"></script>
    <script defer src="/res/js/slide.js"></script>
    <script defer src="/res/js/goods.js"></script>
    <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<%--    <script defer src="/res/js/<tiles:getAsString name="res"/>.js"></script>--%>
</head>
<body>
    <div id="container">
        <tiles:insertAttribute name="header" />
        <section>
            <tiles:insertAttribute name="content" />
        </section>
        <tiles:insertAttribute name="footer" />
    </div>
</body>
</html>
