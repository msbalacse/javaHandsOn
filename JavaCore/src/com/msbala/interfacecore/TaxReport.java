package com.msbala.interfacecore;

/*
Tightly Coupled Code
if method signature might be changes in declared class
if Constructor parameter add in the declared class
which affect this class
*/
public class TaxReport {
    private ITaxCalculator calculator;

    public TaxReport(){

    }
//    public TaxReport(TaxCalculator taxCalculator){
//        calculator = taxCalculator;
//    }

    public void show(ITaxCalculator calculator){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

//    public void setTaxCalculator(ITaxCalculator taxCalculator){
//        this.calculator = taxCalculator;
//    }
}
