<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hello from index.jsp
	<jsp:useBean id="b" class="BeanClass.MyBean" scope="session"></jsp:useBean> <!-- We create b object for bean class -->
	<jsp:setProperty name="b" property="id" value="123"/> <!-- Then we add property to object b in variable name as sid and assign value  -->
	<jsp:setPropperty name="b" property="name" value="Nature"/> <!-- We did it as above -->
	<jsp:forward page="NextPage.jsp"/> <!-- It is different from include that it only passes to next jsp -->
	<jsp:include page="NextPage.jsp"></jsp:include> <!-- But this include the current jsp page -->
	<jsp:include page="NextPage.jsp">
	<jsp:param value="Nature" name="User"/>
	</jsp:include>
	
	
	
</body>
</html>