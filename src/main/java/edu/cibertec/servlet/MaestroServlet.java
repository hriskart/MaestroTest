package edu.cibertec.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.cibertec.service.IMaestroService;
import edu.cibertec.service.impl.MaestroServiceImpl;

/**
 * Servlet implementation class MaestroServlet
 */
@WebServlet("/")
public class MaestroServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private IMaestroService service = new MaestroServiceImpl();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaestroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nombreCompleto = service.obtenerNombreCompleto();

		request.setAttribute("respuesta", nombreCompleto);

	    request.getRequestDispatcher("index.jsp").forward(request, response);

		//response.getWriter().append("Nombre Completo Obtenido: ").append(""+nombreCompleto);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
