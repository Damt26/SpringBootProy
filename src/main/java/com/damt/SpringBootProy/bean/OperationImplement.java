package com.damt.SpringBootProy.bean;

public class OperationImplement implements Operation {
    @Override
    public int sum(int number) {
        return (number + number);
    }
}
