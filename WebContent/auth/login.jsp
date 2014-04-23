<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<h1>로그인</h1>
<form action="login.bit" method="post">
<!-- 이메일: <input type="text" name="email" value="${loginEmail}"/><br> 구방식 -->
이메일: <input type="text" name="email" value="${cookie.loginEmail.value}"/><br>
암호: <input type="password" name="password"/><br>
 <!-- 이부분은 서버에서 출력함 html에선 사용되지 않음 -->
<input type="checkbox" name ="saveEmail"

<c:if test="${cookie.loginEmail != null}">checked</c:if>

>이메일 저장<br>
<input type="submit" value="로그인"><br>
</form>
</body>
</html>