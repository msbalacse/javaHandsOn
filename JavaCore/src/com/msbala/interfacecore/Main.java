package com.msbala.interfacecore;

// What interfaces are
// Why we need them
// How to use them "Properly"
// Dependency injection

/* What are Interfaces?
   we use interface to build loosely-coupled, extensible, testable application

   Abstraction -> hide the implementation details

   interface only declare method

   Interface
   What should be done
   // algorithm
   Data compression
   Encryption
   Sorting
   Searching

   Classes
   How it should be done


    Dependency Injection

    our classes should not instantiate their dependencies.

    constructor injection

    - Add parameter via constructor

    - setter injection

    - method injection
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Interfaces");

        var calculator = new TaxCalculator(234_324);
        var report = new TaxReport();
        report.show(new TaxCalculator(343));
//        report.setTaxCalculator(new TaxCalculatorTwo());
        report.show(new TaxCalculatorTwo());
    }
}
