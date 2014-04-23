<%@page import="users.UsersVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
<form action="upload.bit" method="post"
  enctype="multipart/form-data">
이름: ${users.name} <br>
이메일: ${users.email} <br>
파일업로드: <input type="file" name="file1"><br>
<input type="submit" value="파일업로드">
</form>
</body>
</html>