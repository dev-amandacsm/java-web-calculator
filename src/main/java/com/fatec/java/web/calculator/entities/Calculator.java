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
    
    public static Double getSum(Double value1, Double value2){
        return value1 + value2;
    }
    
    public static Double getSubtraction(Double value1, Double value2){
        return value1 - value2;
    }
    
    public static Double getDivision(Double value1, Double value2){
        if(value2 == 0){
            throw new ArithmeticException("The denominator must not be equal to zero!");
        }
        return value1 / value2;
    }
    
    public static Double getMultiplication(Double value1, Double value2){
        return value1 * value2;
    }
    
}
