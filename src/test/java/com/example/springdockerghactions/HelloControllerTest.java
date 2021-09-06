package com.example.springdockerghactions;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

class HelloControllerTest {

    private HelloController controller;

    @BeforeEach
    public void setUp() {
        controller = new HelloController();
    }

    @Test
    public void sayHello() {
        assertThat(controller.sayHello(), CoreMatchers.equalTo("Hello World"));
    }

}