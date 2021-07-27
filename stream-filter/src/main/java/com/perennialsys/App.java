package com.perennialsys;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> words = Arrays.asList("tst", "one", "two", "three", "four", "five", "rotator", "deified");
        List<String> output = words.stream().filter(s -> s.length() > 3).collect(Collectors.toList());
        output.stream().forEach(i -> System.out.println(i));

        System.out.println("2. A little more complex filtering");

        List<String> pallindromes = words.stream().filter(s -> s.equals(new StringBuilder(s).reverse().toString())).collect(Collectors.toList());
        pallindromes.stream().forEach(i -> System.out.println(i));
    }
}
