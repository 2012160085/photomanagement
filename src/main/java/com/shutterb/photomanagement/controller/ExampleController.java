package com.shutterb.photomanagement.controller;



import com.shutterb.photomanagement.dto.TestInput;
import com.shutterb.photomanagement.dto.TestOutput;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import org.springframework.boot.autoconfigure.graphql.servlet.GraphQlWebMvcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@Controller
public class ExampleController {

    @QueryMapping
    public TestOutput exampleQuery(@Argument TestInput input) {
        return TestOutput.builder()
                .ok(true)
                .build();
    }

}
