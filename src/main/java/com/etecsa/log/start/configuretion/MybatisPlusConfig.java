package com.etecsa.log.start.configuretion;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {

   @Bean
   public PaginationInterceptor paginationInterceptor() {
      return new PaginationInterceptor();
   }

   @Bean
   public PerformanceInterceptor performanceInterceptor() {
	   PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
	   performanceInterceptor.setMaxTime(1000);
	   performanceInterceptor.setFormat(true);
       return new PerformanceInterceptor();
   }


}
