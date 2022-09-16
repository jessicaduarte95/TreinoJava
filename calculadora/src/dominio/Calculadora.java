package dominio;

public class Calculadora {
    public double soma(double num1, double num2){
        return num1+num2;
    }

    public double subtracao(double num1, double num2){
        return num1-num2;
    }

    public double multiplicacao(double num1, double num2){
        return num1*num2;
    }

    public double divicao(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1/num2;
    }
}
