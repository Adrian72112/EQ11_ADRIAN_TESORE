/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TA2;

/**
 *
 * @author adriantesore
 */
public class Almacen implements IAlmacen {
    
    String direccion,telefono,nombre;
    Lista productos;
    
    @Override
    public String getDireccion() {
        return this.direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTelefono() {
        return this.telefono; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return this.nombre; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Lista getListaProductos() {
        return this.productos; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertarProducto(Almacen unProducto) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(Comparable clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String imprimirProductos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String imprimirSeparador(String separador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean agregarStock(Comparable etiqueta, Integer cantidad) {
        if(etiqueta.compareTo(null) == 0){
            System.out.println("Etiqueta invalida o null");    
            return false;
        } else{           
            INodo actual = this.productos.buscar(etiqueta);
            if(actual != null){
                actual.getDato().setStock(cantidad);
                return true;
            }
        }       
         return false; //To change body of generated methods, choose Tools | Templates. //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer restarStock(Comparable etiqueta, Integer cantidad) {
         if(etiqueta.compareTo(null) == 0){
            System.out.println("Etiqueta invalida o null");    
            return 0;
        } else{           
            INodo actual = this.productos.buscar(etiqueta);
            if(actual != null){
                actual.getDato().setStock(cantidad);
                return 1;
            }
        }       
         return -1; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IProducto buscarPorCodigo(Comparable clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarOrdenadoPorNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Almacen buscarPorDescripcion(String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int cantidadProductos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
