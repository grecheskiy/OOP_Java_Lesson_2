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

        i_6 number ;
        number = (y)->99.9/y;

        System.out.println(number.getNumber(9.9));
        System.out.println(number.getNumber(10.090909090909092));

        i_7 IsFactor = (l, d) -> (l % d) == 0;
        int a = 10;
        int b = 2;
        if (IsFactor.BoolenTest(a, b)) {
            System.out.printf("%s is a divisor %s \n",b,a);
        }
        if (!IsFactor.BoolenTest(a, b=3)) {
            System.out.printf("%s is not a divisor %s \n",b,a);
        }

        i_7 lessNum = (s, t) -> (s < t);

        if (lessNum.BoolenTest(a=2, b=10)) {
            System.out.printf("%s less %s \n",a,b);
        }
        if (!lessNum.BoolenTest(a=3, b=2)) {
            System.out.printf("%s no less %s \n",a,b);
        }

        i_7 numEqual = (r, u) -> (r < 0 ? -r : r) == (u < 0 ? -u : u);

        if (numEqual.BoolenTest(a=2, b=-2)) {
            System.out.printf("%s equally %s \n",a,b);
        }
        if (!numEqual.BoolenTest(a=2, b=-3)) {
            System.out.printf("%s no equally %s \n",a,b);
        }

        i_8 func_1 = (m) -> {
            int result = 1;
            m = m < 0 ? m : m;
            for (int i = 2; i <= m; i++) {
                if ((m % i) == 0) {
                    result = i;
                    break;
                }
            } 
            return result;
        };
        System.out.printf("less is a divisor 12 = %s \n", func_1.func(12));
        System.out.printf("less is a divisor 11 = %s \n", func_1.func(11));


        i_9<Integer> isNum = x -> x > 0;

        System.out.println(isNum.test(5));
        System.out.println(isNum.test(-8));


        i_10<Integer> num_1 = (x, y) -> (x * y);

        System.out.println(num_1.apply(3, 5));
     }
}        