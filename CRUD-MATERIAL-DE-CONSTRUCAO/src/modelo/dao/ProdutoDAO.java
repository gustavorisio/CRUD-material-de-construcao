package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Produto;
import util.FabricaConexao;

public class ProdutoDAO {

    // Consulta SQL
    private static final String LISTAR = "SELECT * FROM dbstore.produtos";
    private static final String INSERIR = "INSERT INTO dbstore.produtos (nome, categoria, marca, venda, custo, ean, fornecedor, estoque, peso) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String DELETARID = "DELETE FROM dbstore.produtos WHERE id = ?";
    private static final String ATUALIZAR = "UPDATE produtos SET nome = ?, categoria = ?, marca = ?, venda = ?, custo = ?, ean = ?, fornecedor = ?, estoque = ?, peso = ? WHERE ID = ?";
    private static final String CONSULTARBYID = "SELECT * FROM produtos WHERE id = ?";

    // Método para listar todos os produtos
    public static List<Produto> listarTodos() {
        List<Produto> retorno = new ArrayList<>();

        try (Connection con = FabricaConexao.getConexao(); PreparedStatement pstmt = con.prepareStatement(LISTAR); ResultSet rs = pstmt.executeQuery()) {
            // Adiciona cada produto à lista de retorno
            while (rs.next()) {
                Produto listar = new Produto();
                listar.setId(rs.getInt("id"));
                listar.setNome(rs.getString("nome"));
                listar.setCategoria(rs.getInt("categoria"));
                listar.setMarca(rs.getString("marca"));
                listar.setVenda(rs.getDouble("venda"));
                listar.setCusto(rs.getDouble("custo"));
                listar.setEan(rs.getString("ean"));
                listar.setFornecedor(rs.getString("fornecedor"));
                listar.setEstoque(rs.getDouble("estoque"));
                listar.setPeso(rs.getDouble("peso"));
                retorno.add(listar);
            }
        } catch (ClassNotFoundException | SQLException err) {
            // Exibe mensagem de erro e lança uma exceção em caso de erro            
            System.err.println("Erro ao listar produtos: " + err.getMessage());
            throw new RuntimeException(err);
        }

        return retorno;
    }

    // Método para inserir um novo produto
    public static boolean inserirProduto(Produto prod) throws ClassNotFoundException {
        boolean retorno = false;

        try (Connection con = FabricaConexao.getConexao(); PreparedStatement inserir = con.prepareStatement(INSERIR)) {
            // Define os parâmetros da consulta SQL
            inserir.setString(1, prod.getNome());
            inserir.setInt(2, prod.getCategoria());
            inserir.setString(3, prod.getMarca());
            inserir.setDouble(4, prod.getVenda());
            inserir.setDouble(5, prod.getCusto());
            inserir.setString(6, prod.getEan());
            inserir.setString(7, prod.getFornecedor());
            inserir.setDouble(8, prod.getEstoque());
            inserir.setDouble(9, prod.getPeso());
            // Executa a consulta e verifica se a inserção foi bem-sucedida
            int rowsAffected = inserir.executeUpdate();
            if (rowsAffected > 0) {
                retorno = true;
            }
        } catch (SQLException err) {
            // Exibe mensagem de erro e lança uma exceção em caso de erro
            System.err.println("Erro ao inserir produto: " + err.getMessage());
            throw new RuntimeException(err);
        }

        return retorno;
    }

    // Método para excluir um produto pelo ID
    public static boolean excluirProduto(int id) throws ClassNotFoundException {
        boolean retorno = false;

        try (Connection con = FabricaConexao.getConexao(); PreparedStatement pstmt = con.prepareStatement(DELETARID)) {
            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                retorno = true;
            }
        } catch (SQLException err) {
            System.err.println("Erro ao excluir produto: " + err.getMessage());
            throw new RuntimeException(err);
        }
        return retorno;
    }

    // Método para consultar um produto pelo ID
    public Produto consultarById(Produto prod) throws ClassNotFoundException, SQLException {
        try (Connection con = FabricaConexao.getConexao(); PreparedStatement comando = con.prepareStatement(CONSULTARBYID)) {
            // Define o ID do produto a ser consultado
            comando.setInt(1, prod.getId());
            try (ResultSet rs = comando.executeQuery()) {
                // Se houver resultado, define os atributos do produto
                if (rs.next()) {
                    Produto buscar = new Produto();
                    buscar.setId(rs.getInt("id"));
                    buscar.setNome(rs.getString("nome"));
                    buscar.setCategoria(rs.getInt("categoria"));
                    buscar.setMarca(rs.getString("marca"));
                    buscar.setVenda(rs.getDouble("venda"));
                    buscar.setCusto(rs.getDouble("custo"));
                    buscar.setEan(rs.getString("ean"));
                    buscar.setFornecedor(rs.getString("fornecedor"));
                    buscar.setEstoque(rs.getDouble("estoque"));
                    buscar.setPeso(rs.getDouble("peso"));
                    return buscar;
                }
            }
        } catch (SQLException err) {
            // Exibe mensagem de erro e lança uma exceção em caso de erro
            System.err.println("Erro ao consultar produto: " + err.getMessage());
            throw new RuntimeException(err);
        }
        return null;
    }

    // Método para atualizar um produto
    public static boolean atualizar(Produto prod) throws ClassNotFoundException, SQLException {
        boolean atualizado = false;

        try (Connection con = FabricaConexao.getConexao(); PreparedStatement atualizar = con.prepareStatement(ATUALIZAR)) {
            // Define os parâmetros da consulta SQL
            atualizar.setString(1, prod.getNome());
            atualizar.setInt(2, prod.getCategoria());
            atualizar.setString(3, prod.getMarca());
            atualizar.setDouble(4, prod.getVenda());
            atualizar.setDouble(5, prod.getCusto());
            atualizar.setString(6, prod.getEan());
            atualizar.setString(7, prod.getFornecedor());
            atualizar.setDouble(8, prod.getEstoque());
            atualizar.setDouble(9, prod.getPeso());
            atualizar.setInt(10, prod.getId());
            // Executa a consulta e verifica se a atualização foi bem-sucedida
            int rowsAffected = atualizar.executeUpdate();
            if (rowsAffected > 0) {
                atualizado = true;
            }
        } catch (SQLException err) {
            // Exibe mensagem de erro e lança uma exceção em caso de erro
            System.err.println("Erro ao atualizar produto: " + err.getMessage());
            throw new RuntimeException(err);
        }

        return atualizado;
    }

}
