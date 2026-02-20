public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    void mostrarDetalhes(){
        String mensagem = "Detalhes da Pessoa: ";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }

    void calcularIMC(){
        double IMC = peso/(altura*altura);
        String imcFormatado = String.format("%.2f", IMC);
        System.out.println("IMC: " + imcFormatado);
        System.out.println("------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
