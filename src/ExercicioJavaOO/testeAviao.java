package ExercicioJavaOO;

import static ExercicioJavaOO.exer_2Aviao.*;

public class testeAviao {
    public static void main(String[] args) {
        exer_2Aviao jato = new exer_2Aviao("azul", "bimotor", "mantimento", 5, 4);
        System.out.println("A cor do jato é: " + jato.getCor());
        System.out.println("O tipo do motor do jato é: " + jato.getMotor());
        System.out.println("A carga desse jato é de: " + jato.getCarga());
        System.out.println("O peso do jato é: " + jato.getPeso() + " toneladas");
        System.out.println("A altura do jato é: " + jato.getAltura() + " metros de altura");
    }

}
