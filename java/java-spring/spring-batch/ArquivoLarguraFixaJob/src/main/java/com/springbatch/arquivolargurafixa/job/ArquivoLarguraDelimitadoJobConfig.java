package com.springbatch.arquivolargurafixa.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ArquivoLarguraDelimitadoJobConfig {
    @Primary
    @Bean
    public Job arquivoDelimitadoJob(Step leituraArquivoDelimitadoStep, JobRepository jobRepository) {
        System.out.println("--------- ARQUIVO DELIMITADO -------------");
        return new JobBuilder("arquivoDelimitadoJob", jobRepository)
                .start(leituraArquivoDelimitadoStep)
                .incrementer(new RunIdIncrementer())
                .build();
    }
}
