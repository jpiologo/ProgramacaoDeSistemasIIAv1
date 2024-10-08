package br.com.studeo.programacaoDeSistemasII.veiculos;

public class Carro extends Veiculo{
    public int numeroDePortas;

    public void setInformacoesDoVeiculo(String marca, String modelo, int anoDeFabricacao, int numeroDePortas) {
        super.setInformacoesDoVeiculo(marca, modelo, anoDeFabricacao);
        this.numeroDePortas = numeroDePortas;
    }

    public String getFichaTecnica() {
        return "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Ano de Fabricação: " + anoDeFabricacao + "\n" +
                "Número de Portas: " + numeroDePortas;
    }
}
