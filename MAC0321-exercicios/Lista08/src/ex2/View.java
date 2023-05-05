package ex2;

import javax.swing.*;

import org.junit.Test;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {
	private JPanel painel;
	private JTextField tInput;
	private JTextField resultado;
	private JButton bcalcular;
	
	public void setInput(String s){
		tInput.setText(s);
	}
	public String getResultado(){
		return resultado.getText();
	}
	
	public void clicar(){
		bcalcular.doClick();
	}
	
	public View () {
		painel = new JPanel();
	}

	public void MontarTela() throws OverflowException {
		criarCampoDeTexto();
		bcalcular = criarBotaoCalcular();
		criarCampoResultado();
	}
	
	public void MostrarTela() {
		JFrame tela = new JFrame("Calculadora de Fatorial");
		tela.add(painel);
		//tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//tela.pack();
		tela.setSize(640, 100);
		tela.setVisible(true);
	}
	
	public void criarCampoDeTexto() {
		tInput = new JTextField();
		tInput.setPreferredSize(new Dimension(100, 24));
		
		JTextField descricao = new JTextField();
		descricao.setText("Insira um valor: ");
		descricao.setEditable(false);
		descricao.setBorder(null);
		
		painel.add(descricao);
		painel.add(tInput);
	}

	public JButton criarBotaoCalcular() throws OverflowException {
		JButton bcalcular = new JButton("Calcular fatorial!!!");
		final Controller c = new Controller();
		
		bcalcular.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  try {
				  if (Integer.parseInt(tInput.getText()) >= 0 && Integer.parseInt(tInput.getText()) < 13) {
					  resultado.setText("" + c.fatorial(Integer.parseInt(tInput.getText())));
				  }
				  else if (Integer.parseInt(tInput.getText()) >= 13) {
					  throw new OverflowException();
				  }
				  else {
					  JOptionPane.showMessageDialog(null, "Nao existe fatorial de numero negativo!");
					  resultado.setText("nao existe");
				  }
			  }
			  catch (NumberFormatException f) {
				  JOptionPane.showMessageDialog(null, "Inisira um numero inteiro nao negativo!");
				  resultado.setText("nao existe");
			  }
			  catch (OverflowException g) {
				  JOptionPane.showMessageDialog(null, "Ocorreu overflow!");
				  resultado.setText("overflow");
			  }
		  }
		});
		
		painel.add(bcalcular);
		return bcalcular;
	}
	
	public void criarCampoResultado() {
		JTextField descricao = new JTextField();
		descricao.setText("Resultado: ");
		descricao.setEditable(false);
		descricao.setBorder(null);
		
		resultado = new JTextField();
		resultado.setPreferredSize(new Dimension(100, 24));
		resultado.setEditable(false);
		resultado.setBorder(null);
		
		painel.add(descricao);
		painel.add(resultado);
	}
	


}
