package com.abstractmsbala;

public class Main {
    public static void main(String[] args) throws Exception {
//        Animal dog = new Dog("Foo");
//        Animal cat = new Cat("Bar");
//
//        dog.makeSound();
//        cat.makeSound();

//        String path = "D:/javaFiles/data.txt";
//
//
//        ExtractorReport numberExtract = new NumberExtractorReport();
//        ExtractorReport emailExtract = new EmailExtractorReport();
//
//        ExtractorReport[] reports = {numberExtract,emailExtract};
//
//        for (ExtractorReport report : reports) {
//            report.prepareAndSendReport(path);
//        }


//        Pattern newPattern = Pattern.compile("^[0-9]*$");
//
//        ExtractorReport numberExtractor = new ExtractorReport() {
//            @Override
//            public Pattern getPattern() {
//                return newPattern;
//            }
//
//            @Override
//            public String getReportName() {
//                return "null getName";
//            }
//
//            @Override
//            public String cleanup(String input) {
//                return null;
//            }
//        };


//
//        numberExtractor.prepareAndSendReport(path);

//        new NumberExtractorReport().prepareAndSendReport(path);
//
//        new EmailExtractorReport().prepareAndSendReport(path);


        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        Vehicle[] vehicles = {car,bicycle};

        Person person = new Person("John",vehicles);

        for (Vehicle vehicle : person.getVehicles()) {
            System.out.println(vehicle);;
        }



    }
}
