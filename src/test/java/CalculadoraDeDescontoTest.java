import org.example.CalculadoraDeDesconto;
import org.example.ServicoDeDesconto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class CalculadoraDeDescontoTest {
  // 1. O Mock: Cria um objeto simulado do ServicoDeDesconto
  @Mock
  private ServicoDeDesconto mockServico;
  // 2. A Injeção: Cria uma instância real da CalculadoraDeDesconto
// e injeta o mockService nela.
  @InjectMocks
  private CalculadoraDeDesconto calculadora;
  @Test
  void testCalcularDesconto_ComMock() {
// 3. A Programação do Mock: Diga ao mock o que fazer
// Quando o método getPorcentagemDeDesconto() for chamado,
// retorne 0.20 (20%)
    when(mockServico.getPorcentagemDeDesconto()).thenReturn(0.20);
// 4. A Execução do Teste: Chame o método na classe real
    double valorFinal = calculadora.calcularDesconto(100.0);
// 5. A Verificação: Compare o resultado com o valor esperado
// 100 * (1 - 0.20) = 80.0
    assertEquals(80.0, valorFinal);
  }
}