/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.db.util;

import java.sql.Connection;

/**
 *
 * @author cicero.hsantos
 */
public class ConnectionUtils {

    public static Connection getConnection() {

        Connection con = null;

        String banco = "usuario";

        String urlConnection = "jdbc:mysql://localhost:3306/" + banco;

        return con;

    }

}
