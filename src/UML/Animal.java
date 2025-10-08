package UML;

public class Animal {
    private String name;
    private int age;

    public Animal(){
        this.name = "animal";
        this.age = 0;
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName (String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void makeSound(){
        System.out.println(this.name + " Mengeluarkan Suara");
    }

    public String toString(){
        return "ini dari kelas Animal";
    }
}
