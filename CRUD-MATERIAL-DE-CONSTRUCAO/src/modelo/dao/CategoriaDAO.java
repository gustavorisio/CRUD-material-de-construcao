package modelo.dao;

public class CategoriaDAO {

    // Consulta SQL
    private static final String LISTAR = "SELECT * FROM dbstore.categorias";
    private static final String BUSCARID = "SELECT id FROM dbstore.categorias where nome = ?";

    // Método para listar todas as categorias
    public static java.util.List<modelo.Categoria> listarTodas() throws ClassNotFoundException {
        java.sql.Connection con = null;
        java.sql.Statement stmt = null;
        java.sql.ResultSet rs = null;
        java.util.List<modelo.Categoria> categs = new java.util.ArrayList<>();
        try {
            // Obtém uma conexão com o banco de dados
            con = util.FabricaConexao.getConexao();
            // Cria um statement para executar a consulta SQL
            stmt = con.createStatement();
            // Executa a consulta SQL e obtém o resultado
            rs = stmt.executeQuery(LISTAR);
            //Adiciona categorias a lista
            while (rs.next()) {
                modelo.Categoria cat = new modelo.Categoria();
                cat.setId(rs.getInt("id"));
                cat.setNome(rs.getString("nome"));
                categs.add(cat);
            }
            stmt.close();
            util.FabricaConexao.fechaConexao(con);
        } catch (java.sql.SQLException err) {
            // Imprime a mensagem de erro e lança uma exceção
            System.out.println(err.getMessage());
            throw new RuntimeException(err);
        }
        return categs;
    }

    // Método para buscar o ID de uma categoria pelo nome
    public static int buscarId(String nome) throws ClassNotFoundException {
        java.sql.Connection con = null;
        java.sql.PreparedStatement pstmt = null;
        java.sql.ResultSet rs = null;
        int result = 0;
        try {
            con = util.FabricaConexao.getConexao();
            pstmt = con.prepareStatement(BUSCARID);
            pstmt.setString(1, nome);
            rs = pstmt.executeQuery();
            rs.next();
            result = rs.getInt("id");
            util.FabricaConexao.fechaConexao(con, pstmt, rs);
        } catch (java.sql.SQLException err) {
            throw new RuntimeException(err);
        }
        return result;
    }
}
