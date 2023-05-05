import java.text.DecimalFormat;


public class Funcionario {
    public String firstName;
    public String lastName;
    public String sector;
    public double salary;
    public boolean ativo = true;
    
    public Funcionario (String primeiroNome, String segundoNome, String setor, double salario) {
        firstName = primeiroNome;
        lastName = segundoNome;
        sector = setor;
        salary = salario;
    }
    
    public String nomeCompletoFormatado() {
        String nomeFormatado = "" + firstName + " " + lastName;
        
        return nomeFormatado;
    }
    
    public String salarioFormatado() {
        DecimalFormat df = new DecimalFormat("0.00");

        String salarioFormatado = "R$" + df.format(salary);
        
        return salarioFormatado;
    }
    
    public void aumentarSalario(double aumento) {
        if (aumento >= 0) {
            salary += aumento;
        }
    }
    
    public boolean trocarDepartamento(String novoDepartamento) {
        if (novoDepartamento.length() == 3) {
            sector = novoDepartamento;
            return true;
        }
        
        return false;
    }
    
    public String departamentoFormatado() {
        return "Departamento " + sector;
    }
    
    public String informacoesFormatadas() {
        return nomeCompletoFormatado() + ", " + salarioFormatado() + ", " + departamentoFormatado();
    }
    
    public boolean ativo() {
        if (ativo)
            return true;
        return false;
    }
    
    public void demitirFuncionario() {
        ativo = false;
    }
}