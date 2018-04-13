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
import java.util.Scanner;

/**
 *
 * @author cicero
 */
public class SqlTest {

    public static Connection con = null;

    public static void main(String[] args) {
        try {
            con = ConnectionUtils.getConnection();

            System.out.println("Conectado! \n ");

            //insert();
            //listAll();
            //update();
            //listAll();
            //delete();
            //listAll();
            System.out.println("Selecione uma das opções: \n"
                    + "0 - Sair \n"
                    + "1 - Inserir dados \n"
                    + "2 - Listar dados \n"
                    + "3 - Atualizar Dados \n"
                    + "4 - Deletar Dados \n");
            String dado, nome, genero, endereco, telefone;
            int valor, id;
            Scanner ler = new Scanner(System.in);
            valor = ler.nextInt();

            while (valor != 0) {
                System.out.println("Selecione uma das opções: \n"
                        + "0 - Sair \n"
                        + "1 - Inserir dados \n"
                        + "2 - Listar dados \n"
                        + "3 - Atualizar Dados \n"
                        + "4 - Deletar Dados \n");

                if (valor == 0) {

                    System.out.println("Tchau! Tchau!");
                    System.out.println("\n");
                    System.exit(0);

                }
                if (valor == 1) {

                    System.out.println("Insira os dados necessários: \n");
                    System.out.println("nome: ");
                    dado = ler.next();
                    nome = dado;
                    System.out.println("\n");
                    System.out.println("genero: (tecle M ou F) ");
                    dado = ler.next();
                    genero = dado;
                    System.out.println("\n");
                    System.out.println("Endereço: ");
                    dado = ler.next();
                    endereco = dado;
                    System.out.println("\n");
                    System.out.println("Telefone: ");
                    dado = ler.next();
                    telefone = dado;

                    insert(nome, genero, endereco, telefone);

                    System.out.println("Dados Inderidos!");

                }
                if (valor == 2) {

                    listAll();

                }
                if (valor == 3) {

                    System.out.println("Insira os dados necessários para a ATUALIZAÇÃO: \n");
                    System.out.println("Id: ");
                    valor = ler.nextInt();
                    id = valor;
                    System.out.println("nome: ");
                    dado = ler.next();
                    nome = dado;
                    System.out.println("\n");
                    System.out.println("genero: (tecle M ou F) ");
                    dado = ler.next();
                    genero = dado;
                    System.out.println("\n");
                    System.out.println("Endereço: ");
                    dado = ler.next();
                    endereco = dado;
                    System.out.println("\n");
                    System.out.println("Telefone: ");
                    dado = ler.next();
                    telefone = dado;

                    update(id, nome, genero, endereco, telefone);

                    System.out.println("Dados Atualizados!");

                }
                if (valor == 4) {

                    listAll();

                    System.out.println("Selecione um ID para DELETAR: \n");
                    System.out.println("Id: ");
                    valor = ler.nextInt();
                    id = valor;
                    System.out.println("\n");

                    delete(id);

                    System.out.println("Dados Deletados!");

                }

            }

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

    private static void insert(String nome, String genero, String endereco, String telefone) throws SQLException {

        String sql = "INSERT INTO cliente VALUES (?,?,?,?)";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(2, nome);
        pst.setString(3, genero);
        pst.setString(3, endereco);
        pst.setString(3, telefone);

        pst.execute();

    }

    private static void listAll() throws SQLException {

        String sql = "SELECT * FROM cliente";

        PreparedStatement pst = con.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString("nome") + " " + rs.getString("genero")
                    + " " + rs.getString("endereco") + " " + rs.getString("telefone"));
        }
    }

    private static void update(Integer id, String nome, String genero, String endereco, String telefone) throws SQLException {

        String sql = "UPDATE cliente SET nome=?, genero=?, endereco=?, telefone=? WHERE id=?";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(1, nome);
        pst.setString(2, genero);
        pst.setString(3, endereco);
        pst.setString(4, telefone);
        pst.setInt(5, id);

        pst.execute();

    }

    private static void delete(Integer id) throws SQLException {

        String sql = "DELETE FROM cliente WHERE id=?";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setInt(1, id);

        pst.execute();

    }

}
