package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuarioable;
import model.TblUsuariocl2;

public class ClassCrudUsuarioImp implements IUsuarioable{

	@Override
	public void RegistrarUsuario(TblUsuariocl2 tblusu) {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_Cabrera");
		//manejador de entidades segun unidad de persistencia...
		EntityManager entitymanag=conex.createEntityManager();
		//realizamos el proceso...
			//iniciar transaccion...
		entitymanag.getTransaction().begin();
		//registramos datos...
		entitymanag.persist(tblusu);
		//confirmamos 
		entitymanag.getTransaction().commit();
		//cerramos
		entitymanag.close();	
				
	} //fin del metodo registrar...

	@Override
	public void ActualizarUsuario(TblUsuariocl2 tblusu) {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_Cabrera");
		//manejador de entidades segun unidad de persistencia...
		EntityManager entitymanag=conex.createEntityManager();
		//realizamos el proceso...
			//iniciar transaccion
		entitymanag.getTransaction().begin();
		//actualizamos datos...
		entitymanag.merge(tblusu);
		System.out.println("dato actualizado");
		//confirmamos 
		entitymanag.getTransaction().commit();
		//cerramos
		entitymanag.close();
				
				
	} //fin del metodo actulizar...

	@Override
	public void EliminarUsuario(TblUsuariocl2 tblusu) {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_Cabrera");
		//manejador de entidades segun unidad de persistencia...
		EntityManager entitymanag=conex.createEntityManager();
		//realizamos el proceso...
			//iniciar transaccion
		entitymanag.getTransaction().begin();
				
		//recuperar el codigo a eliminar...
		TblUsuariocl2 elim=entitymanag.merge(tblusu);
		//eliminamos el dato de la base de datos...
		entitymanag.remove(elim);
		System.out.println("Dato Eliminado de la BD!!!!!");
		//confirmamos 
		entitymanag.getTransaction().commit();
		//cerramos
		entitymanag.close();
				
				
	} //fin del metodo eliminar...

	@Override
	public List<TblUsuariocl2> ListadoUsuario() {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_Cabrera");
		//manejador de entidades segun unidad de persistencia...
		EntityManager entitymanag=conex.createEntityManager();
		//realizamos el proceso...
			//iniciar transaccion...
		entitymanag.getTransaction().begin();
				
		//aplicamos JPQL se base en entidades...
		List<TblUsuariocl2> listado=entitymanag.createQuery("select e from TblUsuariocl2 e",TblUsuariocl2.class).getResultList();
		//confirmamos
		entitymanag.getTransaction().commit();
		//cerramos
		entitymanag.close();
		//retornamos el listado
		return listado;
				
	} //fin del metodo listado...

	@Override
	public TblUsuariocl2 BuscarUsuarioCodigo(TblUsuariocl2 tblusu) {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_Cabrera");
		//manejador de entidades segun unidad de persistencia...
		EntityManager entitymanag=conex.createEntityManager();
		//realizamos el proceso...
			//iniciar transaccion
		entitymanag.getTransaction().begin();
						
		//enviamos el codigo a buscar en BD
		TblUsuariocl2 buscar=entitymanag.find(TblUsuariocl2.class, tblusu.getIdusuariocl2());
		//confirmamos 
		entitymanag.getTransaction().commit();
		//cerramos
		entitymanag.close();
		//retornamos el valor buscado
		return buscar;
	} //fin del metodo buscar....

} //fin de la clase....

