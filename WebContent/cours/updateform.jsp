<%@page import="cours.CoursVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset='UTF-8'>
	<title>과정 변경폼</title>
</head>
<body>
<jsp:include page="/header.jsp"/>
<h1>과정 변경(JSP, JSP Action Tag)</h1>
<form action='update.bit' method='post'>
번호: <input type='text' name='no' 
                        value='${cours.no}' readonly><br>
과정명: <input type='text' name='title' 
                         value='${cours.title}'><br>
설명: <textarea name='description' rows='10' cols='80'>${cours.description}</textarea><br>
과정시간: <input type='text' name='hours' 
                         value='${cours.hours}'><br>
<input type='submit' value='변경'>
<input type='button' value='취소'
        onclick="location.href='detail.bit?no=${cours.no}'">
</form>
<c:set var="studyClass" value="Java48$$" scope="request"/>
<jsp:include page="/footer.jsp"/>
</body>
</html>


