package com.springbatch.arquivolargurafixa.writer;

import com.springbatch.arquivolargurafixa.dominio.Cliente;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LeituraArquivoDelimitadoWriterConfig {
    @Bean
    public ItemWriter<Cliente> leituraArquivodelimitadoWriter() {
        return items -> items.forEach(System.out::println);
    }
}
