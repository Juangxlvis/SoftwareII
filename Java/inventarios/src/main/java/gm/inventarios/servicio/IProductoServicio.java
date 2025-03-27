package gm.inventarios.servicio;

import gm.inventarios.modelo.Producto;


import java.util.List;

public interface IProductoServicio {
    public List<Producto> listarProductos();

    public Producto buscarProductoPorId(Integer idProducto);

    public Producto guardarProducto(Producto producto);//si existe se hace update si no, solo insert, asi funciona hibernate

    public void eliminarProducto(Integer idProducto);
}
