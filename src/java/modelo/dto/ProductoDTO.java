/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Edwin Sandoval
 */
public class ProductoDTO implements Serializable{
    private int id;
    private String nombre_producto;
    private String Descripcion_producto;
    private int unidades_producto;
    private int valor;

    public ProductoDTO() {
    }

    public ProductoDTO(String nombre_producto, String Descripcion_producto, int unidades_producto, int valor) {
        this.nombre_producto = nombre_producto;
        this.Descripcion_producto = Descripcion_producto;
        this.unidades_producto = unidades_producto;
        this.valor = valor;
    }

    public ProductoDTO(int id, String nombre_producto, String Descripcion_producto, int unidades_producto, int valor) {
        this.id = id;
        this.nombre_producto = nombre_producto;
        this.Descripcion_producto = Descripcion_producto;
        this.unidades_producto = unidades_producto;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion_producto() {
        return Descripcion_producto;
    }

    public void setDescripcion_producto(String Descripcion_producto) {
        this.Descripcion_producto = Descripcion_producto;
    }

    public int getUnidades_producto() {
        return unidades_producto;
    }

    public void setUnidades_producto(int unidades_producto) {
        this.unidades_producto = unidades_producto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
        hash = 83 * hash + Objects.hashCode(this.nombre_producto);
        hash = 83 * hash + Objects.hashCode(this.Descripcion_producto);
        hash = 83 * hash + this.unidades_producto;
        hash = 83 * hash + this.valor;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductoDTO other = (ProductoDTO) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.unidades_producto != other.unidades_producto) {
            return false;
        }
        if (this.valor != other.valor) {
            return false;
        }
        if (!Objects.equals(this.nombre_producto, other.nombre_producto)) {
            return false;
        }
        if (!Objects.equals(this.Descripcion_producto, other.Descripcion_producto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" + "id: " + id + ", nombre_producto: " + nombre_producto + ", valor= $" + valor + '}';
    }
    
    
}
