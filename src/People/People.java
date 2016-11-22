package People;


import DevCat.Cat;

public class People {
    private String name;
    private String lastName;
    private int age;

    public People(String name, String lastName, int age, Cat cat) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    private Cat cat;

    @Override
    public String toString() {
        return "People[Imya: " + name + ", Fimiliya: " + lastName + ", age: ]" + age + ", Est kot: " + cat;
    }
}
