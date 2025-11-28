package com.github.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Classe principal da aplicação GitHub API Proxy.
 * Esta aplicação atua como um proxy para a API do GitHub,
 * encaminhando requisições dos clientes para os endpoints apropriados.
 */
@SpringBootApplication
@EnableFeignClients // Habilita o uso de Feign Clients para comunicação HTTP
public class GitHubApiProxyApplication {
    
    /**
     * Método principal que inicia a aplicação Spring Boot.
     * 
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {
        SpringApplication.run(GitHubApiProxyApplication.class, args);
    }
}
