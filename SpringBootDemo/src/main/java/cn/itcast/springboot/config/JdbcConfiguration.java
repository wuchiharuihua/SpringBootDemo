package cn.itcast.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;


@Configuration //声明一个java配置类，相当于一个xml配置文件
//@PropertySource("classpath:jdbc.properties") //读取资源文件
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfiguration {

    //@Autowired  //第一种自动装配
    private JdbcProperties jdbcProperties;

    //第二种 构造方法注入
    public JdbcConfiguration(JdbcProperties jdbcProperties){
        this.jdbcProperties = jdbcProperties;
    }

    @Bean
    public DataSource dataSource(JdbcProperties jdbcProperties){ //第三种注入  通过形参  此方法不用要成员变量
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(this.jdbcProperties.getDriverClassName());
        dataSource.setUrl(this.jdbcProperties.getUrl());
        dataSource.setUsername(this.jdbcProperties.getUsername());
        dataSource.setPassword(this.jdbcProperties.getPassword());
        return dataSource;
    }

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource2(JdbcProperties jdbcProperties){ //第四种种注入  通过形参  此方法什么都不用写
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }


}
