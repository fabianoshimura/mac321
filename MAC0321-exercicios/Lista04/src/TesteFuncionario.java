import org.junit.*;
import static org.junit.Assert.*;

/* Instruções gerais para os exercícios:
 * 
 * Vocês devem criar uma Classe que façam os testes abaixo passarem. Esses
 * testes NÃO devem ser alterados de maneira alguma, então vocês tem que
 * usar exatamente os mesmos nomes para os métodos, mesma ordem para as
 * variáveis, etc.
 * 
 * Isso porque na correção usaremos outro arquivo de testes, e esse arquivo
 * espera a mesma interface descrita nesse exercício. Caso vocês alterem
 * qualquer coisa, o programa não vai rodar ;(.
 */

public class TesteFuncionario {
	Funcionario funcionarioTeste;
	
	/* Ex1)
	 * Vocês foram contratados como Desenvolvedores Java Junior para
	 * desenvolver parte de um sistema de controle de funcionários para
	 * a empresa "Goldman Entregas Expressas Ltda."
	 * 
	 * A primeira tarefa dada a vocês pelo chefe de vocês é desenvolver uma
	 * classe que guarde as informações de um funcionário. Crie um construtor
	 * para essa classe (não se preocupem com a validação dos dados ainda).
	 * 
	 * O protótipo do construtor é o seguinte:
	 * public Funcionario(String primeiroNome, String segundoNome,
	 *                    String setor, double salario);
	 */
	@Before
	public void setUp() {
		funcionarioTeste = new Funcionario("Fulano", "de Tal", "ABC", 5000);
	}
	
	/* Ex2)
	 * O sistema terá uma interface de usuário e é necessário imprimir o nome
	 * completo do funcionário formatado de maneira correta.
	 * 
	 * Crie um método que retorne o nome do usuário formatado. Lembre-se de
	 * adicionar um espaço entre o primeiro e segundo nomes!	
	 */
	@Test
	public void getNomeCompleto() {
		assertEquals("Fulano de Tal", funcionarioTeste.nomeCompletoFormatado());
	}
	
	/* Ex3a)
	 * Também na interface de usuário será necessário imprimir o salário
	 * do funcionário de maneira correta.
	 * 
	 * Escreva um método que retorne o salário como uma string formatada.
	 * Inclua o símbolo "R$" na frente. Lembre-se dos dois dígitos depois
	 * da vírgula!!
	 */
	@Test
	public void salarioFormatado() {
		assertEquals("R$5000,00", funcionarioTeste.salarioFormatado());
	}
	
	/* Ex3b)
	 * Agora crie um método que permita o aumento do salário do funcionário
	 * em caso de uma promoção. Esse método NÃO deve permitir alterar o
	 * salário de forma negativa.
	 */
	@Test
	public void aumentarSalario() {
		funcionarioTeste.aumentarSalario(-500.50);
		assertEquals("R$5000,00", funcionarioTeste.salarioFormatado());
		funcionarioTeste.aumentarSalario(500.50);
		assertEquals("R$5500,50", funcionarioTeste.salarioFormatado());
	}
	
	/* Ex4)
	 * Os departamentos nessa empresa são identificados com uma sigla de três
	 * caracteres. Por isso o método trocarDepartamento(String) leva isso em
	 * consideração, e retorna False caso o setor tenha um número de letras
	 * diferentes, ou True caso a troca seja feita com sucesso.
	 * 
	 * Escreva um método que realiza a troca de departamentos do funcionário.
	 */	
	@Test
	public void trocarDepartamento() {
		assertFalse(funcionarioTeste.trocarDepartamento("AB"));
		assertFalse(funcionarioTeste.trocarDepartamento("Mais de três letras"));
		assertTrue(funcionarioTeste.trocarDepartamento("XYZ"));
	}
	
	/* Ex5)
	 * Para imprimir o departamento, é necessário incluir a String "Departamento "
	 * antes da sigla do mesmo, por normas da empresa.
	 * 
	 * Faça um método que retorne o nome correto do departamento.
	 */
	@Test
	public void departamentoFormatado() {
		assertEquals("Departamento ABC", funcionarioTeste.departamentoFormatado());
		funcionarioTeste.trocarDepartamento("XYZ");
		assertEquals("Departamento XYZ", funcionarioTeste.departamentoFormatado());
	}
	
	
	/* Ex6)
	 * Retorne as informações do Funcionário como uma String, para ser
	 * mostrado para o usuário da interface gráfica do sistema.
	 * 
	 * Dica: use os métodos criados para os testes anteriores.
	 */
	@Test
	public void informacoesDetalhadas() {
		assertEquals("Fulano de Tal, R$5000,00, Departamento ABC", funcionarioTeste.informacoesFormatadas());
	}
	
	/* Ex7)
	 * É necessário indicar se um funcionário ainda está ativo na empresa
	 * ou não. Para isso o método ativo() existe, retornando true caso o
	 * funcionário ainda esteja trabalhando e false caso contrário.	Uma das
	 * maneiras de tornar o funcionário inativo é demitir o funcionário.
	 * 
	 * Crie os métodos ativo() e demitirFuncionario().
	 */
	@Test
	public void demitirFuncionario() {
		assertTrue(funcionarioTeste.ativo());
		funcionarioTeste.demitirFuncionario();
		assertFalse(funcionarioTeste.ativo());
	}
}