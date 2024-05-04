package com.kodigo.implementacion;

import com.kodigo.interfaz.IConexion;

public class ConexionVacia implements IConexion {
    @Override
    public void conectar() {
        System.out.println("No se especifico la base de datos");
    }

    @Override
    public void desconectar() {
        System.out.println("No se especifico la base de datos");
    }
}
