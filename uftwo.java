package Programacion_1UF_esliceu;

public class uftwo {
    public static void main(String[] args) {
        // if

        int a = 3;
        int b = 4;

        if (a + b == 7) {
            System.out.println(true);
        }


        // case

        int day = 2;

        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            default:
                System.out.println("invalid day");
                break;
        }

        // while

        int countdown = 5;

        while (countdown > 0) {
            System.out.println("pip -1");
            countdown--;

        }


        // for

        for (int i = 0; i < 5; i++) {
            System.out.println("pupuru");
        }
    }
}
