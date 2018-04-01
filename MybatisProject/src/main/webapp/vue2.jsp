<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-2.1.3.min.js"></script>
<script type="text/javascript" src="js/vue.js"></script>
<link rel="stylesheet" href="css/bootstrap-3.3.2.min.css" type="text/css"/>
<link rel="stylesheet" href="css/multiple-select.css" type="text/css"/>
</head>
<body>
<div id="msg">
<div>
<input v-bind:value="message">
</div>
<div>
<input v-model:value="message">
</div>
<div>{{message}}</div>
</div>
</body>
<script type="text/javascript">
   var vw = new Vue({
	   el:'#msg',
	   data:{
		   message:'hellow Chinese'
	   }

   });
</script>
</html>