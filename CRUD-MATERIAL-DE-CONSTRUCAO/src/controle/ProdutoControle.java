package controle;

import java.sql.SQLException;
import modelo.Produto;
import modelo.dao.ProdutoDAO;

public class ProdutoControle {

    /* elemento no índice 0 contém o nome do produto e no índice 1 o id da categoria */
    public static boolean inserirProduto(String[] atributos) throws ClassNotFoundException {
        // Cria uma nova instância de Produto
        modelo.Produto inserir = new modelo.Produto();
        // Atributos do produto
        inserir.setNome(atributos[1]);
        inserir.setCategoria(Integer.parseInt(atributos[2]));
        inserir.setMarca(atributos[3]);
        inserir.setVenda(Double.parseDouble(atributos[4]));
        inserir.setCusto(Double.parseDouble(atributos[5]));
        inserir.setEan(atributos[6]);
        inserir.setFornecedor(atributos[7]);
        inserir.setEstoque(Double.parseDouble(atributos[8]));
        inserir.setPeso(Double.parseDouble(atributos[9]));
        // Insere o produto no banco de dados através do DAO
        boolean retorno = modelo.dao.ProdutoDAO.inserirProduto(inserir);
        return retorno;
    }

    // Obtém uma lista de todos os produtos
    public static java.util.List<Object[]> obterTodos() {
        java.util.List<Object[]> retorno = new java.util.ArrayList<>();
        java.util.List<modelo.Produto> produtos = modelo.dao.ProdutoDAO.listarTodos();
        for (modelo.Produto p : produtos) {
            retorno.add(new Object[]{p.getId(), p.getNome(), p.getCategoria(), p.getMarca(),
                p.getVenda(), p.getCusto(), p.getEan(), p.getFornecedor(), p.getEstoque(),
                p.getPeso()});
        }
        return retorno;
    }

    // Busca um produto pelo ID e atualiza seus atributos
    public static modelo.Produto buscarid(String[] dados, String[] atributos) throws ClassNotFoundException {
        modelo.Produto buscar = new modelo.Produto();
        // Atributos do produto
        buscar.setNome(atributos[1]);
        buscar.setCategoria(Integer.parseInt(atributos[2]));
        buscar.setMarca(atributos[3]);
        buscar.setVenda(Double.parseDouble(atributos[4]));
        buscar.setCusto(Double.parseDouble(atributos[5]));
        buscar.setEan(atributos[6]);
        buscar.setFornecedor(atributos[7]);
        buscar.setEstoque(Double.parseDouble(atributos[8]));
        buscar.setPeso(Double.parseDouble(atributos[9]));
        buscar.setId(Integer.parseInt(atributos[10]));
        return buscar;
    }

    // Exclui um produto pelo ID
    public static void excluirId(String[] dados) throws ClassNotFoundException {
        modelo.Produto prod = new modelo.Produto();
        prod.setId(Integer.parseInt(dados[0]));
        boolean retorno = (modelo.dao.ProdutoDAO.excluirProduto(prod.getId()));
    }

    // Método para atualizar um produto
    public static boolean atualizarProduto(String[] atributos) throws ClassNotFoundException, SQLException {
        modelo.Produto atualizar = new modelo.Produto();
        atualizar.setId(Integer.parseInt(atributos[0])); // Supondo que o ID seja o primeiro atributo
        atualizar.setNome(atributos[1]);
        atualizar.setCategoria(Integer.parseInt(atributos[2]));
        atualizar.setMarca(atributos[3]);
        atualizar.setVenda(Double.parseDouble(atributos[4]));
        atualizar.setCusto(Double.parseDouble(atributos[5]));
        atualizar.setEan(atributos[6]);
        atualizar.setFornecedor(atributos[7]);
        atualizar.setEstoque(Double.parseDouble(atributos[8]));
        atualizar.setPeso(Double.parseDouble(atributos[9]));

        // Chama o método para atualizar o produto na classe ProdutoDAO
        boolean atualizado = modelo.dao.ProdutoDAO.atualizar(atualizar);

        return atualizado;
    }
}
