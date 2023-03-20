package com.damt.SpringBootProy.bean;

public class OperationWithDependencyImplement implements OperationWithDependency{
    Operation operation;

    public OperationWithDependencyImplement(Operation operation) {
        this.operation = operation;
    }

    @Override
    public void print() {
        System.out.println("Aburrido" + operation.sum(2));
    }
}
