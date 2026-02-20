public class Atleta extends Pessoa {
    private String esportePraticado;

    void mostrarDetalhes(){
        String mensagem = "Detalhes do Atleta: ";
        System.out.println(mensagem);
        System.out.println("Nome: " + this.getNome());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Esporte Praticado: " + this.esportePraticado);
    }

    void calcularIMC(){
        double IMC = this.getPeso()/(this.getAltura()*this.getAltura());
        double imcAtleta = IMC * 0.95;
        String imcFormatado = String.format("%.2f", imcAtleta);
        System.out.println("IMC ajustado para atleta: " + imcFormatado);
        System.out.println("------------");
    }

    public String getEsportePraticado() {
        return esportePraticado;
    }

    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }
}
