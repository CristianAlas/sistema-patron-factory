package com.kodigo.Ejecucion;

import com.kodigo.interfaz.IConexion;

public class Main {
    public static void main(String[] args) {
        ConexionFabrica fabrica = new ConexionFabrica();

        IConexion db1 = fabrica.obtenerConexion("MYSQL");
        db1.conectar();
        db1.desconectar();

        IConexion bd2 = fabrica.obtenerConexion("ORACLE");
        bd2.conectar();
        bd2.desconectar();

        IConexion db3 = fabrica.obtenerConexion("SQLsserver");
        db3.conectar();
        db3.desconectar();
    }
}