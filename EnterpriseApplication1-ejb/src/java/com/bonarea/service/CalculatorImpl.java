/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author alumne
 */
@RequestScoped
@Named("calculator")
public class CalculatorImpl implements ICalculator{

    @Override
    public int suma(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int resta(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int division(int num1, int num2) {
        return num1 / num2;
    }
    
}
