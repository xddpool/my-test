package com.streaming.flink.udf;

import org.apache.flink.table.functions.ScalarFunction;

import java.sql.Timestamp;
import java.util.Arrays;

public class UTC2Local extends ScalarFunction {

    public Timestamp eval(Timestamp s) {
        long timestamp = s.getTime() + 28800000;
        Arrays.asList("1", "2", "3").stream()
                .forEach(System.out::println);
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world1");
        System.out.println("hello world1");
        System.out.println("hello world1");
        System.out.println("hello world1");
        return new Timestamp(timestamp);
    }

}
