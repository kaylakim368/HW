class Person{
    // Instance variables
    String name;
    int age;

    // Classes can contain
    // 1. Data
    // 2. Subroutines (methods)
    void speak(){
        for(int i = 0; i < 3; i++){
            System.out.println("My name is " + name + " and I am " + age + " years old.");
        }
    }
    void sayHello(){
        System.out.println("Hello there!");
    }
}

public class ClassesObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Kayla";
        person1.age = 34;
        person1.speak();
        person1.sayHello();

        Person person2 = new Person();
        person2.name = "Do";
        person2.age = 49;
        person2.speak();
        person2.sayHello();

        System.out.println(person2.name);
    }
}
