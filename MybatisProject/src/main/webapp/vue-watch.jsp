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
<style type="text/css">
#range{
 display: inline-block;
}
#color{
 display: inline-block;
 width: 200px;
 height: 200px;
 border-radius:100%;
}
</style>
</head>
<body>
<div id="msg">
<textarea :maxlength="maxLength" v-model:value="message"></textarea>
<p>你已经最多可以输入{{maxLength}}个字,还可以输入{{remainder}}个字</p>
<div>
<input type="text" v-model="isCheck" />
<input type="checkbox" v-model="isCheck" />
</div>
</div>
</body>
<script type="text/javascript">
   var max = 10;
   var vw = new Vue({
	   el:'#msg',
	   data:{
		   message:'',
           maxLength:max,
           remainder:max,
           isCheck:true
	   },
	   watch:{
		   message:function(){
			   this.remainder = this.maxLength - this.message.length;
		   }
	   }

   });
</script>
</html>