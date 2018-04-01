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
<div>
<input v-bind:value="message">
</div>
<div>
<input v-model:value="message">
</div>
<div>{{message}}</div>
<select v-model="selected">
<option>我是0</option>
<option value="1">我是1</option>
<option value="2">我是2</option>
<option value="3">我是3</option>
</select>
<input type="checkbox" value="1" v-model="all" />
<input type="checkbox" value="2" v-model="all" />
<input type="checkbox" value="3" v-model="all" />
<ul v-for="user in json">
<li>{{user.username}}</li>
</ul>
</div>
</body>
<script type="text/javascript">
   var vw = new Vue({
	   el:'#msg',
	   data:{
		   message:'hellow Chinese',
		   selected:1,
		   all:[0,2,4],
		   json:''
	   },
	   created:function(){
 		  $.ajax({
			  url:'/MybatisProject/user/getAllUser.do',
			  dataType:'json',
			  type:'POST',
			  contentType:'application/json',
			  success:function(data){
				  vw.json = data;
				  vw.selected = 2;
			  }
		  }); 
/* 		  this.$http.post('/MybatisProject/user/getAllUser.do').then(
				  function(data){
					  alert(data);
				  },
				  function(){
					  
				  }); */
	   }
   });
</script>
</html>