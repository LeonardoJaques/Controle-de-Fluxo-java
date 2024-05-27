import java.util.Scanner;

/**
 * This class is used to count from one number to another and print the total number of prints.
 */
public class Contador {

    /**
     * The main method of the Contador class.
     * It reads two numbers from the user and counts from the first number to the second number.
     * It also handles the ParametrosInvalidosException.
     *
     * @param args command line arguments
     * @throws ParametrosInvalidosException if the input is not an integer or the first number is greater than the second number
     */
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número: ");
            int numero1 = getNumber(scanner);
            System.out.println("Digite o segundo número: ");
            int numero2 = getNumber(scanner);
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }

    /**
     * This method counts from the first number to the second number and prints each number.
     * It also prints the total number of prints.
     *
     * @param numero1 the first number to start counting from
     * @param numero2 the second number to count to
     * @throws ParametrosInvalidosException if the first number is greater than the second number
     */
    public static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException("O primeiro número deve ser menor que o segundo número.", new IllegalArgumentException());
        } else {
            int impressoes = 0;
            for (int i = numero1; i < numero2; i++) {
                System.out.println("Imprimindo o número " + i);
                impressoes += 1;
            }
            System.out.println("O total de impressões é de: " + impressoes);
        }
    }

    /**
     * This method reads an integer from the scanner.
     * It throws a ParametrosInvalidosException if the input is not an integer.
     *
     * @param scanner the scanner to read the integer from
     * @return the integer read from the scanner
     * @throws ParametrosInvalidosException if the input is not an integer
     */
    public static int getNumber(Scanner scanner) throws ParametrosInvalidosException {
        if(!scanner.hasNextInt()){
            throw new ParametrosInvalidosException("O tipo de dado informado é inválido.", new IllegalArgumentException());
        }
        return scanner.nextInt();
    }
}