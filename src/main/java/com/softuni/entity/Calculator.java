package com.softuni.entity;

public class Calculator {
    private double leftOperand;
    private double rightOperand;
    private String operator;


    public  Calculator(double leftOperand, double rightOperand, String operator){
        this.leftOperand=leftOperand;
        this.rightOperand=rightOperand;
        this.operator=operator;
    }
    public String getOperator() {
        return operator;
    }

    public double getLeftOperand() {
        return leftOperand;
    }

    public double getRightOperand() {
        return rightOperand;
    }

    public void setLeftOperand(double leftOperand) {
        this.leftOperand = leftOperand;
    }

    public void setRightOperand(double rightOperand) {
        this.rightOperand = rightOperand;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Calculator(){

    }
    public  double calculateResult() {
        double result;
        switch (this.operator) {
            case "+":
                result = this.getLeftOperand() + this.getRightOperand();
                break;
            case "-":
                result = this.getLeftOperand() - this.getRightOperand();
                break;
            case "*":
                result = this.getLeftOperand() * this.getRightOperand();
                break;
            case "/":
                return this.rightOperand == 0 ? 0 : this.leftOperand / this.rightOperand;
            default:
                result = 0;
                break;
        }
        return result;
    }
}

