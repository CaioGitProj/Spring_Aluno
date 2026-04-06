# TRABALHO DE BACKEND
Este projeto consiste em uma **API RESTful** simplificada para o gerenciamento de alunos e professores, desenvolvida com o objetivo de aplicar conceitos fundamentais de desenvolvimento Java e arquitetura de software.

---
## 🛠️ Tecnologias Utilizadas

O projeto foi construído utilizando as seguintes ferramentas:

* **Linguagem:** Java 21
* **Framework:** Spring Boot
* **Banco de Dados:** PostgreSQL
* **Documentação/Testes:** Insomnia (Cliente HTTP)

---
## 🏗️ Arquitetura e Princípios REST

A API segue os princípios arquiteturais **REST**, garantindo uma comunicação padronizada e uma clara separação de responsabilidades.

### 📂 Divisão de Camadas (SoC)
O projeto está organizado para que cada parte do código tenha uma função específica:

| Camada | Responsabilidade                                                          |
| :--- |:--------------------------------------------------------------------------|
| **Controller** | Recebe as requisições (requests) e envia as respostas (responses) .       |
| **Service** | Regra de negócio                                                          |
| **Repository** | Responsável pela comunicação e persistência de dados no banco PostgreSQL. |
| **Model** | Define as entidades e a estrutura das tabelas do banco de dados.          |

### 🛰️ Comunicação
* **Formato:** As trocas de dados são realizadas inteiramente via **JSON**.
* **Verbos HTTP:** Uso semântico de `GET`, `POST`, `PUT` e `DELETE`.

---
## Detalhamento do código
Os models de Aluno e Professor são praticamente idênticos.
* No início usamos o Lombok para criar os construtores usando as variáveis criadas ou um construtor vazio
    * @AllArgsConstructor
    * @NoArgsConstructor
* Depois, destacamos que o código abaixo vai ser uma tabela de dados
  * @Data
  * @Table(name = "Nome da Tabela...")
    * Aqui, criamos uma tabela e damos um nome a ela
  * @Entity
    * Destaca que é uma entidade 
