package com.glqdlt.simpleweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created By iw.jhun
 * On 2018-03-27 , 오후 5:15
 */
@Configuration
@EnableWebMvc
public class SimpleWebConfig extends WebMvcConfigurerAdapter {

    public SimpleWebConfig() {
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        super.addResourceHandlers(registry);
        registry.addResourceHandler("/webjars/**").addResourceLocations("/webjars/");
    }
}
