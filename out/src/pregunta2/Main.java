package pregunta2;

public class Main {
    public static void main(String[] args) {
        double[][] miMNatriz = {
                {1, 4, 8},
                {4, 8, 9},
                {10, 2, 1}
        };

        Matriz matriz = new Matriz(miMNatriz);
        System.out.println(matriz);
        Matriz matrizInvera = Matriz.inversa(matriz);
        System.out.println(matrizInvera);
    }
}
