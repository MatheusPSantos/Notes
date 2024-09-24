package br.com.alura.codechella.config;

import br.com.alura.codechella.application.gateways.RepositorioUsuario;
import br.com.alura.codechella.application.usecases.CriarUsuario;
import br.com.alura.codechella.application.usecases.ListarUsuarios;
import br.com.alura.codechella.infra.gateways.RepositorioUsuarioJpa;
import br.com.alura.codechella.infra.gateways.UsuarioEntityMapper;
import br.com.alura.codechella.infra.persistence.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {
    @Bean
    CriarUsuario criarUsuario(RepositorioUsuario repositorio) {
        return new CriarUsuario(repositorio);
    }

    @Bean
    RepositorioUsuarioJpa criarRepositorioJpa(UsuarioRepository repositorio, UsuarioEntityMapper mapper) {
        return new RepositorioUsuarioJpa(repositorio, mapper);
    }

    @Bean
    UsuarioEntityMapper retornaMapper() {
        return new UsuarioEntityMapper();
    }

    @Bean
    ListarUsuarios listarUsuarios(RepositorioUsuarioJpa repositorio) {
        return new ListarUsuarios(repositorio);
    }
}
