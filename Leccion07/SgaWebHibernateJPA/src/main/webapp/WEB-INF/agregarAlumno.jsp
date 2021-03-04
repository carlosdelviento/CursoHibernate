<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Agregar Alumno</title>
	</head>
	<body>
		<h1>Agregar Alumno</h1>
		<form name="form1" action="${pageContext.request.contextPath}/ServletAgregar" method="post">
			Nombre: <input type="text" name="nombre" required="required"/>
			<br/>
			Apellido: <input type="text" name="apellido" required="required"/>
			<br/>
			Datos Domicilio:
			<br/>
			Calle: <input type="text" name="calle" required="required">
			<br/>
			No. Calle: <input type="text" name="noCalle" required="required"/>
			<br/>
			Pais: <input type="text" name="pais" required="required"/>
			<br/>
			<br/>
			Datos de Contacto:
			<br/>
			Email: <input type="email" name="email" required="required">
			<br/>
			Telefono: <input type="tel" name="telefono" required="required">
			<br/>
			<input type="submit" name="Agregar" value="Agregar"/>
		</form>
	</body>
</html>