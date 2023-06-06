package Seminar_2_6;

public class Cat implements i_1, i_4, i_5{
    private String name;
    private int age;

    int black;
    int blue;
    int rad;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void greet() {     
            System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет).");
        }
    
        void setName(String name){
            this.name = name;
        }
    
        void setAge(Integer age){
            this.age = age;
        }
    
        String getName(){
            return name;
        }
    
        Integer getAge(){
            return age;
        }

        public Cat(){
            black = 1;
            blue = 1;
            rad = 1;
        }
    
        @Override
        public int getNext() {
            blue += 2;
            return blue;
        }
    
        @Override
        public void reset() {
            black = 1;
            blue = 1;
            rad = 1;
        }

        @Override
        public int getCatID() {
            return 100;
        }

        @Override
        public void num_1() {
            System.out.println("num_1");
        }
    
        @Override
        public void num_2() {
            System.out.println("num_2");
        }
    
        @Override
        public void num_3() {
            System.out.println("num_3");
        }
        
    
}