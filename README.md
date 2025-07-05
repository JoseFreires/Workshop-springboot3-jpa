# Workshop SpringBoot3 JPA

## Introdução

<p>Este projeto foi criado com orientação do curso de Java na Udemy pelo professor 
Nélio Alves. O objetivo do projeto é apresentar e ensinar as ferramentas do Spring
Boot e como realizar um CRUD com a linguagem Java utilizando bibliotecas que executam isso.</p>

## Ferramentas Utilizadas

<p>Para a realização deste projeto foi utilizado algumas ferramentas que seguem abaixo:</p>

* Spring Boot;
* Apache Tomcat;
* Maven;
* POSTMAN;
* H2.

## Domain Model



## Conceitos Explorados

<p>Como intuito do projeto era o aprendizado, alguns conceitos foram explorados, como:</p>

* <b>Programação Orientada a Objetos (POO):</b> Utilizamos para controlar as informações presentes no projetos;
* <b>CRUD (Create, Read, Update, Delete):</b> Realizamos essas 4 operações básicas no projeto;
* <b>Configuração de Banco de Dados (H2):</b> Todo o banco de dados precisa ser integrado a sua aplicação, é apresentado como realizar isso no banco de dados H2;
* <b>Estruturar Camadas Lógicas (resource, service, repository):</b> Foi apresentado como criar camadas para a melhor execução da aplicação;
* <b>Tratamento de Exceções:</b> Aprendendo a tratar erros que podem ocorrer com a aplicação e como não parar a aplicação caso ocorram.

## Explicando as camadas do projeto
* <b>Camada Repositories:</b> Nesta camada utilizamos a interface JPARepository, uma interface que quando implementada em uma classe facilita a execução dos métodos CRUD sem precisar escrever um extenso código para isso;
* <b>Camada Service:</b> Nesta camada que de fato executamos os métodos CRUD;
* <b>Camada Resource:</b> Nesta camada mapeamos como executar a aplicação por uma API REST, neste caso de forma local.

## Agradecimentos

<p>Queria agradecer ao professor Nélio Alves por mais um conhecimento do seu curso de Java, pois com sua didática clara e direta foi possível criar esse projeto e agregar em meu ramo profissional um novo conhecimento de uma linguagem que gosto tanto que é Java. Acredito que com esse projeto de hoje, criarei melhores projetos amanhã.</p>