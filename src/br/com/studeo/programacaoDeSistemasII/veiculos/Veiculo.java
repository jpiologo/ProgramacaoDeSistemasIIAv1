package br.com.studeo.programacaoDeSistemasII.veiculos;

public class Veiculo {
    public String marca;
    public String modelo;
    public int anoDeFabricacao;

    public void setInformacoesDoVeiculo(String marca, String Modelo, int anoDeFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    private void mostraFichaTecnica() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoDeFabricacao);
    }

    public String getFichaTecnica() {
        return "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Ano de Fabricação: " + anoDeFabricacao;
    }
}
