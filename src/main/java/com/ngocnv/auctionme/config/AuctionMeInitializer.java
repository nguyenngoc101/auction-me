package com.ngocnv.auctionme.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.persistence.criteria.Root;

/**
 * Created by framgia on 23/12/2016.
 */
public class AuctionMeInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class};
    }

    @Override protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {WebConfig.class};
    }

    @Override protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
