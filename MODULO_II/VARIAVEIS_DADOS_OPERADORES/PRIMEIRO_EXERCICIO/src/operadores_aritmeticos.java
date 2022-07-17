public class operadores_aritmeticos {

    public static void main(String[]args) {
        System.out.println("prePos");
        prePos();
        System.out.println("operadoresAritmeticos");
        operadoresAritmeticos();
        System.out.println("atribuicoes");
        atribuicoes();
        System.out.println("precedencias");
        precedencias();


        }
    private static void prePos() {

        int k = 10;

        int i = ++k;
        int j = k--;
        int x = k;
        System.out.println("i "+ i);
        System.out.println("j "+ j);
        System.out.println("x "+ x);

    }

    private static void operadoresAritmeticos() {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-b;
        int r3 = d+b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("a+b " + r1);
        System.out.println("c-b " + r2);
        System.out.println("d+b " + r3);
        System.out.println("e/a " + r4);
        System.out.println("c%b " + r5);
    }

    private static void atribuicoes() {
        int i = 15000;
        short j = 15;
        long l = 500l;
        int k = 35;
        float f = 3.5f;
        double d = f; //uma variável recebendo a outra

        System.out.println("d "+ d);

        i += 5;
        j -= 3;
        d /= 2.7d;
        l *= 3;
        k %= 2;

        System.out.println("i "+i);
        System.out.println("j "+j);
        System.out.println("d "+d);
        System.out.println("l "+l);
        System.out.println("k "+ k);

        i = k = j;
        System.out.println("k " + k);
        System.out.println("i " + i);
    }

    private static void precedencias() {

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k; //10 + 19 * 30 -> 570 + 10 = 580

        System.out.println("i++ + --j *k= " + a);
        System.out.println("i " + i); // após execução acima que o i vai pra 11

        int b = k / --i /*11 que vai virar 10*/ %3 + 1; // 30 / 10 %3 + 1

        System.out.println("k / --i %3 + 1=" + b);
        System.out.println("i: "+i);

        int c = 2;

        c *= i += 5; //c = 2*i | i = i+5 =15 -> c = 2* 15 = 30 -> c = 30
        System.out.println("c *= i += 5= "+c);




    }
}
