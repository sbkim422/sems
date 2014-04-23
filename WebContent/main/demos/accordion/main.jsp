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

<div id="accordion">
  <h2>과목 관리</h2>
  <div>
    <p><a href="http://localhost:9999/sems0/subject/list.bit?pageNo=1&pageSize=10">과목 목록</a></p>
  </div>
  <h2>과정 관리</h2>
  <div>
    <p><a href="http://localhost:9999/sems0/cours/list.bit?pageNo=1&pageSize=10">과정 목록</a></p>
  </div>
  <h2>사용자 관리</h2>
  <div>
    <p><a href="http://localhost:9999/sems0/users/list.bit?pageNo=1&pageSize=10">사용자 목록</a></p>
  </div>
</div>
<jsp:include page="/footer.jsp"/>
</body>
</html>