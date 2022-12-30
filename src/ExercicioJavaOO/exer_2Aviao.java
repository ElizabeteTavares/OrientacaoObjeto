package ExercicioJavaOO;

//Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião,
// defina as instancias deste objeto e apresente as informações deste objeto no console.

public class exer_2Aviao {
    private String cor;
    private String motor;
    private String carga;
    private int peso;
    private float altura;

    //construtores

    public exer_2Aviao(String cor, String motor, String carga, int peso, float altura) {
        this.cor = cor;
        this.motor = motor;
        this.carga = carga;
        this.peso = peso;
        this.altura = altura;
    }
    public exer_2Aviao() { }

    //criar get and set


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
