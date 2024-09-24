package br.com.alura.codechella.vendas.dominio.evento;

import br.com.alura.codechella.vendas.dominio.ingresso.TipoIngresso;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Evento {
    private UUID uuid;
    private Categoria categoria;
    private String descricao;
    private LocalDateTime data;
    private Endereco endereco;
    private List<TipoIngresso> tipoIngressos = new ArrayList<>();

    public Evento(Categoria categoria, String descricao, LocalDateTime data, Endereco endereco) {
        this.categoria = categoria;
        this.descricao = descricao;
        this.data = data;
        this.endereco = endereco;

        gerarIdentificadorUnico();
    }

    private void gerarIdentificadorUnico() {
        this.uuid = UUID.randomUUID();
    }

    public void incluiNovoTipoDeIngressoAoEvento(TipoIngresso tipoIngresso) {
        this.tipoIngressos.add(tipoIngresso);
    }

    public void aumentoNumeroDeIngressosPorTipo() {
        // to de done
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public List<TipoIngresso> getTipoIngressos() {
        return tipoIngressos;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "categoria=" + categoria +
                ", descricao='" + descricao + '\'' +
                ", endereco=" + endereco +
                ", data=" + data +
                '}';
    }

    /**
     * Padrão Builder para classe de Evento
     */
    public static class Builder {
        private Evento evento;

        public Builder(Evento evento) {
            this.evento = evento;
        }

        public Builder comCategoria(Categoria categoria) {
            evento.categoria = categoria;
            return this;
        }

        public Builder comEndereco(Endereco endereco) {
            evento.endereco = endereco;
            return this;
        }

        public Builder comData(LocalDateTime data) {
            evento.data = data;
            return this;
        }

        public Evento build() {
            evento.gerarIdentificadorUnico();
            return evento;
        }
    }
}


