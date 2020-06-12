package com.chenwei.demo.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
//MyBatis配置类

@org.springframework.context.annotation.Configuration
public class MyBatisConfig {

    //MyBatis配置类的接口（给容器中添加一个ConfigurationCustomizer组件）
    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        return new ConfigurationCustomizer() {
            @Override
            public void customize(Configuration configuration) {
                //配置数据库开启驼峰命名
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
