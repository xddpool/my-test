package com.streaming.flink.udf;

import org.apache.flink.table.functions.ScalarFunction;

public class JavaUpper extends ScalarFunction {

    public String eval(String message) {
        return message.toUpperCase();
    }
}
