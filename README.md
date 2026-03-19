# Projeto Clientes

Projeto Java com Spring Boot que servirá como base para uma API de gestão de clientes e fornecedores.

O foco atual foi estruturar o domínio inicial e preparar o terreno para a persistência em MongoDB.

## Objetivo

Construir uma API REST para cadastro e consulta de:

- clientes
- fornecedores
- enderecos associados

Este repositorio esta em fase inicial e ainda nao expoe endpoints HTTP.

## Stack utilizada

- Java 17
- Spring Boot
- Spring Web
- Spring Data MongoDB
- Bean Validation
- Maven
- Springdoc OpenAPI (Swagger)

## Estado atual do projeto

Ja existe:

- bootstrap da aplicacao Spring Boot
- modelos de dominio:
	- `Cliente`
	- `Fornecedor`
	- `Endereco`
- anotacoes de documento para MongoDB (`@Document`)
- campos com validacao basica via `@NotEmpty`
- dependencia para documentacao de API com Swagger

Ainda nao existe:

- controllers REST
- services
- repositories
- configuracao de conexao com MongoDB
- migracoes, seed de dados ou colecoes definidas

## Estrutura principal

```text
src/main/java/com/projclientes/projclientes/
	ProjclientesApplication.java
	model/
		Cliente.java
		Fornecedor.java
		Endereco.java
```

## Como executar

Pre-requisitos:

- Java 17+
- Maven 3.9+

Comandos:

```bash
mvn clean spring-boot:run
```

Ou, para gerar o pacote:

```bash
mvn clean package
java -jar target/projclientes-0.0.1-SNAPSHOT.jar
```

## Proximos passos (roadmap)

1. Definir e configurar conexao com MongoDB no `application.properties`.
2. Criar repositories para cada agregado principal.
3. Implementar camada de servicos com regras de negocio.
4. Expor endpoints REST para CRUD de clientes e fornecedores.
5. Adicionar tratamento global de erros e padronizacao de respostas.
6. Cobrir fluxos principais com testes unitarios e de integracao.
7. Publicar documentacao interativa via Swagger com exemplos reais.

## Observacoes

- Apesar de o projeto ja incluir dependencias para MongoDB e Swagger, a API ainda esta em construcao.
- A ideia e evoluir incrementalmente: primeiro dominio e persistencia, depois camada HTTP e testes.