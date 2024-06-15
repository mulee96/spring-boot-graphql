package com.jirum.alarm.core.api.controller.v1;

import com.jirum.alarm.core.api.domain.ExampleService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ExampleController {

    private final ExampleService exampleExampleService;

    public ExampleController(ExampleService exampleExampleService) {
        this.exampleExampleService = exampleExampleService;
    }

    @QueryMapping
    public String hello() {
        return "Hello, GraphQL!";
    }

    @MutationMapping
    public String echo(@Argument(value = "message") String message) {
        return message;
    }

}
