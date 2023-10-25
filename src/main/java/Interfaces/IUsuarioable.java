package Interfaces;

import java.util.List;

import model.TblUsuariocl2;

public interface IUsuarioable {
	//creamos los respectivos metodos...
	public void RegistrarUsuario(TblUsuariocl2 tblusu);
	public void ActualizarUsuario(TblUsuariocl2 tblusu);
	public void EliminarUsuario(TblUsuariocl2 tblusu);
	public List<TblUsuariocl2> ListadoUsuario();
	public TblUsuariocl2 BuscarUsuarioCodigo(TblUsuariocl2 tblusu);

}//fin de la interfaz IUsuarioable...