package com.ngocnv.auctionme.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by framgia on 23/12/2016.
 */

@Configuration
@Import({SpringConfiguration.class})
public class RootConfig {
}
