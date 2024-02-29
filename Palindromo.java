import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena para verificar si es un palíndromo: ");
        String cadena = scanner.nextLine();
        
        // Eliminar espacios en blanco y convertir a minúsculas
        cadena = cadena.replaceAll("\\s+", "").toLowerCase();
        
        // Verificar si la cadena es un palíndromo
        boolean esPalindromo = true;
        int longitud = cadena.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }
        
        if (esPalindromo) {
            System.out.println("La cadena ingresada es un palíndromo.");
        } else {
            System.out.println("La cadena ingresada no es un palíndromo.");
        }
        
        scanner.close();
    }
}
