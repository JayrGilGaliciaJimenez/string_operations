package mx.edu.utez;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        while (opc != 9) {
            System.out.println("""
                    Menu de opciones
                    1.- Contar caracteres
                    2.- Convertir a mayusculas
                    3.- Verificar palindromo
                    4.- Convertir a minuscular
                    5.- Invertir texto
                    6.- Reemplazar palabra
                    7.- Eliminar espacios
                    8.- Contar palabras
                    9.- Salir
                   """
            );
            opc = sc.nextInt();
            sc.nextLine(); // Clear the buffer after nextInt()

            switch (opc) {
                case 1:
                    System.out.println("Ingresa una palabra");
                    String texto = sc.nextLine();
                    contarCaracteres(texto);
                    break;

                case 2:
                    System.out.println("Ingresa una palabra");
                    texto = sc.nextLine();
                    convertirMayusculas(texto);
                    break;

                case 3:
                    System.out.println("""
                            VERIFICAR PALINDROMO
                            
                            Ingresa una palabra
                            """);
                    texto = sc.nextLine(); // Add sc.nextLine() to read input correctly
                    System.out.println(esPalindromo(texto) ? texto + " " + "Si es palindromo" : texto + " " + "No es palindromo");
                    break;

                case 4:
                    System.out.println("Ingresa el texto para pasarlo a minúsculas");
                    texto = sc.nextLine();
                    System.out.println("El texto en minúsculas es : " + texto.toLowerCase());
                    break;

                case 5:
                    System.out.print("Ingresa el texto a invertir: ");
                    texto = sc.nextLine();
                    String textoInvertido = "";
                    for (int i = texto.length() - 1; i >= 0; i--) {
                        textoInvertido += texto.charAt(i);
                    }
                    System.out.println("Texto invertido: " + textoInvertido);
                    break;

                case 6:
                    System.out.print("Ingresa el texto: ");
                    texto = sc.nextLine();
                    System.out.print("Palabra a reemplazar: ");
                    String palabraVieja = sc.nextLine();
                    System.out.print("Nueva palabra: ");
                    String palabraNueva = sc.nextLine();
                    reemplazarPalabra(texto, palabraVieja, palabraNueva);
                    break;

                case 7:
                    System.out.println("Ingresa el texto para eliminar espacios ");
                    texto = sc.nextLine();
                    System.out.println("El texto es: " + texto.replace(" ", ""));
                    break;

                case 8:
                    System.out.println("Ingresa un texto");
                    texto = sc.nextLine();
                    contarPalabras(texto);
                    break;

                case 9:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        }
    }

    public static void contarPalabras(String texto) {
        String[] palabras = texto.trim().split("\\s+");
        int cantidad = palabras.length;
        System.out.println("Número de palabras: " + cantidad);
    }

    public static void reemplazarPalabra(String texto, String palabraVieja, String palabraNueva) {
        String resultado = texto.replace(palabraVieja, palabraNueva);
        System.out.println("Texto con reemplazo: " + resultado);
    }

    public static boolean esPalindromo(String texto) {
        String limpio = texto.replaceAll("\\s+", "").toLowerCase();
        String invertido = new StringBuilder(limpio).reverse().toString();
        return limpio.equals(invertido);
    }

    public static void contarCaracteres(String texto) {
        int cantidad = texto.length();
        System.out.println("Número de caracteres: " + cantidad);
    }

    public static void convertirMayusculas(String texto) {
        String mayusculas = texto.toUpperCase();
        System.out.println("Texto en mayúsculas: " + mayusculas);
    }
}