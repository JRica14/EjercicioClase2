import java.util.HashMap;
import java.util.Scanner;

public class EjercicioContarLetras {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Cadena:");
        String cadena= sc.next();
        String cadenaFinal=cadena.toLowerCase();
        char [] array= cadenaFinal.toCharArray();
        System.out.println(contarRepeticiones(array));

    }

    public static String contarRepeticiones(char[] array) {
        if (array==null)
            return null;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char caracter : array) {
            if (map.containsKey(caracter)) {
                Integer value = map.get(caracter);
                value++;
                map.replace(caracter, value);
            } else {
                map.put(caracter, 1);
            }
        }
        return map.toString();

    }
}