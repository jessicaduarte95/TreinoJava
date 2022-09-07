package lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override  // Sobrescrita
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.05;
    } // Aplica-se essa porcentagem para o Desenvolvedor.

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
