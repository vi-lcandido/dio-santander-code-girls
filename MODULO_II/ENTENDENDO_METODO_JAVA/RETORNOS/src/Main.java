public class Main {

    public static void main(String[] args){

        System.out.println("Exercício retorno");
        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("A área do quadrado é "+areaQuadrado);
        double areaRetangulo = Quadrilatero.area(3,5);
        System.out.println("A área do retângulo é "+ areaRetangulo);

        double areaTrapezio = Quadrilatero.area(3,7.75,4);
        System.out.println("A área do trapézio é "+areaTrapezio);

        double areaLosango = Quadrilatero.area(3, 4.32);
        System.out.println("A área do losango é "+areaLosango);


    }
}
