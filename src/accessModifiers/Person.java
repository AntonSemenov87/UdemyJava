package accessModifiers;

public class Person {

    final String name;

    public Person(String name) {
        this.name = name;
    }

    Person() {
        this.name = "John";
    }

    public void hi (){
        Person person = new Person();
    }


}
