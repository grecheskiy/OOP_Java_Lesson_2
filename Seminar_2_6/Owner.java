package Seminar_2_6;

public class Owner extends Cat{
    String nameOwner;

    public Owner(String name, int age, String nameOwner){
        super(nameOwner, age);
        this.nameOwner = nameOwner;
    }

    void ShowOwner(){
       System.out.println("Мяу! Меня зовут " + getName() + ". Мне " + getAge() + "года(лет). Мой владелец - " + nameOwner + ".");
    }

    String name;

    public Owner(String name, int age){
        super(name, age);
        
    }

    @Override
    public void greet() {     
        System.out.println("Мяу! Меня зовут " + getName() + ". Мне " + getAge() + " года(лет)." + super.getName());
    }
}
