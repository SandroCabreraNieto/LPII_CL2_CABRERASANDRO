package Interfaces;

import java.util.List;

import model.TblProductocl2;


public interface IProductoable {
	public void RegistrarProducto(TblProductocl2 TblProducto);
	public void ActualizacionProducto(TblProductocl2 TblProducto);
	public void EliminarProducto(TblProductocl2 TblProducto);
	public List<TblProductocl2> ListarProducto();
	public TblProductocl2 BuscarProducto();

}   //fin de la interface....
