public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    //construtor aqui
    Carro(){

    }
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
        //this é pra diferenciar que uma coisa é o atributo do objeto outra coisa é o parâmetro que está usando pra colocar dentro desse atributo

    }
    void setCor(String cor){
        this.cor = cor;
    }
    String getCor() {
        return cor;
    }
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return modelo;
    }
    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    //calcular o tanque
    double totalValorTanque(double valorCombustível){
        return capacidadeTanque * valorCombustível;

    }
}