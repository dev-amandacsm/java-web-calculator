/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.java.web.calculator.entities;

public class Calculator {
    
    private Double value1;
    private Double value2;
    
    public Calculator(){
        
    }
    
    public Double getSum(Double value1, Double value2){
        return value1 + value2;
    }
    
    public Double getSubtraction(Double value1, Double value2){
        return value1 - value2;
    }
    
    public Double getDivision(Double value1, Double value2){
        if(value2 == 0){
            throw new ArithmeticException("O denominador não pode ser igual a zero!");
        }
        return value1 / value2;
    }
    
    public Double getMultiplication(Double value1, Double value2){
        return value1 * value2;
    }
    
}
