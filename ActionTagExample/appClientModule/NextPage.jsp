<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="b" class="BeanClass.MyBean" scope="session"></jsp:useBean> <!-- We try to retreive the b object in session scope -->
	<jsp:getProrperty name="b" property="id"/> <!-- We retreive the id variable name -->
	${param.user}; <!-- $ is expression language. It is used to print out the output -->
</body>
</html>