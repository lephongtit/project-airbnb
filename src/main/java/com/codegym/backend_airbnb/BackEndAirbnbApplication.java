package com.codegym.backend_airbnb;

import com.codegym.backend_airbnb.service.HouseService;
import com.codegym.backend_airbnb.service.impl.HouseServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BackEndAirbnbApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackEndAirbnbApplication.class, args);
    }
    @Bean
    public HouseService houseService(){
        return new HouseServiceImpl();
    }
    @Configuration
    class WebConfig implements WebMvcConfigurer, ApplicationContextAware {

        private ApplicationContext appContext;

        @Override
        public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            appContext = applicationContext;
        }
    }
}
