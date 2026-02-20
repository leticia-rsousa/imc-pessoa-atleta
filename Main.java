public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Cleiton");
        pessoa.setPeso(50);
        pessoa.setAltura(1.60);

        Atleta atleta = new Atleta();
        atleta.setNome("Juanito");
        atleta.setPeso(50);
        atleta.setAltura(1.60);
        atleta.setEsportePraticado("Vôlei");

        pessoa.mostrarDetalhes();
        pessoa.calcularIMC();
        atleta.mostrarDetalhes();
        atleta.calcularIMC();
    }
}
