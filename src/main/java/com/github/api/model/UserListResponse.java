package com.github.api.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Modelo de resposta para a listagem de usuários.
 * Contém a lista de usuários e o link para a próxima página (paginação).
 */
@Data // Lombok: gera getters, setters, toString, equals e hashCode
@AllArgsConstructor // Lombok: gera construtor com todos os parâmetros
public class UserListResponse {
    
    /** Lista de usuários retornados */
    private List<User> users;
    
    /** Link para a próxima página (formato: /api/users?since={id}) */
    private String nextPage;
}
