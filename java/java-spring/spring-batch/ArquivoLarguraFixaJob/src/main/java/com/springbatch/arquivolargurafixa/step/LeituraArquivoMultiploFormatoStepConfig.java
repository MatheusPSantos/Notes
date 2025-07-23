package com.springbatch.arquivolargurafixa.step;

import com.springbatch.arquivolargurafixa.dominio.Cliente;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class LeituraArquivoMultiploFormatoStepConfig {

    @Autowired
    final private PlatformTransactionManager platformTransactionManager;

    public LeituraArquivoMultiploFormatoStepConfig(PlatformTransactionManager platformTransactionManager) {
        this.platformTransactionManager = platformTransactionManager;
    }

    @Bean
    public Step arquivoMultiploFormatoStep(
            MultiResourceItemReader<Cliente> multiplosArquivosClientesTransacaoReader,
            ItemWriter<> leituraArquivoMultiploFormatoWriter,
            JobRepository jobRepository) {
        return new StepBuilder("arquivoMultiploFormatoStep", jobRepository)
                .<Cliente, Cliente>chunk(1, platformTransactionManager)
                .reader(multiplosArquivosClientesTransacaoReader)
                .writer(leituraArquivoMultiploFormatoWriter)
                .build();
    }
}
