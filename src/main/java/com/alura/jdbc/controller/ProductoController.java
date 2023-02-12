package com.alura.jdbc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alura.jdbc.dao.ProductoDAO;
import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Producto;

import java.sql.Statement;


public class ProductoController {

	private ProductoDAO productoDAO;
	
	public ProductoController() {
		this.productoDAO = new ProductoDAO(new ConnectionFactory().recuperaConexion());

	}

	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) {
	    return productoDAO.modificar(nombre, descripcion, cantidad, id);
	}

	public int eliminar(Integer id) {
	    return productoDAO.eliminar(id);
	}

	public List<Producto> listar(){
		return productoDAO.listar();
	}

    public void guardar(Producto producto){
    	productoDAO.guardar(producto);
	}
}
