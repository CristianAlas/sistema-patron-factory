package com.kodigo.implementacion;

import com.kodigo.interfaz.IConexion;

public class ConexionMySQL implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String clave;

    public ConexionMySQL(){
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.clave = "123";
    }

    @Override
    public void conectar() {
        System.out.println("Conectandose a MySQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectandose a MySQL");
    }
}
