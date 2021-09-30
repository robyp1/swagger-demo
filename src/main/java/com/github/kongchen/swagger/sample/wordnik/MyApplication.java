package com.github.kongchen.swagger.sample.wordnik;

import com.github.kongchen.swagger.sample.wordnik.resource.PetResource;
import com.github.kongchen.swagger.sample.wordnik.resource.PetStoreResource;
import com.github.kongchen.swagger.sample.wordnik.resource.UserResource;
import io.swagger.jaxrs.config.BeanConfig;

import javax.ws.rs.core.Application;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyApplication extends Application {

    public MyApplication() {
        init();
    }

    @Override
    public Set<Class<?>> getClasses() {
        return Stream.of(PetResource.class,
                PetStoreResource.class,
                UserResource.class,
                io.swagger.jaxrs.listing.ApiListingResource.class,
                io.swagger.jaxrs.listing.SwaggerSerializers.class
        ).collect(Collectors.toSet());
    }


    public void init() {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080");
        beanConfig.setBasePath("/rest");
//        beanConfig.setFilterClass("com.github.kongchen.swagger.sample.wordnik.ApiAuthorizationFilterImpl");
        beanConfig.setResourcePackage("com.github.kongchen.swagger.sample.wordnik.resource");
        beanConfig.setScan(true);
        beanConfig.setPrettyPrint(true);
    }

}