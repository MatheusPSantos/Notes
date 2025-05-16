package br.com.matheuspsantos.jdbccursorreader.reader;

import br.com.matheuspsantos.jdbccursorreader.domain.Cliente;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import javax.sql.DataSource;

@Configuration
public class JdbcCursorReaderConfig {

    public JdbcCursorItemReader<Cliente> jdbcCursorItemReader(
            @Qualifier("appDatasource")DataSource dataSource
            ) {
        return new JdbcCursorItemReaderBuilder<>()
                .name("jdbcCursorItemReader")
                .dataSource(dataSource)
                .sql("SELECT * FROM cliente")
                .rowMapper(new BeanPropertyRowMapper<>(Cliente.class))
                .build();
    }
}
