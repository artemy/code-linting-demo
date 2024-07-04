package com.github.artemy.codelintingdemo;

public class Hello {

    private Hello() {
      } //formatting violation

    public static void main(final String[] args) {
        System.out.println("Hello, World!");
    }
}
