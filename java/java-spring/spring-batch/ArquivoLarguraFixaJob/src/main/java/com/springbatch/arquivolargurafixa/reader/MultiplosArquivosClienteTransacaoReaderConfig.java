package com.springbatch.arquivolargurafixa.reader;

import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.builder.MultiResourceItemReaderBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class MultiplosArquivosClienteTransacaoReaderConfig {
    /**
     * Leitura de vários arquivos
     *
     * @return
     */
    @Bean
    public MultiResourceItemReader multiplosArquivosClientesTransacaoReader(
            @Value("#{jobParameters['arquivosClientes']}") Resource[] arquivosClientes,
            FlatFileItemReader leituraArquivoMultiplosFormatosReader
    ) {
        return new MultiResourceItemReaderBuilder<>()
                .name("multiplosArquivosClientesTransacaoReader")
                .resources(arquivosClientes)
                .delegate(new ArquivoClienteTransacoesReader(leituraArquivoMultiplosFormatosReader))
                .build();
    }
}
