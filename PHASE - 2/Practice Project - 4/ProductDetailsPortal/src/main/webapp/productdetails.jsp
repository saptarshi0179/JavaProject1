<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>

<h1>Enter Product Details</h1>
<form action="Product" method="post">

<table>

<tr>
<td>Product ID:</td>
<td><input type="number" name="id"></td>
</tr>
<tr>
<td>Name:</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>Colour:</td>
<td><input type="text" name="color"></td>
</tr>
<tr>
<td>Price:</td>
<td><input type="number" name="price"></td>
</tr>
<tr>
<td><input type="submit" name="submit"></td>
<td><input type="reset" name="reset"></td>
</tr>

</table>

</form>

</body>
</html>