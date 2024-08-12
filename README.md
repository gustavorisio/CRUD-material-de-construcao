# CRUD-material-de-construcao

<h1>Seja bem vindo(a) ao meu repositório, este é um CRUD simples com todas as funções funcionais.</h1>
<p>Adicionar_produto  |  Atualizar_produto  |  Limpar  |  Excluir_produto  |  Buscar_ID  |  Recarregar_tabela </p>

<img src="https://private-user-images.githubusercontent.com/132175630/356931562-99ec9aa9-b767-48f9-a273-5e20a8495d72.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjM0MzUxMjcsIm5iZiI6MTcyMzQzNDgyNywicGF0aCI6Ii8xMzIxNzU2MzAvMzU2OTMxNTYyLTk5ZWM5YWE5LWI3NjctNDhmOS1hMjczLTVlMjBhODQ5NWQ3Mi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODEyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgxMlQwMzUzNDdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT04ZDFiYjgxNDBlOTYyNWJlNTQ1MmZhNzJiMzk2NGU3YTdiN2I1YzBkZmQ0NjU4OGM0OWM1N2M2NDI2YjIyMzQ5JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.tHETEn_4XZ7NKsTBvnx4EF9LgKTfIyT31zdZ2tusOT4" alt="">

<h2>COMO INSTALAR</h2>
<p>Primeiramente, você irá precisar utilizar o NetBeans IDE para abrir o projeto, certifique-se também de instalar em sua maquina o Mysql-Workbench e utilizar este código na criação de seu BD:</p>
<p>
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
 </p>
<p>Após a criação do BD acima, abra seu NetBeans, abra o projeto CRUD e rode a aplicação. NOTA: em caso de erro de senha do mysql, altere a senha em util>FabricaConexao colocando sua senha do mysql cadastrado! </p>

<h2>ADICIONAR PRODUTO</h2>
<p>Para cadastrar no banco de dados o produto, é necessário preencher as colunas vazias e clicar no botão "Adicionar novo" (é possível fazer um cadastro rápido preenchendo as colunas: "Nome" e "Valor de venda". Não é possível colocar caracter em colunas especificas.)</p>
<img src="https://private-user-images.githubusercontent.com/132175630/356931957-98bd1d3c-f0ba-4d0b-8098-b6b2f361391a.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjM0MzUzMTIsIm5iZiI6MTcyMzQzNTAxMiwicGF0aCI6Ii8xMzIxNzU2MzAvMzU2OTMxOTU3LTk4YmQxZDNjLWYwYmEtNGQwYi04MDk4LWI2YjJmMzYxMzkxYS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODEyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgxMlQwMzU2NTJaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT03Yzc0YTJlYTQ0Y2MxM2Y3NWJjYmZhYTNiNGMxNWE2ZDdhOTc1ZDViZGY0MmRiOTU3ZmEwMDE2NWU1ZjA4NDk4JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.YTRlijHBfUPGbHMNuM_7w79qUyKGlsXKX2m4PsoWziU" alt="">

<h2>ATUALIZAR PRODUTO</h2>
<p>É possível atualizar um produto já cadastrado após utilizar a função "Buscar produto por código ID". Logo após fazer as alterações, clique no botão "Atualizar". </p>
<img src="https://private-user-images.githubusercontent.com/132175630/356931955-7e1bd4e5-c28f-46bf-b4a0-13c3fb47ef79.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjM0MzUzMTIsIm5iZiI6MTcyMzQzNTAxMiwicGF0aCI6Ii8xMzIxNzU2MzAvMzU2OTMxOTU1LTdlMWJkNGU1LWMyOGYtNDZiZi1iNGEwLTEzYzNmYjQ3ZWY3OS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODEyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgxMlQwMzU2NTJaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1kYTczOGE4OGU5ZTI1MWRkNGFiYTQ1NGEwYjU5ZWE5ZTk3NjIzNjgxM2U2MmI3ZjdjMzNiYjkzNzFkMTJlZDFlJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.G-nYJ37R9VS-bKQ-7Pfwp7Ws6-3UPgdke9yhIgaVF4s" alt="">

<h2>REMOVER PRODUTO</h2>
<p>Para remover um produto cadastrado é necessário clicar na tabela o produto desejado e clicar no botão "Excluir"</p>
<img src="https://private-user-images.githubusercontent.com/132175630/356931970-13d79f08-ade4-48f3-bd20-ac9f08c39bce.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjM0MzUzMTIsIm5iZiI6MTcyMzQzNTAxMiwicGF0aCI6Ii8xMzIxNzU2MzAvMzU2OTMxOTcwLTEzZDc5ZjA4LWFkZTQtNDhmMy1iZDIwLWFjOWYwOGMzOWJjZS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODEyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgxMlQwMzU2NTJaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1iZWUxNmUxYjdhNDhkOTNhZGM0YWU0ZDUwOTc4MjUwNGViZGM1ZjhmYTI1NDhlYmNmYjlmZDM1YzgyZGUzMTkzJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.6CmcInRHz6wdaE4n8Cui0MZIqnrM-tIRyOxq-SPon3g" alt="">

