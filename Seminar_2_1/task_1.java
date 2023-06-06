package Seminar_2_1;

public class task_1 {
    public static void main(String[] args) {
        Numeric n = new Numeric();
        for (int i=0; i<5; i++) {
            System.out.printf("next numer: %d\n", n.getNext());
        }
        System.out.println("reset");
        n.reset();
        for (int i=0; i<5; i++) {
            System.out.printf("next numer: %d\n", n.getNext());
        }
        System.out.println("start numer 100");
        n.setStart(100);
        for (int i=0; i<5; i++) {
            System.out.printf("next numer: %d\n", n.getNext());
        }     
    }
}
