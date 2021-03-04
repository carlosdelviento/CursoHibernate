<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Modificar Alumno</title>
	</head>
	<body>
		<h1>Modificar Alumno</h1>
		<form name="form1" action="${pageContext.request.contextPath}/ServletModificar" method="post">
			<input type="hidden" name="idAlumno" value="${alumno.idAlumno}"/>
		
			Nombre: <input type="text" name="nombre" value="${alumno.nombre}" required="required"/>
			<br/>
			Apellido: <input type="text" name="apellido" value="${alumno.apellido}" required="required"/>
			<br/>
			<br/>
			Datos Domicilio:
			<br/>
			Calle: <input type="text" name="calle" value="${alumno.domicilio.calle}" required="required">
			<br/>
			No. Calle: <input type="text" name="noCalle" value="${alumno.domicilio.noCalle}" required="required"/>
			<br/>
			Pais: <input type="text" name="pais" value="${alumno.domicilio.pais}" required="required"/>
			<br/>
			<br/>
			Datos de Contacto:
			<br/>
			Email: <input type="email" name="email" value="${alumno.contacto.email}" required="required">
			<br/>
			Telefono: <input type="tel" name="telefono" value="${alumno.contacto.telefono}" required="required">
			<br/>
			<input type="submit" name="Modificar" value="Modificar"/>
			<input type="submit" name="Eliminar" value="Eliminar"/>
		</form>
	</body>
</html>