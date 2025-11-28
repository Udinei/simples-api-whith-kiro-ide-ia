package com.github.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Modelo que representa os detalhes completos de um usuário do GitHub.
 * Contém informações detalhadas sobre o perfil do usuário.
 */
@Data // Lombok: gera getters, setters, toString, equals e hashCode
public class UserDetails {
    
    /** ID único do usuário no GitHub */
    private Long id;
    
    /** Nome de usuário (login) do GitHub */
    private String login;
    
    /** Nome completo do usuário */
    private String name;
    
    /** URL do avatar do usuário */
    @JsonProperty("avatar_url")
    private String avatarUrl;
    
    /** URL do perfil do usuário no GitHub */
    @JsonProperty("html_url")
    private String htmlUrl;
    
    /** Biografia do usuário */
    private String bio;
    
    /** Empresa onde o usuário trabalha */
    private String company;
    
    /** Localização do usuário */
    private String location;
    
    /** Email público do usuário */
    private String email;
    
    /** Número de repositórios públicos */
    @JsonProperty("public_repos")
    private Integer publicRepos;
    
    /** Número de seguidores */
    private Integer followers;
    
    /** Número de pessoas que o usuário segue */
    private Integer following;
    
    /** Data de criação da conta */
    @JsonProperty("created_at")
    private String createdAt;
}
