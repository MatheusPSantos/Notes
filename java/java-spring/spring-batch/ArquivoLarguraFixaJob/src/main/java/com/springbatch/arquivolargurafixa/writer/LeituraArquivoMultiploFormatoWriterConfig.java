package com.springbatch.arquivolargurafixa.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LeituraArquivoMultiploFormatoWriterConfig {

    @Bean
    public FlatFileItemReader leituraArquivoMultiploFormatoWriter() {
        return new ItemWriter();
    }
}
