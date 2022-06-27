public class TesteDrive {

    public static void main(String[] args) {

        Carro c1 = new Carro();
        c1.marca = "Triton";
        c1.cor = "Levemente azulado";
        c1.velocidade = 30;
        c1.ano = 1297;

        Carro c2 = new Carro();
        c2.marca = "Uno com escada";
        c2.cor = "Branco levemente azulado";
        c2.velocidade = 60;
        c2.ano = 2046;


        c1.aceleracao(70);

        System.out.println("Velocidade inicial do carro1 é: " + c1.velocidade + "km/hora, da marca " + c1.marca);

        c1.freio(10);
        System.out.println("Velocidade atual é de : " + c1.velocidade + "km/hora, da marca " + c1.marca);


                c2.aceleracao(40);

                System.out.println("Velocidade inicial do carro2 é: " + c2.velocidade + "km/hora, da marca " + c2.marca+ ", de cor " +c1.cor);

                c2.freio(10);

                System.out.println("Velocidade atual é de : " + c2.velocidade + "km/hora, da marca " + c2.marca);

    }

}