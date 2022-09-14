import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ImcCalculadora {
    public static void main(String[] args) {
        System.out.println("Forneça seu peso(Kg)");
        Scanner peso = new Scanner(System.in);
        float pesoFornecido = peso.nextFloat();

        System.out.println("Forneça sua altura(m2)");
        Scanner altura = new Scanner(System.in);
        float alturaFornecida = altura.nextFloat();

        float imcCalculado = pesoFornecido/(alturaFornecida * alturaFornecida);
        System.out.println("IMC: " + imcCalculado);

        if(imcCalculado < 18.5){
            System.out.println("Classificação do IMC: Magreza");
        }else if(imcCalculado > 18.5 && imcCalculado < 24.9){
            System.out.println("Classificação do IMC: Normal");
        }else if(imcCalculado > 25 && imcCalculado < 29.9){
            System.out.println("Classificação do IMC: Sobrepeso");
            System.out.println("Grau da Obesidade: I");
        }else if(imcCalculado > 30 && imcCalculado < 39.9){
            System.out.println("Classificação do IMC: Obesidade");
            System.out.println("Grau da Obesidade: II");
        }else if(imcCalculado > 40){
            System.out.println("Classificação do IMC: Obesidade Grave");
            System.out.println("Grau da Obesidade: III");
        }
    }
}
