<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>jQuery UI Accordion - No auto height</title>
	<link rel="stylesheet" href="../../themes/base/jquery.ui.all.css">
	<script src="../../jquery-1.10.2.js"></script>
	<script src="../../ui/jquery.ui.core.js"></script>
	<script src="../../ui/jquery.ui.widget.js"></script>
	<script src="../../ui/jquery.ui.accordion.js"></script>
	<link rel="stylesheet" href="../demos.css">
	<script>
	$(function() {
		$( "#accordion" ).accordion({
			heightStyle: "content"
		});
	});
	</script>
</head>
<body>
<jsp:include page="/header.jsp"/>
<div id="accordion">
	<h3>과목관리</h3>
	<div>
	<a href="../../../subject/list.bit?pageNo=1&pageSize=10">과목관리</a>
	</div>
	<h3>과정관리</h3>
	<div>
	<a href="../../../cours/list.bit?pageNo=1&pageSize=10">과정관리</a>
	</div>
	<h3>사용자관리</h3>
	<div>
	 <a href="../../../users/list.bit?pageNo=1&pageSize=10">사용자관리</a><br>
	</div>
</div>

<jsp:include page="/footer.jsp"/>
</body>
</html>
