package com.singhdevhub;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.singhdevhub.assignments.HelloWorld;

public class HelloWorldTest {
   
    HelloWorld helloWorld;
    ByteArrayOutputStream outputStream;
    PrintStream printStream;

    @BeforeEach
    public void init(){
        helloWorld = new HelloWorld();
        outputStream = new ByteArrayOutputStream();
        printStream = new PrintStream(outputStream);
        System.setOut(printStream);
    }
       
    @Test
    public void sayHello(){
        helloWorld.sayHello();
        String expected = "Hello World";
        String actual = outputStream.toString().trim();
        assert(expected.equals(actual));
    }
    
    @Test
    public void printHelloWorldUsingChars(){
        helloWorld.printHelloWorldUsingChars();
        String expected = "Hello World";
        String actual = outputStream.toString().trim();
        assert(expected.equals(actual));
    }

    @Test
    public void returnHelloWorld(){
        String expected = "Hello World";
        String actual = helloWorld.returnHelloWorld();
        assert(expected.equals(actual));
    }

    @Test
    public void printPyramid(){
        helloWorld.printPyramid();
        String expected = "-\n--\n---\n----\n-----\n------\n-------";
        String actual = outputStream.toString().trim();
        assert(expected.equals(actual));
    }

}
