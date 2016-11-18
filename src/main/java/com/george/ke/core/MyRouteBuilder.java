package com.george.ke.core;

import org.apache.camel.builder.RouteBuilder;

/**
 * Created by george on 11/18/16.
 */
public class MyRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        // Access us using http://localhost:8080/camel/hello
        from("servlet:///hello").transform().constant("Hello from Camel!");

        // Trigger run right after startup. No Servlet request required.
        from("timer://foo?fixedRate=true&period=10s").log("Camel timer triggered.");
    }
}
