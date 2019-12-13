package com.oops.basic;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setModel("Benz");
        System.out.println(car.getModel());

        System.out.println("\n\n************ Another Class results *********************");

        Person person = new Person();
        person.setAge(30);
        person.setFirstName("John");
        person.setLastName("Alberto");
        String name = person.getFullName();
        String teenText = person.isTeen() ? "is teenage": "is not teenage";
        System.out.println(name + " " + teenText);

        System.out.println("\n\n************ Another Class results *********************");

        Account account = new Account("832432", "Alberto", 180009, "test@gmail.com","(+91) 9566662921" );
        account.withDrawal(100.0);

        System.out.println("\n\n************ Another Class results *********************");

        Point first = new Point(6,5);
        Point second = new Point(3,1);
        Point point = new Point();
        System.out.println("Distance(0,0) = " + first.distance(second));

        System.out.println("\n\n************ Another Class results *********************");

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

        System.out.println("\n\n************ Another Class results *********************");

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

    }
}
