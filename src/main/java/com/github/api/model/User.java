package com.github.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Modelo que representa um usuário do GitHub (versão resumida).
 * Utilizado na listagem de usuários.
 */
@Data // Lombok: gera getters, setters, toString, equals e hashCode
public class User {
    
    /** ID único do usuário no GitHub */
    private Long id;
    
    /** Nome de usuário (login) do GitHub */
    private String login;
    
    /** URL do avatar do usuário */
    @JsonProperty("avatar_url")
    private String avatarUrl;
    
    /** URL do perfil do usuário no GitHub */
    @JsonProperty("html_url")
    private String htmlUrl;
    
    /** Tipo de conta (User, Organization, etc.) */
    private String type;
}
