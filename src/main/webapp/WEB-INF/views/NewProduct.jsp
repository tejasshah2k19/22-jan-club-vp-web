<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>New Product</title>
</head>
<body>

	<s:form action="saveproduct" method="post"  modelAttribute="product">
		ProductName : <s:input path="productName" />
		<s:errors path="productName"></s:errors>
		<Br>
		Price :  <s:input path="price" />
		<s:errors path="price"></s:errors>
		<br>
		<br>
		<input type="submit" value="AddProduct">
	</s:form>

</body>
</html>