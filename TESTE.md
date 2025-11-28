# Como Testar a API

A aplicação está rodando em `http://localhost:8080`

## Testar os Endpoints

### 1. Listar usuários do GitHub
```bash
curl http://localhost:8080/api/users?since=0
```

### 2. Obter detalhes de um usuário específico
```bash
curl http://localhost:8080/api/users/mojombo
```

### 3. Navegar para a próxima página
Use o valor `nextPage` retornado na resposta anterior:
```bash
curl http://localhost:8080/api/users?since=46
```

## Executar a aplicação

```bash
mvn spring-boot:run
```

## Compilar o projeto

```bash
mvn clean install
```
