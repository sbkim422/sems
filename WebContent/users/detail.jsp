<%@page import="users.UsersVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>사용자상세정보</title>
</head>
<body>
<jsp:include page="/header.jsp"/>
<h1>사용자 상세정보(jsp)</h1>
<table border='1'>
<tr>
  <th>번호</th>
  <td>${users.no}</td>
</tr>
<tr>
  <th>이메일</th>
  <td>${users.email}</td>
</tr>
<tr>
  <th>암호</th>
  <td>${users.password}</td>
</tr>
<tr>
  <th>이름</th>
  <td><a href='../file/test01.jsp'>${users.name}</a></td>
</tr>
<tr>
  <th>전화번호</th>
  <td>${users.tel}</td>
</tr>
<tr>
  <th>팩스</th>
  <td>${users.fax}</td>
</tr>
<tr>
  <th>우편번호</th>
  <td>${users.postno}</td>
</tr>
<tr>
  <th>주소</th>
  <td>${users.address}</td>
</tr>
<tr>
  <th>웹주소</th>
  <td>${users.photpath}</td>
</tr>

</table>
<a href='list.bit?pageNo=1&pageSize=10'>목록</a> 
<a href='delete.bit?no=${users.no}'>삭제</a> 
<a href='update.bit?no=${users.no}'>변경</a><br>
<jsp:include page="/footer.jsp"/>
</body>
</html>