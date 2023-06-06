package Seminar_2_6;

public class MainCat implements i_2{
    public static void main(String[] args) {
        Cat c1 = new Cat("Murzik", 2);
        Cat c2 = new Cat("Alisa", 7);
        
        c1.greet();
        c2.greet();

        Owner c3 = new Owner("Murzik", 2, "Alex");
        Owner c4 = new Owner("Alisa", 7, "Maxim");

        c3.ShowOwner();
        c4.ShowOwner();

        Cat n = new Cat();
        for (int i=0; i<5; i++) {
            System.out.printf("next numer: %d\n", n.getNext());
        }
        System.out.println("reset");
        n.reset();
        for (int i=0; i<5; i++) {
            System.out.printf("next numer: %d\n", n.getNext());
        }
        
        int[] nums = new int[MAX];
        for (int i = MIN; i < 11; i++) {
            if (i >= MAX) System.out.println(ERROR);
            else { 
                nums[i] = i;
                System.out.println(nums[i]);
            }
        }

        Cat d1 = new Cat();
        
        System.out.println("ID Cat: " + d1.getCatID());
        System.out.println("ID Owner: " + d1.getOwnerID());

        Cat e1 = new Cat();
        
        e1.num_1();
        e1.num_2();
        e1.num_3();
    }
}        