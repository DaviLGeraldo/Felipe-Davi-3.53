package testeidade;
import java.util.Scanner;
public class teste {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        Integer idade;
        String sexo ;

        //Recolhe a idade informada
        System.out.println("Digite a sua idade (maior de 18): ");
        idade = entrada.nextInt();

        //Recolhe o sexo
        System.out.println("Digite o seu gênero (M ou F) : ");
        sexo = entrada.next();     


        if ((sexo != "M") && (idade<17))
        {

            System.out.println("Cadastro realizado com sucesso.");

        }else

        System.out.println("Não foi possivel realizar seu cadastro "); 
    
    }
} 