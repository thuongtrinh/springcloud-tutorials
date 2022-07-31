package com.txt.spring.cloud.bootstrap.svcrating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.netflix.hystrix.contrib.javanica.aop.aspectj.HystrixCommandAspect;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableTransactionManagement(order=Ordered.LOWEST_PRECEDENCE, mode=AdviceMode.ASPECTJ)
public class RatingServiceApplication {

//    @Autowired
//    private EurekaClient eurekaClient;

//    @Value("${spring.sleuth.web.skipPattern}")
//    private String skipPattern;

//    @Autowired
//    private ZipkinProperties zipkinProperties;

//    @Autowired
//    private SpanMetricReporter spanMetricReporter;

    public static void main(String[] args) {
        SpringApplication.run(RatingServiceApplication.class, args);
    }

    /*@Bean
    public ZipkinSpanReporter makeZipkinSpanReporter() {
        return new ZipkinSpanReporter() {
            private HttpZipkinSpanReporter delegate;
            private String baseUrl;

            *//*@Override
            public void report(Span span) {
                InstanceInfo instance = eurekaClient.getNextServerFromEureka("zipkin", false);
                if (!(baseUrl != null && instance.getHomePageUrl().equals(baseUrl))) {
                    baseUrl = instance.getHomePageUrl();
                    delegate = new HttpZipkinSpanReporter(new RestTemplate(), baseUrl, zipkinProperties.getFlushInterval(), spanMetricReporter);
                    if (!span.name.matches(skipPattern)) delegate.report(span);
                }
                if (!span.name.matches(skipPattern)) delegate.report(span);
            }*//*
        };
    }*/

    @Bean
    @Primary
    @Order(value=Ordered.HIGHEST_PRECEDENCE)
    public HystrixCommandAspect hystrixAspect() {
      return new HystrixCommandAspect();
    }
}
