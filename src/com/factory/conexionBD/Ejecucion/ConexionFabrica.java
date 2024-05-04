package com.kodigo.Ejecucion;

import com.kodigo.implementacion.ConexionMySQL;
import com.kodigo.implementacion.ConexionOracle;
import com.kodigo.implementacion.ConexionVacia;
import com.kodigo.interfaz.IConexion;

public class ConexionFabrica {

    public IConexion obtenerConexion(String motor){
        if (motor == null){
            return new ConexionVacia();
        }
        if(motor.equalsIgnoreCase("MYSQL")){
            return new ConexionMySQL();
        } else if (motor.equalsIgnoreCase("ORACLE")){
            return new ConexionOracle();

        }
        return new ConexionVacia();
    }

}
