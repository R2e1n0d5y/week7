package UML;

public class Dog extends Animal{
    private String breed;

    public Dog(){
        setName("belum diketahui");
        setAge(0);
        this.breed = "belum diketahui";
    }

    public Dog(String name, int age, String breed){
        setName(name);
        setAge(age);
        this.breed = breed;
    }

    public String getBreed(){
        return this.breed;
    }

    public void setBreed (String breed){
        this.breed = breed;
    }

    public void makeSound(){
        System.out.println(getName() + " mengeluarkan suara gug gug gug");
    }

    public String toString(){
        return getName()+" dengan usia "+getAge()+" memiliki ras "+getBreed()+" ini dari kelas Dog";
    }
}
