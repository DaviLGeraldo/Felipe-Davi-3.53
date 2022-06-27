public class Carro{

    //Atributo

    String marca;
    String cor;
    Integer velocidade;
    Integer ano;

    void aceleracao (Integer acelerar){

        velocidade += acelerar; 

    }

    void freio (Integer freiar){

        velocidade -= freiar;

    }

}