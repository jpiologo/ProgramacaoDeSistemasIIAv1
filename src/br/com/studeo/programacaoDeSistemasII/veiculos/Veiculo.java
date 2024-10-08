package br.com.studeo.programacaoDeSistemasII.veiculos;

public class Veiculo {
    public String marca;
    public String modelo;
    public int anoDeFabricacao;

    public void setInformacoesDoVeiculo(String marca, String modelo, int anoDeFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getFichaTecnica() {
        return "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Ano de Fabricação: " + anoDeFabricacao;
    }
}
