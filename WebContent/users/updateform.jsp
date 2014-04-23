<%@page import="users.UsersVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset='UTF-8'>
	<title>사용자 변경폼</title>
</head>
<body>
<jsp:include page="/header.jsp"/>
<h1>사용자 변경(JSP, JSP Action Tag)</h1>
<form action='update.bit' method='post'>
번호: <input type='text' name='no' 
                        value='${users.no}' readonly><br>
이메일: <input type='text' name='email' 
                         value='${users.email}'><br>
암호: <input type='text' name='password' 
                         value='${users.password}'><br>                         
이름: <input type='text' name='name' 
                         value='${users.name}'><br>
전화: <input type='text' name='tel' 
                         value='${users.tel}'><br>
팩스: <input type='text' name='fax' 
                         value='${users.fax}'><br>
우편번호: <input type='text' name='postno' 
                         value='${users.postno}'><br>
주소: <input type='text' name='address' 
                         value='${users.address}'><br>
웹주소: <input type='text' name='photpath' 
                         value='${users.photpath}'><br>
<input type='submit' value='변경'>
<input type='button' value='취소'
        onclick="location.href='detail.bit?no=${users.no}'">
</form>
<c:set var="studyClass" value="Java48$$" scope="request"/>
<jsp:include page="/footer.jsp"/>
</body>
</html>


