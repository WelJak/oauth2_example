package weljak.oauth2poc.database;

import ch.vorburger.mariadb4j.springframework.MariaDB4jSpringService;

import com.mysql.jdbc.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Profile("development")
@Configuration
public class DbConfig {
    protected static final int DB_PORT = 3310;

    @Bean
    @DependsOn("mariadb4j")
    public DataSource dataSource(){
        SimpleDriverDataSource simpleDriver = new SimpleDriverDataSource();
        simpleDriver.setDriverClass(Driver.class);
        simpleDriver.setUrl(String.format("jdbc:mysql://localhost:%d/test", DB_PORT));
        simpleDriver.setUsername("root");
        return simpleDriver;
    }

    @Bean(name = "mariadb4j")
    public MariaDB4jSpringService mariaDB4j(){
        MariaDB4jSpringService service = new MariaDB4jSpringService();
        return service;
    }
}
