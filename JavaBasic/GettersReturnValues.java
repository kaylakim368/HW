class Person {
    String name;
    int age;

    void speak() {
        System.out.println("My nam is " + name);
    }

//    void calculateYearsToRetirement() {
//        int yearsLeft = 65 - age;
//        System.out.println(yearsLeft);
//    }
    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;
        return yearsLeft;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}

public class GettersReturnValues {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.name = "Kayla";
        person1.age = 34;

        person1.speak();
        //person1.calculateYearsToRetirement();
        int years = person1.calculateYearsToRetirement();
        System.out.println("Years till retirement: " + years);

        int age = person1.getAge();
        String name = person1.getName();

        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }
}
