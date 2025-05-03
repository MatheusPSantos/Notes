package com.springbatch.arquivolargurafixa.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArquivoMultiploFormatoJobConfig {

    @Bean
    public Job arquivoMultiploFormatoJob(Step arquivoMultiploFormatoStep, JobRepository jobRepository) {
        return new JobBuilder("arquivoMultiploFormatoJob", jobRepository)
                .start(arquivoMultiploFormatoStep)
                .incrementer(new RunIdIncrementer())
                .build();
    }
}
