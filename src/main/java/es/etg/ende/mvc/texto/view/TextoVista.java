package es.etg.ende.mvc.texto.view;
import java.util.Scanner;

public class TextoVista {
    public static final String MSG_SOLICITAR_TEXTO = "Introduce texto a modificar: ";
    public static final String MSG_RESULTADO = "Mensaje pasado a mayúsculas: %s";

    private final Scanner sc = new Scanner(System.in);

    public void solicitarTexto(){
        System.out.println(MSG_SOLICITAR_TEXTO);
        sc.nextLine();
    }

    public void mostrarResultado(String resultado){
        System.out.println(MSG_RESULTADO, resultado);
    }
}
