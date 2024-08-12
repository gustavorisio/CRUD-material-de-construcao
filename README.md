# CRUD-material-de-construcao

<h2>Seja bem vindo(a) ao meu repositório!</h2>
<h4>Este projeto foi desenvolvido por mim durante a avaliação de POO de Engenharia de Software. Este é um CRUD simples com todas as funções funcionais. Você poderá visualizar, editar e até compartilhar!</h4>
<h4>Funções:</h4> <p>Adicionar_produto  |  Atualizar_produto  |  Limpar  |  Excluir_produto  |  Buscar_ID  |  Recarregar_tabela</p>

<img src="https://private-user-images.githubusercontent.com/132175630/356931562-99ec9aa9-b767-48f9-a273-5e20a8495d72.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjM0NjMyMzcsIm5iZiI6MTcyMzQ2MjkzNywicGF0aCI6Ii8xMzIxNzU2MzAvMzU2OTMxNTYyLTk5ZWM5YWE5LWI3NjctNDhmOS1hMjczLTVlMjBhODQ5NWQ3Mi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODEyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgxMlQxMTQyMTdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0xNWYzYWExYzEyNTgzNWM0OTljNGY4Nzk1MzkzNTdkZTE0ZTg5ZDEyZTAyMTI1MTJjMGM2ZGU3YmE5MzQxMWU4JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.g4jpO06btP_Jde9x-ztqQ5USMvupyonETMB3jH8dp9s" alt="">

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
<img src="https://private-user-images.githubusercontent.com/132175630/356931957-98bd1d3c-f0ba-4d0b-8098-b6b2f361391a.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjM0NjM2MDAsIm5iZiI6MTcyMzQ2MzMwMCwicGF0aCI6Ii8xMzIxNzU2MzAvMzU2OTMxOTU3LTk4YmQxZDNjLWYwYmEtNGQwYi04MDk4LWI2YjJmMzYxMzkxYS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODEyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgxMlQxMTQ4MjBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yZDc1OGNiY2Q4Y2EyM2ZiOTc5ODFkOWNjZDhlNGNkN2I0ZGI0MzVjNjExYzBjNDVmYmM1N2RiNjM0MDE3YjY1JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.l1YYJ56Fo0qZs3NsF7KDa9_VaWlCqhMq8iZV9k0oHp4" alt="">

<h2>ATUALIZAR PRODUTO</h2>
<p>É possível atualizar um produto já cadastrado após utilizar a função "Buscar produto por código ID". Logo após fazer as alterações, clique no botão "Atualizar". </p>
<img src="https://private-user-images.githubusercontent.com/132175630/356931955-7e1bd4e5-c28f-46bf-b4a0-13c3fb47ef79.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjM0NjM2MDAsIm5iZiI6MTcyMzQ2MzMwMCwicGF0aCI6Ii8xMzIxNzU2MzAvMzU2OTMxOTU1LTdlMWJkNGU1LWMyOGYtNDZiZi1iNGEwLTEzYzNmYjQ3ZWY3OS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODEyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgxMlQxMTQ4MjBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT04ODQ2YzY2M2M1Mzc3MWY1NGE5NThkYjA0ZDM0M2NmNzUzZjllYmM1MDA1YzRmMjUwY2VmNzY2NmU4NTkzNDEzJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.yeREQvhpUScCEXPz9c9Yk-yuEO1F5yvccKmzvnZTl5k" alt="">

<h2>REMOVER PRODUTO</h2>
<p>Para remover um produto cadastrado é necessário clicar na tabela o produto desejado e clicar no botão "Excluir"</p>
<img src="https://private-user-images.githubusercontent.com/132175630/356931970-13d79f08-ade4-48f3-bd20-ac9f08c39bce.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjM0NjM2MDAsIm5iZiI6MTcyMzQ2MzMwMCwicGF0aCI6Ii8xMzIxNzU2MzAvMzU2OTMxOTcwLTEzZDc5ZjA4LWFkZTQtNDhmMy1iZDIwLWFjOWYwOGMzOWJjZS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODEyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgxMlQxMTQ4MjBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT01YjkxOWRlYTQ1N2M3ODljODdjNDE1YWU2YzUyNTJjYjBjZjIzNjI1NDJmNDM2ZDAzZTlkMGFiNjA0YjNlYmVlJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.PcbUphgMuKq0H5HoTmYRa6RNY6IcQpQ7HeBFarohRbE" alt="">

