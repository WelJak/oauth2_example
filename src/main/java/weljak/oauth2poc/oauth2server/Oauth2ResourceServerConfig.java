package weljak.oauth2poc.oauth2server;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class Oauth2ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity httpSecurity)throws Exception{
        httpSecurity
                .requestMatchers()
                .antMatchers("/index/*")
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated();

    }

}
