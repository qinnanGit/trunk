<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-2.1.3.min.js"></script>
<script type="text/javascript" src="js/vue.js"></script>
<script type="text/javascript" src="js/vue-resource.js"></script>
<link rel="stylesheet" href="css/bootstrap-3.3.2.min.css" type="text/css"/>
<link rel="stylesheet" href="css/multiple-select.css" type="text/css"/>
</head>
<body>
<div id="msg">
<form action="user/testUser.do">
<input name="list[0].username" value="aaa" />
<input name="list[1].username" value="bbb" />
<input name="list[2].username" value="ccc" />
<input name="list[3].username" value="ddd" />
<button type="submit">提交</button>
</form>
</div>
</body>

</html>