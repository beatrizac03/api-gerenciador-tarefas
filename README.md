# [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" alt="spring" width="25"/>](https://spring.io/projects/spring-boot) Gerenciador de Tarefas - API Spring Boot
Desenvolvida com Java 17 e utilizando o framework Spring Boot no back-end, a API permite o CRUD (Create, Read, Update, Delete) de tarefas, simulando um cenário real de gerenciamento.

<br>

## 🌐 URL da API

A API está hospedada e pode ser acessada publicamente através da URL:

[https://api-gerenciador-tarefas-wm3g.onrender.com/](https://api-gerenciador-tarefas-wm3g.onrender.com/)

<br>

## 🛠 Tecnologias
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="java" width="35"/> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" alt="spring" width="35"/>  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/maven/maven-original.svg" alt="maven" width="35"/>
<img src="https://www.postgresql.org/media/img/about/press/elephant.png" width="35" alt="PostgreSQL Logo"/>
<img src="https://img.shields.io/badge/Supabase-000000?logo=supabase&logoColor=white" alt="Supabase Logo" width="100"/>
[![Deploy on Render](https://img.shields.io/badge/Hosted%20on-Render-3f49d1?logo=render&logoColor=white)](https://render.com)

<br>

## ✅ Requisitos para executar
- Java 17+
- Maven 3.6+
- IDE (ex: IntelliJ, VSCode ou Eclipse)
- Extensões VSCode: SpringBoot Extension Pack, Java Extension Pack

<br>

## 🚀 Endpoints disponíveis

* GET /tarefas – Lista todas as tarefas
* GET /tarefas/{id} – Retorna uma tarefa específica
* POST /tarefas – Cadastra uma nova tarefa
* PUT /tarefas/{id} – Atualiza uma tarefa específica
* DELETE /tarefas/{id} – Deleta uma tarefa específica

<br>

## 📂 Estrutura do Projeto
- `controller/`: Contém os endpoints da API.
- `model/`: Entidades JPA (Tarefa).
- `repository/`: Interfaces para acesso ao banco de dados.
- `service/`: Lógica de negócio da aplicação.
- `application.yml`: Configurações do banco de dados e JPA.

<br>

## 🌐 Banco de Dados e Deploy
A aplicação utiliza o **PostgreSQL** como banco de dados, hospedado na **Supabase**, que oferece um banco de dados gerenciado e altamente escalável. Para facilitar o desenvolvimento e o uso da API, o banco de dados foi configurado para ser acessado diretamente a partir da aplicação.

A API está hospedada no **Render**, uma plataforma de deploy na nuvem, garantindo uma solução de backend escalável e de alta disponibilidade.

- Banco de dados: **PostgreSQL** hospedado na **Supabase**
- Deploy da aplicação: **Render**

<br>

## 🔧 Rodando Localmente

Para rodar a aplicação localmente, é necessário configurar o próprio banco de dados. 

1. Crie um arquivo `.env` na raiz do projeto e adicione as seguintes variáveis de ambiente:

    ```bash
    DB_URL=jdbc:postgresql://<URL_DO_BANCO>
    DB_USERNAME=<SEU_USUARIO>
    DB_PASSWORD=<SUA_SENHA>
    ```

2. Certifique-se de ter o banco de dados configurado corretamente e que as credenciais fornecidas no arquivo `.env` correspondam às de sua instância PostgreSQL.

3. Execute a aplicação com o comando:

    ```bash
    mvn spring-boot:run
    ```

Isso irá configurar o acesso ao banco de dados e permitir que você execute a API localmente.

<br>
