/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.FabricaConexao;

public class CategoriaControle {
// Método para listar todas as categorias

    public static java.util.List<String> listarTodas() throws ClassNotFoundException {
        // Cria uma lista para armazenar os nomes das categorias
        java.util.List<String> categs = new java.util.ArrayList<>();
        java.util.List<modelo.Categoria> cats = modelo.dao.CategoriaDAO.listarTodas();
        for (modelo.Categoria c : cats) {
            categs.add(c.getNome());
        }
        return categs;
    }

    // Método para buscar o ID de uma categoria pelo nome
    public static String buscarId(String nome) throws ClassNotFoundException {
        Integer id = modelo.dao.CategoriaDAO.buscarId(nome);
        return id.toString();
    }

}
