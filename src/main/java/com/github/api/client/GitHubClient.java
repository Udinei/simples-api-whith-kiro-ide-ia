package com.github.api.client;

import com.github.api.model.User;
import com.github.api.model.UserDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Cliente Feign para comunicação com a API do GitHub.
 * O Feign cria automaticamente a implementação desta interface,
 * gerenciando as requisições HTTP de forma declarativa.
 */
@FeignClient(name = "github-api", url = "https://api.github.com")
public interface GitHubClient {
    
    /**
     * Busca uma lista de usuários do GitHub.
     * 
     * @param since ID do usuário a partir do qual buscar (paginação)
     * @param perPage quantidade de usuários por página
     * @return lista de usuários
     * 
     * Endpoint: GET https://api.github.com/users?since={since}&per_page={perPage}
     */
    @GetMapping("/users")
    List<User> getUsers(@RequestParam(value = "since", defaultValue = "0") Integer since,
                        @RequestParam(value = "per_page", defaultValue = "30") Integer perPage);
    
    /**
     * Busca os detalhes de um usuário específico do GitHub.
     * 
     * @param username nome de usuário do GitHub
     * @return detalhes completos do usuário
     * 
     * Endpoint: GET https://api.github.com/users/{username}
     */
    @GetMapping("/users/{username}")
    UserDetails getUserDetails(@PathVariable String username);
}
