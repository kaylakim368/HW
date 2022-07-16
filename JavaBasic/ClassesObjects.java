class Person{
    // Instance variables
    String name;
    int age;

    // Classes can contain
    // 1. Data
    // 2. Subroutines (methods)
}

public class ClassesObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Kayla";
        person1.age = 34;

        Person person2 = new Person();
        person2.name = "Do";
        person2.age = 49;

        System.out.println(person2.name);
    }
}
