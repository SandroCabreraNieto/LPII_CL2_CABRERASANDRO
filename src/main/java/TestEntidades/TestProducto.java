package TestEntidades;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import model.TblProductocl2;

public class TestProducto {

	public static void main(String[] args) {
		//establecemos la conexion  con la unidad de persistencia....
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_Cabrera");
		//gestionar  entidades como registrar,actualizar,eliminar,listar,buscar....
		EntityManager emanager=conex.createEntityManager();
		//iniciamos transaccion...(iniciar la operacion como el crud...)
		emanager.getTransaction().begin();

		//realizamos una instancia...
		TblProductocl2 prod=new TblProductocl2();	
		//aplicamos  un switch.....	
		String accion=JOptionPane.showInputDialog("Ingrese la Accion");
		switch(accion){
				
				case "Registrar":
					//ingresamos valores a enviar a la base de datos...
					prod.setNombrecl2("Leche");
					prod.setPrecioventacl2(4);
					prod.setPreciocompcl2(5);
					prod.setEstadocl2("vig.");
					prod.setDescripcl2("oferta");
					//registramos los datos con persist...
					//persist... (insert into tbl_prod values(......)
					emanager.persist(prod);
					//emitimos un mensaje por consola
					System.out.println("Datos registrados en la BD");
					//confirmamos
					emanager.getTransaction().commit();
					//cerramos la transaccion..
					emanager.close();
					//salimos
					break;
				case "Actualizar":
					prod.setIdproductocl2(7);
					prod.setNombrecl2("aceite");
					prod.setPrecioventacl2(6);
					prod.setPreciocompcl2(5);
					prod.setEstadocl2("vig.");
					prod.setDescripcl2("oferta");
					//realizamos la actualizacion
					emanager.merge(prod);
					//emitimos un mensaje ...
					System.out.println("datos actualizado correcmente");
					//confirmamos
					emanager.getTransaction().commit();
					//cerramos
					emanager.close();
				case "Eliminar":
					//codigo a eliminar...
					prod.setIdproductocl2(4);
					TblProductocl2 elim=emanager.merge(prod);
					//realizamo la eliminacion...
					//en jdbc delete from tbl_prod where idprod.....
					emanager.remove(elim);
				    //imprimimos el mensaje por pantalla...
					System.out.println("dato eliminado de la base de datos");
					//confirmamos 
					emanager.getTransaction().commit();
					//cerramos 
					emanager.close();
					//salir
					break;
				case "Buscar":
					//en jdbc : select * fromt tbl_prod where idprod=3;....
					TblProductocl2 busc=emanager.find(TblProductocl2.class,2	);	
					//aplicamos una condicion....
					if(busc==null){
						//emitimos un mensaje por pantalla
						System.out.println("Registro no encontrado");
					}else{
						System.out.println("Registro encontrado");
						//imprimimos por pantalla las caracteristicas del registro
						System.out.println("codigo "+busc.getIdproductocl2()+" nombre "+
								busc.getNombrecl2()+" precioven "+busc.getPrecioventacl2()+" preciocomp "+busc.getPreciocompcl2()+
								" estado "+busc.getEstadocl2()+" descripcion "+busc.getDescripcl2());
					}
					//confirmamos
					emanager.getTransaction().commit();
					//cerramos
					emanager.close();
					//salimos
					break;
					
				case "Listar":
					//en SQL select * from tbl_prod aut.....
					//Tblprod a =new Tblprod();
					//en JPQL select a from Tblprod a entonces la programacion en JPQL es
					//con las entidades
					
				List<TblProductocl2> listado=emanager.createQuery("select a from Tblprod a",TblProductocl2.class).getResultList();
				//mostramos los datos por consola...
				for(TblProductocl2 lis:listado){
					//imprimimos dentro del bucle...
					System.out.println("codigo "+lis.getIdproductocl2()+" nombre "+
					lis.getNombrecl2()+" precioven "+lis.getPrecioventacl2()+" preciocomp "+lis.getPreciocompcl2()+
					" estado "+lis.getEstadocl2()+" descripcion "+lis.getDescripcl2());
				}   //fin del bucle for...
				 
			     //confirmamos
				emanager.getTransaction().commit();
				//cerramos 
				emanager.close();
				//salimos
				break;
				default:
					//emitimos mensaje por pantalla
					System.out.println("Accion no encontrada");
					//salimos
					break;
				
				}   //fin del switch.....
				
				
			}   //fin del metodo principal....

		}   //fin de la clase....
