package br.com.alura.codechella.vendas.aplicacao.evento;

import br.com.alura.codechella.vendas.infra.evento.Endereco;
import br.com.alura.codechella.vendas.infra.evento.Evento;

public interface RepositorioDeEvento {
    Evento buscarEventoPorCidade(Endereco endereco);
}
