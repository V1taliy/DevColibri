package DevCat;

public class Cat extends Animals {
    private int age;
    private String poroda;
    private String name;

    public Cat(int age, String poroda, String name) {
        this.age = age;
        this.poroda = poroda;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("я ем котячею хавку");
    }

    public void say(){
        System.out.println("Mjay, mjau сука мяу");
    }

    @Override
    public String toString() {
        return "Cat[name: " + name + ", poroda: " + poroda + ", age: " + age ;
    }

    @Override
    void temp() {
        super.temp();
    }
}
