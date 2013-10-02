package com.halyph.hello.impl;

import com.halyph.hello.HelloWorld;

public class HelloWorldImpl implements HelloWorld {

    @Override
    public void printHelloWorld(String msg) {

        System.out.println("Hello : " + msg);
    }

}