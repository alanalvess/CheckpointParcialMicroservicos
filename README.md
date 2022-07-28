# Checkpoint Parcial da disciplina de Especialização em Backend-Java do curso Certified Tech Developer da Digital House

> Projeto desenvolvido utilizando a linguagem Java e o Framework Spring. Consiste em uma aplicação de microserviços utilizando o Spring Cloud.

## O problema

A partir da seguinte arquitetura de microsserviços, pedimos que você a implemente usando o Spring Cloud

## Estrutura

- Dois microsserviços: filme e catalogo
- O catalogo deve consumir dados de filme utilizando Feign que por sua vez consome dados de um banco de dados
- O Gateway fará o roteamento para ambos os microsserviços
- O ConfigServer obtem as configurações a partir deste repositório git
- O Eureka para service discovery & service registry

## Endpoints `Gateway`

- `POST`  - `http://localhost:8080/filme` para cadastro de filme
- `GET`   - `http://localhost:8080/filme/{genero}` para trazer filmes por gênero
- `GET`   - `http://localhost:8080/catalogo/{genero}` retorna o catalogo de filmes por gênero.
