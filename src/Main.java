import tech.mobilidadeapp.Motorista;
import tech.mobilidadeapp.MotoristaIniciante;
import tech.mobilidadeapp.MotoristaParceiroFrotista;
import tech.mobilidadeapp.MotoristaPremium;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Motorista iniciante = new MotoristaIniciante("Carlos Silva", "ABC-1234");
        Motorista premium = new MotoristaPremium("Mariana Souza", "XYZ-9876");
        Motorista frotista = new MotoristaParceiroFrotista("Roberto Dias", "FRO-5678");

        // Simulando corridas para o Iniciante (menos de 5 corridas para testar taxa de inatividade)
        iniciante.registrarCorrida(40.0);
        iniciante.registrarCorrida(60.0);

        // Simulando corridas para o Premium (ganha bônus de R$ 2 por corrida)
        premium.registrarCorrida(100.0);
        premium.registrarCorrida(150.0);
        premium.registrarCorrida(200.0);

        // Simulando corridas para o Frotista (desconto de aluguel)
        frotista.registrarCorrida(500.0);
        frotista.registrarCorrida(600.0);

        // Exibindo Extratos / Holerites
        imprimirHolerite(iniciante);
        imprimirHolerite(premium);
        imprimirHolerite(frotista);
    }

    public static void imprimirHolerite(Motorista motorista) {
        System.out.println("========================================");
        System.out.println("           EXTRATO / HOLERITE           ");
        System.out.println("========================================");
        System.out.println("Nome: " + motorista.getNome());
        System.out.println("Placa: " + motorista.getPlacaVeiculo());
        System.out.println("Categoria: " + motorista.getClass().getSimpleName());
        System.out.println("Qtd. Corridas: " + motorista.getQuantidadeCorridas());
        System.out.printf("Valor Bruto: R$ %.2f\n", motorista.getValorBrutoArrecadado());
        System.out.printf("Valor Líquido a Receber: R$ %.2f\n", motorista.calcularPagamentoLiquido());
        System.out.println("========================================\n");
    }
}