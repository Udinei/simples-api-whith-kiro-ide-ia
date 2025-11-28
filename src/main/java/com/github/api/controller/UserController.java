package com.github.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.api.model.UserDetails;
import com.github.api.model.UserListResponse;
import com.github.api.service.GitHubService;
import lombok.RequiredArgsConstructor;

/**
 * Controller REST responsável por expor os endpoints relacionados a usuários do GitHub.
 * Atua como um proxy, encaminhando as requisições para o serviço apropriado.
 */
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor // Lombok: gera construtor com campos final para injeção de dependência
public class UserController {
    
    private final GitHubService gitHubService;
    
    /**
     * Endpoint para listar usuários do GitHub com paginação.
     * 
     * @param since ID do último usuário da página anterior (opcional)
     * @return ResponseEntity contendo a lista de usuários e o link para a próxima página
     * 
     * Exemplo: GET /api/users?since=0
     */
    @GetMapping
    public ResponseEntity<UserListResponse> getUsers(
            @RequestParam(required = false) Integer since) {
        UserListResponse response = gitHubService.getUsers(since);
        return ResponseEntity.ok(response);
    }
    
    /**
     * Endpoint para obter detalhes de um usuário específico do GitHub.
     * 
     * @param username nome de usuário do GitHub
     * @return ResponseEntity contendo os detalhes completos do usuário
     * 
     * Exemplo: GET /api/users/mojombo
     */
    @GetMapping("/{username}")
    public ResponseEntity<UserDetails> getUserDetails(
            @PathVariable String username) {
        UserDetails userDetails = gitHubService.getUserDetails(username);
        return ResponseEntity.ok(userDetails);
    }
}
