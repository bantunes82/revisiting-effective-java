package com.bantunes82;

import java.util.function.IntBinaryOperator;

public enum Operation {
    ADD(AddOperation::compute),
    SUBTRACT((x, y) -> x - y),
    MULTIPLY((x, y) -> x * y),
    DIVIDE((x, y) -> x / y);

    private final IntBinaryOperator operator;

    Operation(IntBinaryOperator operator) {
        this.operator = operator;
    }

    public int compute(int x, int y){
        return operator.applyAsInt(x, y);
    }

    public static void main(String[] args) {
        System.out.println(ADD.compute(2, 3));
        System.out.println(SUBTRACT.compute(5, 3));
        System.out.println(MULTIPLY.compute(5, 3));
        System.out.println(DIVIDE.compute(9, 3));
    }

}

