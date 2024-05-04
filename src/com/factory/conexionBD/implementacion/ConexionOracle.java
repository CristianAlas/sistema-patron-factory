package com.kodigo.implementacion;

import com.kodigo.interfaz.IConexion;

public class ConexionOracle implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String clave;

    public ConexionOracle(){
        this.host = "localhost";
        this.puerto = "3236";
        this.usuario = "admin";
        this.clave = "123";
    }

    @Override
    public void conectar() {
        System.out.println("Conectandose a oracle");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectandose a oracle");
    }
}
