/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cicero.db.test;

import br.com.cicero.db.utils.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cicero
 */
public class SqlTest {

    public static Connection con = null;

    public static void main(String[] args) {
        try {
            con = ConnectionUtils.getConnection();

            //insert();
            //listAll();
            //update();
            //listAll();
            delete();
            listAll();

            System.out.println("Sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void insert() throws SQLException {

        String sql = "INSERT INTO cliente VALUES (?,?,?)";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(2, "Maria");
        pst.setString(3, "F");
        pst.setString(3, "Rua João Logo Ali");
        pst.setString(3, "11946587684");

        pst.execute();

    }

    private static void listAll() throws SQLException {

        String sql = "SELECT * FROM cliente";

        PreparedStatement pst = con.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString("nome") + " " + rs.getString("genero")
                    + " " + rs.getString("Endereço") + " " + rs.getString("Telefone"));
        }
    }

    private static void update() throws SQLException {

        String sql = "UPDATE cliente SET nome=?, genero=? WHERE id=?";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(1, "Jose");
        pst.setString(1, "M");
        pst.setInt(3, 0);

        pst.execute();

    }

    private static void delete() throws SQLException {

        String sql = "DELETE FROM cliente WHERE id=?";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setInt(1, 0);

        pst.execute();

    }

}
