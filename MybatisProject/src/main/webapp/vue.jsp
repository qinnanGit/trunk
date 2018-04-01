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
<h1 v-bind:title="message">{{message}}</h1>
<h2>{{letter.split("").reverse().join("&")}} </h2>
<h2 v-html="dom"></h2>
<div>
<input v-bind:value="message">
</div>
<div>
<p v-bind:id="id"> I say Hello World !</p>
<button class="btn btn-success" v-on:click="sayHelloWorld"> click me</button>
</div>
<select v-on:change="sayChange" id="aa">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>

</select>
</div>
</body>
<script type="text/javascript">
   var vw = new Vue({
	   el:'#msg',
	   data:{
		   message:'hellow Chinese',
		   letter:'abcdefgh',
		   dom:'我是<em>哇哈哈<em>',
		   id : "sayHello"
	   },
	   methods:{
		   sayHelloWorld:function(){
			   var a = document.getElementById("sayHello");
			   alert(a.innerText);
		   },
		   sayChange:function(event){
			   alert($("#aa").find("option:selected").val());
			   
		   }
	   }
   });
</script>
</html>