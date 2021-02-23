package uy.com.cb.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import uy.com.cb.domain.Persona;
import uy.com.cb.servicio.ServicioPersonas;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		ServicioPersonas servicioPersonas = new ServicioPersonas();
		
		List<Persona> personas = servicioPersonas.listarPersonas();
		
		request.setAttribute("personas", personas);
		
		try {
			request.getRequestDispatcher("/WEB-INF/listado.jsp").forward(request, response);
		} catch (ServletException ex) {
			ex.printStackTrace(System.out);
		} catch (IOException ex) {
			ex.printStackTrace(System.out);
		}
	}
}
