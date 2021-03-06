package com.mteam.moody.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.mteam.moody.configuration.web.security.WebSecurityConfig;

@Configuration
@Import(WebSecurityConfig.class)
public class AppConfig {

}
