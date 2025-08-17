public class main {
    public static void main(String[] args) {
        int numeros[] = {1,2,3,4,5,6,7,8,9};
        int somaImpares = 0;

        for (int numero : numeros) {
            if (numero % 2 != 0) {
                somaImpares += numero;
            }
        }

        System.out.printf("Soma dos impares : %d\n", somaImpares);
    }
}
