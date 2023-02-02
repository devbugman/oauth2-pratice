package kr.devbug.oauth2feign.common.config;

import kr.devbug.oauth2feign.common.JwtProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({
        JwtProperties.class
})
public class PropertiesConfig {
}
