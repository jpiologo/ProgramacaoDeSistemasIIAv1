package br.com.studeo.programacaoDeSistemasII.veiculos;

public class Motocicleta extends Veiculo{
    public boolean temSideCar;

    public void setInformacoesDoVeiculo(String marca, String modelo, int anoDeFabricacao, boolean temSideCar) {
        super.setInformacoesDoVeiculo(marca, modelo, anoDeFabricacao);
        this.temSideCar = temSideCar;
    }

    public String getFichaTecnica() {
        return "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Ano de Fabricação: " + anoDeFabricacao + "\n" +
                "Possui Sidecar? " + temSideCar;
    }
}
