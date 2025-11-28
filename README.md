# GitHub API Proxy

API simples em Java usando Spring Boot e Lombok que encaminha requisições para a API do GitHub.

## Endpoints

### GET /api/users?since={number}
Retorna uma lista de usuários do GitHub e o link para a próxima página.

**Exemplo:**
```
GET http://localhost:8080/api/users?since=0
```

**Resposta:**
```json
{
  "users": [
    {
      "id": 1,
      "login": "mojombo",
      "avatarUrl": "https://avatars.githubusercontent.com/u/1?v=4",
      "htmlUrl": "https://github.com/mojombo",
      "type": "User"
    }
  ],
  "nextPage": "/api/users?since=46"
}
```

### GET /api/users/{username}
Retorna os detalhes de um usuário específico.

**Exemplo:**
```
GET http://localhost:8080/api/users/mojombo
```

**Resposta:**
```json
{
  "id": 1,
  "login": "mojombo",
  "name": "Tom Preston-Werner",
  "avatarUrl": "https://avatars.githubusercontent.com/u/1?v=4",
  "htmlUrl": "https://github.com/mojombo",
  "bio": "...",
  "company": "...",
  "location": "San Francisco",
  "publicRepos": 64,
  "followers": 23000,
  "following": 11,
  "createdAt": "2007-10-20T05:24:19Z"
}
```

## Como executar

```bash
mvn spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`
