package com.xatrans.gmall.ums.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/** security配置放行所有请求
 * @Description: (用一句话描述该文件做什么)
 * @Author Tommy
 * @Date 2020/9/15 15:57
 * @Version V1.0
 */

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/**")
                .permitAll();
        // 禁用掉csrf
        http.csrf().disable();
    }
}
