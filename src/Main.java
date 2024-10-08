import br.com.studeo.programacaoDeSistemasII.veiculos.Carro;
import br.com.studeo.programacaoDeSistemasII.veiculos.Motocicleta;
import br.com.studeo.programacaoDeSistemasII.veiculos.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.setInformacoesDoVeiculo("BMW", "X6", 2024);
        System.out.println(veiculo1.getFichaTecnica());

        Carro carro1 = new Carro();
        carro1.setInformacoesDoVeiculo("Volvo","XC60", 2023, 4);
        System.out.println(carro1.getFichaTecnica());

        Motocicleta moto1 = new Motocicleta();
        moto1.setInformacoesDoVeiculo("Kawasaki", "Z650 RS", 2023, false);
        System.out.println(moto1.getFichaTecnica());
    }
}
