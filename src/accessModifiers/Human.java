package accessModifiers;

public class Human {
    private String name;
    private char gender;
    private int age;
    private int height;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'm' || gender == 'M' || gender == 'f' || gender == 'F') {
            this.gender = gender;
        } else {
            System.out.println("Incorrect gender provided OR use just first letter");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.err.println("Invalid age");
        }

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.err.println("Height cannot be negative");
        }
        }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.err.println("Weight cannot be negative");
        }
        }

}
