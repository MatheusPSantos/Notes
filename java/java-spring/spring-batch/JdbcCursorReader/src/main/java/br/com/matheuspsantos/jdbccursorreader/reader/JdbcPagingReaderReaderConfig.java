package br.com.matheuspsantos.jdbccursorreader.reader;

import br.com.matheuspsantos.jdbccursorreader.domain.Cliente;
import org.springframework.batch.item.database.JdbcPagingItemReader;
import org.springframework.batch.item.database.PagingQueryProvider;
import org.springframework.batch.item.database.builder.JdbcPagingItemReaderBuilder;
import org.springframework.batch.item.database.support.SqlPagingQueryProviderFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import javax.sql.DataSource;

@Configuration
public class JdbcPagingReaderReaderConfig {
    @Bean
    public JdbcPagingItemReader jdbcPagingItemReader(
            @Qualifier("appDatasource") DataSource dataSource,
            PagingQueryProvider queryProvider) {
        return new JdbcPagingItemReaderBuilder<Cliente>()
                .name("jdbcPagingItemReader")
                .dataSource(dataSource)
                .queryProvider(queryProvider)
                .pageSize(5)
                .rowMapper(new BeanPropertyRowMapper<>(Cliente.class))
                .build();
    }

    @Bean
    public SqlPagingQueryProviderFactoryBean queryProvider(@Qualifier("appDatasource") DataSource dataSource) {
        SqlPagingQueryProviderFactoryBean queryProvider = new SqlPagingQueryProviderFactoryBean();
        queryProvider.setSelectClause("SELECT *");
        queryProvider.setFromClause("cliente");
        queryProvider.setSortKey("email");
        return queryProvider;
    }
}
