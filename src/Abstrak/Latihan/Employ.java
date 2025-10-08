package Abstrak.Latihan;

abstract class Employ {
    private String name;
    private int salary;
    abstract int calculateBonus();

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
}

 class Manager extends Employ {
    Manager(String name, int salary){
        setName(name);
        setSalary(salary);
    }
    public int calculateBonus(){
        return 10*getSalary();
    }
}

class Staff extends Employ {
    Staff(String name, int salary){
        setName(name);
        setSalary(salary);
    }
    public int calculateBonus(){
        return 5*getSalary();
    }
}