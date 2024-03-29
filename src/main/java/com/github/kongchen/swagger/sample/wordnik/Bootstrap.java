package com.github.kongchen.swagger.sample.wordnik;

import io.swagger.models.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class Bootstrap extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        Info info = new Info()
                .title("Swagger Petstore")
                .description("This is a sample server Petstore server.  You can find out more about Swagger " +
                        "at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, " +
                        "you can use the api key `special-key` to test the authorization filters.")
                .termsOfService("http://swagger.io/terms/")
                .contact(new Contact()
                        .email("apiteam@swagger.io"))
                .license(new License()
                        .name("Apache 2.0")
                        .url("http://www.apache.org/licenses/LICENSE-2.0.html"));

        ServletContext context = config.getServletContext();
        Swagger swagger = new Swagger()
                .info(info);
//        swagger.securityDefinition("petstore_auth",
//                new OAuth2Definition()
//                        .implicit("http://localhost:8002/oauth/dialog")
//                        .scope("email", "Access to your email address")
//                        .scope("pets", "Access to your pets"));
        swagger.tag(new Tag()
                .name("pet")
                .description("Everything about your Pets")
                .externalDocs(new ExternalDocs("Find out more", "http://swagger.io")));
        swagger.tag(new Tag()
                .name("store")
                .description("Access to Petstore orders"));
        swagger.tag(new Tag()
                .name("user")
                .description("Operations about user")
                .externalDocs(new ExternalDocs("Find out more about our store", "http://swagger.io")));
        context.setAttribute("swagger", swagger);
        /* or use new mechanism @since 1.5.7 */
        //new SwaggerContextService().withServletConfig(config).updateSwagger(swagger);

    }
}