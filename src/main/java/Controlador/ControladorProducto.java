package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassCrudProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
				//recuperamos los valores del formulario que ingresa el usuario final
				String nombrecl2=request.getParameter("nombrecl2");
				double precioventacl2=Double.parseDouble(request.getParameter("precioventacl2"));
				double preciocompcl2=Double.parseDouble(request.getParameter("preciocompcl2"));
				String estadocl2=request.getParameter("estadocl2");
				String descripcl2=request.getParameter("descripcl2");
				
				//instanciamos las respectivas clases
				TblProductocl2 TblProducto=new TblProductocl2();
				ClassCrudProductoImp crud=new ClassCrudProductoImp();
				//asignamos los respectivos valores
				TblProducto.setNombrecl2(nombrecl2);
				TblProducto.setPrecioventacl2(precioventacl2);
				TblProducto.setPreciocompcl2(preciocompcl2);
				TblProducto.setEstadocl2(estadocl2);
				TblProducto.setDescripcl2(descripcl2);		
				//invocamos al metodo registrar
				crud.RegistrarProducto(TblProducto);
				//recuperamos el listado de autos
				List<TblProductocl2> listadoproducto=crud.ListarProducto();
				//enviamos
				request.setAttribute("listado", listadoproducto);
				//redireccionamos
				request.getRequestDispatcher("/RegistroPro.jsp").forward(request, response);
								
				}//fin del metodo dopost

			}
