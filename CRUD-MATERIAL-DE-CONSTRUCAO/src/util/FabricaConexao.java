package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FabricaConexao {

    // Dados para a conexão com o banco de dados
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static final String BANCO = "dbstore";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String STRINGCONEXAO = "jdbc:mysql://localhost:3306/";

    // Método para obter uma conexão com o banco de dados
    public static Connection getConexao() throws SQLException, ClassNotFoundException {
        Connection con = null;
        try {
            // Carrega o driver do MySQL
            Class.forName(DRIVER);
            // Estabelece a conexão com o banco de dados
            con = DriverManager.getConnection(STRINGCONEXAO + BANCO, USUARIO, SENHA);
            return con;
        } catch (ClassNotFoundException e) {
            // Lança exceção se o driver não for encontrado
            throw new ClassNotFoundException("Driver MySql não foi encontrado " + e.getMessage());
        } catch (SQLException e) {
            // Lança exceção se houver erro ao conectar com o banco de dados
            throw new SQLException("Erro ao conectar " + "com a base de dados" + e.getMessage());
        }
    }
    
    // Método para fechar a conexão com o banco de dados
    public static void fechaConexao(Connection con) {
        try {
            if (con != null) {
                con.close();
                System.out.println(
                        "Fechada a conexão com o banco de dados ");
            }
        } catch (Exception e) {
            System.out.println(
                    "Não foi possível fechar a conexão com o banco de dados" + e.getMessage());
        }
    }

    // Método para fechar a conexão e o PreparedStatement
    public static void fechaConexao(Connection con, PreparedStatement stmt) {
        try {
            if (con != null) {
                fechaConexao(con);
            }
            if (stmt != null) {
                stmt.close();
                System.out.println("Statement fechado com sucesso");
            }
        } catch (Exception e) {
            System.out.println("Não foi possível fechar o statement" + e.getMessage());
        }
    }

    // Método para fechar a conexão, o PreparedStatement e o ResultSet
    public static void fechaConexao(Connection con, PreparedStatement stmt, ResultSet rs) {
        try {
            if (con != null || stmt != null) {
                fechaConexao(con, stmt);
            }
            if (rs != null) {
                rs.close();
                System.out.println("ResultSet fechado com sucesso");
            }
        } catch (Exception e) {
            System.out.println("Não foi possível fechar o ResultSet" + e.getMessage());
        }
    }
}
