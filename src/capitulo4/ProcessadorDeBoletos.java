package capitulo4;

import java.util.List;

public class ProcessadorDeBoletos {

	public void processa(List<Boleto> boletos, Fatura fatura) {

		for (Boleto boleto : boletos) {
			Pagamento pagamento = new Pagamento(boleto.getValor(),
					MeioDePagamento.BOLETO);
			fatura.adicionaPagamento(pagamento);
		}
	}
}