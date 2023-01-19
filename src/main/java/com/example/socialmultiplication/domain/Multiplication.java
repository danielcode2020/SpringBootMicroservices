package com.example.socialmultiplication.domain;

public class Multiplication {
    private Integer factorA;
    private Integer factorB;
    private Integer result;

    public Multiplication(Integer factorA, Integer factorB) {
        this.factorA = factorA;
        this.factorB = factorB;
        this.result = factorA * factorB;
    }

    public Integer getFactorA() {
        return factorA;
    }

    public Integer getFactorB() {
        return factorB;
    }

    public Integer getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "Multiplication{" +
                "factorA=" + factorA +
                ", factorB=" + factorB +
                ", result=" + result +
                '}';
    }
}
