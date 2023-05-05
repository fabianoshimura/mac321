import javax.swing.*;

public class exercicio5_mercado {
	
	public static void main(String[] args) {
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos: "));
		double total = 0;
		
		exercicio5_item produto[] = new exercicio5_item[qtd];
		for (int i = 0; i < qtd; i++) {
			double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco: "));
			String descricao = JOptionPane.showInputDialog("Digite a descricao: ");
			produto[i] = new exercicio5_item();
			produto[i].setItem(preco, descricao);
		}
		for (int i = 0; i < qtd; i++) {
			System.out.println("Preco: " + produto[i].getPreco() + "\nDescricao: " + produto[i].getDescricao() +"\n");
			total += produto[i].getPreco();
			
		}
		System.out.println("Preco total da compra: " + total);
	}

}
