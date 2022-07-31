package com.txt.zuulgatwayproxy;

import com.txt.zuulgatwayproxy.filters.ErrorFilter;
import com.txt.zuulgatwayproxy.filters.PostFilter;
import com.txt.zuulgatwayproxy.filters.PreFilter;
import com.txt.zuulgatwayproxy.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulgatwayproxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulgatwayproxyApplication.class, args);
    }

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }

    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
}
