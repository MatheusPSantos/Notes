package br.com.alura.codechella.domain.entities.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {
    @Test
    public void naoDeveCadastrarCpfNaoFormatoInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Usuario(
                "123456789-99", "Jhon", LocalDate.parse("1997-08-19"), "jhon@doe.com"
        ));
    }

    @Test
    public void naoDeveCadastrarCpfNaoInformado() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Usuario(
                "", "Jhon", LocalDate.parse("1997-08-19"), "jhon@doe.com"
        ));
    }

    @Test
    public void naoDeveCadastrarUsuarioComMenosDe18anos() {
        LocalDate dataNascimento = LocalDate.now().minusYears(17);
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Usuario("123.456.789-00", "Fulano", dataNascimento, "fulano@example.com");
        });

        Assertions.assertEquals("Usuário deve ter pelo menos 18 anos de idade!", exception.getMessage());
    }

    @Test
    public void deveCriarUsuarioUsandoFabricaDeUsuario() {
        FabricaUsuario fabrica = new FabricaUsuario();
        Usuario usuario = fabrica.comNomeCpfNascimento("jhon", "123.456.789-99", LocalDate.parse("2000-01-01"));

        Assertions.assertEquals("jhon", usuario.getNome());

        usuario = fabrica.incluiEndereco("8630222", 123, "Casa");

        Assertions.assertEquals("Casa", usuario.getEndereco().getComplemento());
    }
}
