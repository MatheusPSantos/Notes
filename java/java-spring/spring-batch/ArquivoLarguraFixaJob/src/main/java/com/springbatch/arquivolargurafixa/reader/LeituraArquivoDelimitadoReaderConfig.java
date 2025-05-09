package com.springbatch.arquivolargurafixa.reader;

import com.springbatch.arquivolargurafixa.dominio.Cliente;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.transform.Range;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class LeituraArquivoDelimitadoReaderConfig {
    @StepScope
    @Bean
    public FlatFileItemReader<Cliente> leituraArquivodelimitadoReader(
            @Value("#{jobParameters['arquivoClientesDelimitado']}" ) Resource arquivoClientesDelimitado
    ) {

        return new FlatFileItemReaderBuilder<Cliente>()
                .name("leituraArquivodelimitadoReader" )
                .resource(arquivoClientesDelimitado)
                .delimited()
                .names(new String[]{"nome", "sobrenome", "idade", "email"})
                .targetType(Cliente.class)
                .build();
    }
}
