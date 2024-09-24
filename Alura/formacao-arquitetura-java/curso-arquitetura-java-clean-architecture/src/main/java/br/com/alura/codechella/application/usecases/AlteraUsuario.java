package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.application.gateways.RepositorioUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;

public class AlteraUsuario {
    private final RepositorioUsuario repositorio;

    public AlteraUsuario(RepositorioUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public Usuario alteraDadosUsuario(Usuario usuario) {
        return repositorio.alteraUsuario(usuario.getCpf(), usuario.getEmail());
    }
}
