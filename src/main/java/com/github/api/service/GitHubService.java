package com.github.api.service;

import com.github.api.client.GitHubClient;
import com.github.api.model.User;
import com.github.api.model.UserDetails;
import com.github.api.model.UserListResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Serviço responsável pela lógica de negócio relacionada aos usuários do GitHub.
 * Utiliza o GitHubClient para fazer requisições à API do GitHub e processa as respostas.
 */
@Service
@RequiredArgsConstructor // Lombok: gera construtor com campos final para injeção de dependência
public class GitHubService {
    
    private final GitHubClient gitHubClient;
    
    /**
     * Busca uma lista de usuários do GitHub com paginação.
     * 
     * @param since ID do último usuário da página anterior (pode ser null)
     * @return UserListResponse contendo a lista de usuários e o link para a próxima página
     */
    public UserListResponse getUsers(Integer since) {
        // Define o valor padrão como 0 se since for null
        int sinceValue = since != null ? since : 0;
        
        // Busca 30 usuários a partir do ID especificado
        List<User> users = gitHubClient.getUsers(sinceValue, 30);
        
        // Gera o link para a próxima página baseado no ID do último usuário
        String nextPage = null;
        if (users != null && !users.isEmpty()) {
            Long lastId = users.get(users.size() - 1).getId();
            nextPage = "/api/users?since=" + lastId;
        }
        
        return new UserListResponse(users, nextPage);
    }
    
    /**
     * Busca os detalhes completos de um usuário específico do GitHub.
     * 
     * @param username nome de usuário do GitHub
     * @return UserDetails contendo todas as informações do usuário
     */
    public UserDetails getUserDetails(String username) {
        return gitHubClient.getUserDetails(username);
    }
}
