<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<script src="http://code.jquery.com/jquery-latest.js"></script>
	</head>

<script>
$.ajax({
    type: "POST",
    url: "api/user/login",
    data: JSON.stringify({"username":"admin","password":"admin123"}),
    contentType:"application/json;charset=utf-8",
    success: function(data){
    	info(data.data.token)
        //alert(data.data.token);
    }
});
function getTree(token){
	$.ajax({
	    type: "GET",
	    url: "api/enterprise/porttree/4",
	    contentType:"application/json;charset=utf-8",
	    headers: {
            "Accept":"application/json",
            "Content-Type":"application/json",
            "Authorization": "Bearer " + token
        },
	    success: function(data){
	    	alert(data);
	    }
	});
}
function info(token){
	$.ajax({
	    type: "GET",
	    url: "api/user/info",
	    contentType:"application/json;charset=utf-8",
	    headers: {
            "Accept":"application/json",
            "Content-Type":"application/json",
            "Authorization": "Bearer " + token + "xx"
        },
	    success: function(data){
	    	alert(data.code);
	    	alert(data.msg);
	    }
	});
}
</script>

	<body>
		<p>hello</p>
		<a id="user"></a>
	</body>
</html>