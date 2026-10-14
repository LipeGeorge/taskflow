# TaskFlow

Sistema de gerenciamento e agendamento de tarefas desenvolvido com **Java e Spring Boot**.

O TaskFlow tem como objetivo permitir que usuários criem, organizem e acompanhem tarefas com datas, horários, prioridades, categorias e diferentes estados de execução.

O projeto foi concebido para aplicar, na prática, conceitos de desenvolvimento de APIs REST, persistência de dados, regras de negócio, autenticação, validação, testes e boas práticas de arquitetura.

---

## Sobre o projeto

O TaskFlow permite organizar atividades de acordo com:

- Data e horário de execução;
- Prazo de conclusão;
- Prioridade;
- Status;
- Categoria;
- Usuário responsável.

---

## Funcionalidades

### Gerenciamento de tarefas

- Criar tarefas;
- Consultar tarefas;
- Atualizar tarefas;
- Excluir tarefas;
- Iniciar tarefas;
- Concluir tarefas;
- Cancelar tarefas;
- Definir prioridade;
- Definir data e horário;
- Definir prazo de conclusão.

### Organização

- Criar categorias;
- Associar tarefas a categorias;
- Filtrar tarefas por status;
- Filtrar tarefas por prioridade;
- Filtrar tarefas por categoria;
- Filtrar tarefas por período;
- Ordenar resultados;
- Paginar resultados.

### Usuários

- Cadastro de usuários;
- Consulta de usuários;
- Atualização de dados;
- Exclusão de usuários;
- Associação entre usuários e suas tarefas.

### Segurança

Planejado:

- Spring Security;
- Autenticação utilizando JWT;
- Autorização baseada no usuário autenticado;
- Proteção dos recursos da API.

### Agendamento

Planejado para versões futuras:

- Lembretes;
- Notificações;
- Tarefas recorrentes;
- Execução de tarefas agendadas.

---

## Tecnologias

| Tecnologia | Utilização |
|---|---|
| Java 25 | Linguagem principal |
| Spring Boot | Framework da aplicação |
| Spring Web | Desenvolvimento da API REST |
| Spring Data JPA | Persistência de dados |
| Hibernate | ORM |
| PostgreSQL | Banco de dados |
| Bean Validation | Validação dos dados |
| Spring Security | Autenticação e autorização |
| JWT | Autenticação baseada em tokens |
| Flyway | Migrações do banco de dados |
| Maven | Gerenciamento do projeto |
| Swagger/OpenAPI | Documentação da API |
| JUnit | Testes automatizados |
| Mockito | Testes unitários |
| Docker | Containerização |

---

## Arquitetura

O projeto utiliza uma arquitetura em camadas para separar as responsabilidades da aplicação.

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
Database
```

## Relacionamentos:

```
User 1:N Task

User 1:N Category

Category 1:N Task

Task 1:N TaskReminder
```

---

## Status das tarefas

As tarefas possuem quatro estados principais:

```text
PENDING
IN_PROGRESS
COMPLETED
CANCELLED
```

Fluxo previsto:

```text
PENDING
   │
   ├──────────────► CANCELLED
   │
   ▼
IN_PROGRESS
   │
   ├──────────────► CANCELLED
   │
   ▼
COMPLETED
```

As transições de estado são controladas pelas regras de negócio da aplicação.

---

## Prioridades

As tarefas podem possuir diferentes níveis de prioridade:

```text
LOW
MEDIUM
HIGH
URGENT
```

---

## Aprendizado

[Será preenchida após a conclusão da primeira versão da aplicação.]
