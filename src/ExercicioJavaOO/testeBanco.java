package ExercicioJavaOO;

public class testeBanco {
    public static void main(String[] args) {
        exer_6ContaBanco novaConta = new exer_6ContaBanco(287, 43, 1, "Sula", 14400f);

        System.out.println("Numero da conta " + novaConta.getNumero());
        System.out.println("Agencia " + novaConta.getAgencia());
        System.out.println("Tipo de conta " + novaConta.getTipo());
        System.out.println("Nome do titular " + novaConta.getTipo());
        System.out.println("Saldo da conta " + novaConta.getSaldo());

        novaConta.sacar(10000);

    }
}
