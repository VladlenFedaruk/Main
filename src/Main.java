import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        swichCase();
    }
    public static int fibanachi(int fib) {
        // Scanner scanner1 = new Scanner(System.in);
        if ((fib==3) || (fib==2)) {
            return 1;
        } else {
            int fib1 = fibanachi(fib-1)+fibanachi(fib-2);
            // System.out.println(fib1);
            return fib1;
        }
    }
    public static void swichCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите номер задачи (от 1 до 5)");
        int n1 = scanner.nextInt();
        switch (n1) {
            case 1: {
                System.out.println("вы выбрали задачу №1");
                System.out.println("введите длинну прямоугольника");
                int a1 = scanner.nextInt();
                System.out.println("введите ширину прямоугольника");
                int b1 = scanner.nextInt();
                System.out.println("периметр = " + 2 * (a1 + b1) + "  площадь = " + a1 * b1);
            }
            break;
            case 2:{
                System.out.println("вы выбрали задачу №2");
                System.out.println("введите оценку от 0 до 100");
                int bal1 = scanner.nextInt();
                if (bal1<=29)
                    System.out.println("ваша оценка F");
                else if ((bal1>29) && (bal1<=49))
                    System.out.println("ваша оценка D");
                else if ((bal1>49) && (bal1<=74))
                    System.out.println("ваша оценка C");
                else if ((bal1>74) && (bal1<=90))
                    System.out.println("ваша оценка B");
                else if ((bal1>90) && (bal1<=10))
                    System.out.println("ваша оценка A");
            }
            break;
            case 3: {
                System.out.println("вы выбрали задачу №3");
                System.out.println("введите число от 1 до 10");
                int ch1 = scanner.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.println( i + " x " + ch1 + " = " + i*ch1);
                }
            }
            break;
            case 4: {
                System.out.println("вы выбрали задачу №4");
                System.out.println("введите номер числа из ряда Фибоначи");
                int fib = scanner.nextInt();
                //fibanachi(fib);
                System.out.println("окончательный ответ " + fibanachi(fib));

            }

            break;
            case 5:{
                System.out.println("вы выбрали задачу №5");
                int j = 0;
                do {
                    System.out.println("введите отрицательное число");
                    int ch5 = scanner.nextInt();
                    if ( ch5<0 ){
                        System.out.println("спасибо");
                        j = 1;
                    }
                    else
                        System.out.println(ch5);
                }
                while (j!=1);
            }
            break;
            default:
                System.out.println("нет такой задачи");



        }
    }

}


