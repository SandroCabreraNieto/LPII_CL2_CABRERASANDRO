package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProductoable;
import model.TblProductocl2;

public class ClassCrudProductoImp implements IProductoable{

	public void RegistrarProducto(TblProductocl2 TblProducto) {
		//establecemo conexion con la unidad de persistencia...
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("LPII_CL2_Cabrera");
		//permite gestionar entidades..
		EntityManager manager=factory.createEntityManager();
		//iniciar transaccion...
		manager.getTransaction().begin();
		//registramos
		manager.persist(TblProducto);
		//confirmamos
		manager.getTransaction().commit();
		//cerramos la transaccion...
		manager.close();
				
	}//fin del metodo registrar producto

	public void ActualizacionProducto(TblProductocl2 TblProducto) {
		// TODO Auto-generated method stub
		
	}

	public void EliminarProducto(TblProductocl2 TblProducto) {
		// TODO Auto-generated method stub
		
	}

	public List<TblProductocl2> ListarProducto() {
		//establecemo conexion con la unidad de persistencia...
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("LPII_CL2_Cabrera");
		//permite gestionar entidades..
		EntityManager manager=factory.createEntityManager();
		//iniciar transaccion...
		manager.getTransaction().begin();
		List<TblProductocl2> ListarProducto=manager.createQuery("select a from TblProductocl2 a",TblProductocl2.class).getResultList();
		//confirmamos
		manager.getTransaction().commit();
		//cerramos
		manager.close();
		//retornamos el listado
		return ListarProducto;
	}//fin del metodo listar producto

	public TblProductocl2 BuscarProducto() {
		// TODO Auto-generated method stub
		return null;
	}

}
