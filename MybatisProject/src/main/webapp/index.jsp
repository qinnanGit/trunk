<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-2.1.3.min.js"></script>
<script type="text/javascript" src="js/bootstrap-3.3.2.min.js"></script>
<script type="text/javascript" src="js/multiple-select.js"></script>
<link rel="stylesheet" href="css/bootstrap-3.3.2.min.css" type="text/css"/>
<link rel="stylesheet" href="css/multiple-select.css" type="text/css"/>
</head>
<body>
<select id="example-getting-started" multiple="multiple">
    <option value="1">Cheese</option>
    <option value="2">Tomatoes</option>
    <option value="3">Mozzarella</option>
    <option value="4">Mushrooms</option>
    <option value="5">Pepperoni</option>
    <option value="6">Onions</option>
</select>
<input type="button" value="test" class="btn btn-success" onclick="get();"/>
</body>
<script type="text/javascript">
    $(document).ready(function() {
        $('#example-getting-started').multipleSelect({
            width: 260,
            multipleWidth: 55,
            selectAll:false,
            placeholder:'请选择'
        });
    });
    function get()
    {
    	alert($('#example-getting-started').multipleSelect('getSelects','value'));
    }
</script>
</html>