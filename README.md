# CRUD-material-de-construcao

<h2>Seja bem vindo(a) ao meu repositório!</h2>
<h4>Este projeto foi desenvolvido por mim durante a avaliação de POO de Engenharia de Software. Este é um CRUD simples com todas as funções funcionais. Você poderá visualizar, editar e até compartilhar!</h4>
<h4>Funções:</h4> <p>Adicionar_produto  |  Atualizar_produto  |  Limpar  |  Excluir_produto  |  Buscar_ID  |  Recarregar_tabela</p>

<img src="https://github.com/user-attachments/assets/99ec9aa9-b767-48f9-a273-5e20a8495d72" alt="">

<h2>COMO INSTALAR</h2>
<p>Primeiramente, você irá utilizar o NetBeans IDE para abrir o projeto, certifique-se de utilizar em sua maquina o Mysql-Workbench e utilizar este código abaixo na criação de seu BD:</p>
<h6>
CREATE DATABASE dbstore;
USE dbstore;
 
CREATE TABLE Categorias(
	nome varchar(30),
    id bigint auto_increment,
    PRIMARY KEY (id)
);
 
CREATE TABLE Produtos(
	categoria bigint,
    nome varchar(30),
    marca varchar(30),
    venda double,
    custo double,
    ean varchar(30),
    fornecedor varchar(30),
    estoque int(10),
    peso int(10),
    id bigint auto_increment,
    PRIMARY KEY (id),
    FOREIGN KEY (categoria) REFERENCES Categorias(id)
);

INSERT INTO dbstore.Categorias (nome) VALUES ('Ferragem'),('Eletrica'),('Hidraulica');
 </h6>
<p>Após a criação do BD acima, abra seu NetBeans, abra o projeto CRUD, rode a aplicação e ENJOY! NOTA: É possível dar uma mensagem de erro pela ausência de senha do mysql no arquivo, altere a senha em util>FabricaConexao! </p>

<h2>ADICIONAR PRODUTO</h2>
<p>Para cadastrar no banco de dados o produto, é necessário preencher as colunas vazias e clicar no botão "Adicionar novo" (é possível fazer um cadastro rápido preenchendo as colunas: "Nome" e "Valor de venda". Não é possível colocar caracter em colunas especificas.)</p>
<img src="https://github.com/user-attachments/assets/98bd1d3c-f0ba-4d0b-8098-b6b2f361391a" alt="">

<h2>ATUALIZAR PRODUTO</h2>
<p>É possível atualizar um produto já cadastrado após utilizar a função "Buscar produto por código ID". Logo após fazer as alterações, clique no botão "Atualizar". </p>
<img src="https://github.com/user-attachments/assets/7e1bd4e5-c28f-46bf-b4a0-13c3fb47ef79" alt="">

<h2>REMOVER PRODUTO</h2>
<p>Para remover um produto cadastrado é necessário clicar na tabela o produto desejado e clicar no botão "Excluir"</p>
<img src="https://github.com/user-attachments/assets/13d79f08-ade4-48f3-bd20-ac9f08c39bce" alt="">

<h2>LIMPAR</h2>
<p>O botão "Limpar" irá limpar todas as colunas.</p>

<h2>RECARREGAR TABELA</h2>
<p>O botão "Recarregar tabela" atualiza a tabela do programa. </p>

