package TestEntidades;

import java.util.List;

import Dao.ClassCrudUsuarioImp;
import Dao.ClassCrudUsuarioImp;
import model.TblUsuariocl2;
import Interfaces.IUsuarioable;

public class TestUsuario {

	public static void main(String[] args) {
		//realizamos las respectivas instancias...
				TblUsuariocl2 tblusu=new TblUsuariocl2();	
				ClassCrudUsuarioImp crud=new ClassCrudUsuarioImp();
				//*** TESTEAMOS EL METODO REGISTRAR ***//
				/*
				//ingresamos valores
				tblusu.setUsuariocl2("sandro");
				tblusu.setPasswordcl2("123456");
				//invocamos al metodo registrar..
				crud.RegistrarUsuario(tblusu);
				//emitimos un mensaje por consoal..
				System.out.println("dato registrado en BD");
				*/
				
				
				//*** TESTEAMOS EL METODO ACTUALIZAR ***//
				/*
				tblusu.setIdusuariocl2(1);
				tblusu.setUsuariocl2("admin");
				tblusu.setPasswordcl2("123456");
				//invocamos el metodo actualizar...
				crud.ActualizarUsuario(tblusu);
				*/
				
				//*** TESTEAMOS EL METODO ELIMINAR ***//
				/*
				tblusu.setIdusuariocl2(1);
				//invocamos el metodo eliminar...
				crud.EliminarUsuario(tblusu);
				*/
				
				//*** TESTEAMOS EL METODO LISTAR ***//
				/*
				List<TblUsuariocl2> listar=crud.ListadoUsuario();
					//aplicamos un bucle...
				for(TblUsuariocl2 lis:listar){
					
					//imprimimos por pantalla
					System.out.println(" codigo "+lis.getIdusuariocl2()+" usuario "+lis.getUsuariocl2()+" password "
							+lis.getPasswordcl2());

				}  //fin del bucle for...
				*/
				
				//*** TESTEAMOS EL METODO BUSCAR ***//
				/*
				tblusu.setIdusuariocl2(1);
				TblUsuariocl2 buscod=crud.BuscarUsuarioCodigo(tblusu);
				//imprimimos por pantalla...
				System.out.println(" codigo "+buscod.getIdusuariocl2()+" usuario "+buscod.getUsuariocl2()+" password "
						+buscod.getPasswordcl2());
				*/
				
			} //fin del metodo principal...

		} //fin de la clase testUsuario...
