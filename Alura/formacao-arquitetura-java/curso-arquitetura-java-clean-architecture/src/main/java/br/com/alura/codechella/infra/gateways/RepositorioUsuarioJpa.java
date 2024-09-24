package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.application.gateways.RepositorioUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.persistence.UsuarioEntity;
import br.com.alura.codechella.infra.persistence.UsuarioRepository;

import java.util.List;
import java.util.stream.Collectors;

public class RepositorioUsuarioJpa implements RepositorioUsuario {
    private final UsuarioRepository repositorio;
    private final UsuarioEntityMapper mapper;

    public RepositorioUsuarioJpa(UsuarioRepository repositorio, UsuarioEntityMapper mapper) {
        this.repositorio = repositorio;
        this.mapper = mapper;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        UsuarioEntity entity = mapper.toEntity(usuario);
        return mapper.toDomain(repositorio.save(entity));
    }

    @Override
    public List<Usuario> listarTodos() {
        return repositorio.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Usuario alteraUsuario(String cpf, String email) {
        UsuarioEntity usuarioEntity = repositorio.findByCpf(cpf);
        usuarioEntity.setEmail(email);
        repositorio.save(usuarioEntity);
        return mapper.toDomain(usuarioEntity);
    }

}
