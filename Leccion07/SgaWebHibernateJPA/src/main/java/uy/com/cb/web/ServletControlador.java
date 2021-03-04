package uy.com.cb.web;

import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import uy.com.cb.domain.Alumno;
import uy.com.cb.servicio.ServicioAlumno;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		ServicioAlumno servicioAlumno = new ServicioAlumno();

		List<Alumno> alumnos = servicioAlumno.listarAlumnos();

		request.setAttribute("alumnos", alumnos);

		try {
			request.getRequestDispatcher("/WEB-INF/listarAlumnos.jsp").forward(request, response);
		} catch (Exception ex) {
			ex.printStackTrace(System.out);
		}
	}
}
