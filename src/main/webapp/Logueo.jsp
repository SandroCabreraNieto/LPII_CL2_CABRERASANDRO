<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logueo</title>
</head>
<body bgcolor="#c5dec9">

<h1 align="center">Ingresar al Sistema</h1>

<form action="ControladorLogueo" method="post" class="formulario">
<table align="center" border="2">

<tr>
	<td>Usuario</td>
	<td><input type="text" name="usuariocl2"></td>
</tr>

<tr>
	<td>Password</td>
	<td><input type="text" name="passwordcl2"></td>
</tr>


<tr align="center">
	<td colspan="2"><input type="submit" value="Ingresar"></td>
</tr>

</table>
</form>

</body>
</html>