package com.javapoc.advanced.lambda;

public class UppercaseLambdaExample {

    public static void main(String[] args) {
        String str = "hello world";
        StringTransformer toUpperCase = s -> s.toUpperCase();
        String result = transformString(str, toUpperCase);
        System.out.println(result); // prints "HELLO WORLD"
    }

    public static String transformString(String str, StringTransformer transformer) {
        return transformer.transform(str);
    }

    @FunctionalInterface
    public interface StringTransformer {
        String transform(String str);
    }

}

