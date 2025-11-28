# Mensagem de Commit

```
feat: implementar API proxy para GitHub com Spring Boot e Feign Client

Criada aplicação REST que atua como proxy para a API do GitHub,
encaminhando requisições dos clientes para os endpoints apropriados.

Funcionalidades implementadas:
- Endpoint GET /api/users?since={number} para listar usuários com paginação
- Endpoint GET /api/users/{username} para obter detalhes de um usuário
- Integração com GitHub API usando Feign Client
- Suporte a paginação com link para próxima página

Tecnologias utilizadas:
- Spring Boot 3.2.0
- Java 21
- Spring Cloud OpenFeign 4.1.0
- Lombok 1.18.34
- Maven

Estrutura do projeto:
- Controller: UserController (endpoints REST)
- Service: GitHubService (lógica de negócio)
- Client: GitHubClient (comunicação com GitHub API via Feign)
- Models: User, UserDetails, UserListResponse

Código totalmente documentado com JavaDoc e comentários explicativos.
```

---

## Alternativas mais curtas:

### Opção 1 (Conventional Commits):
```
feat: adicionar API proxy para GitHub com paginação

- Implementar endpoints /api/users e /api/users/{username}
- Integrar com GitHub API usando Feign Client
- Adicionar suporte a paginação de usuários
```

### Opção 2 (Simples):
```
feat: criar API proxy para GitHub

API REST que encaminha requisições para GitHub API com suporte a
listagem de usuários (paginada) e detalhes de usuário específico.
```

### Opção 3 (Detalhada):
```
feat: implementar GitHub API Proxy com Spring Boot

Endpoints:
- GET /api/users?since={number} - lista usuários com paginação
- GET /api/users/{username} - detalhes do usuário

Stack: Spring Boot 3.2.0, Java 21, Feign Client, Lombok
```
