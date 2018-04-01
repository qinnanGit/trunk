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
<p :style="{color:'red'}">sadasd</p>
<div>
<input :style="{width:wid+'px',color:aa}" id="range" type="range" min="0" max="50" v-model:value="tem"/>
<span style="display: inline-block;margin-top: 0px;">{{tem}}</span>
</div>
<span id="color" :style="{backgroundColor:'rgb('+r+','+g+','+b+')'}"></span>
</div>
</body>
<script type="text/javascript">
   var vw = new Vue({
	   el:'#msg',
	   data:{
		   aa:'red',
		   wid:500,
		   tem:0,
		   r:0,
		   g:255,
		   b:255,
	   },
	   watch:{
		   tem:function(a,b){
			   this.r = this.tem*5;
			   this.g = this.b=255-this.r;
		   }
	   }

   });
</script>
</html>