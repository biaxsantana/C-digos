/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.DriverManager; // Driver para abrir Conexão
import java.sql.SQLException; // Tratamento de Erros SQL
import java.sql.Connection; // Armazena a Conexão Aberta
import javax.swing.JOptionPane;

/**
 *
 * @author beatriz.ssantana14
 */
public class ConectarDao {

    Connection con;

    public ConectarDao() {

        try { // Código que abre e armazena a
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/projcad", "root",
                    "");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(
                    null, "Erro de Conexão "
                    + "com o MySQL ...\n" + err.getMessage());
        }

    }
}
