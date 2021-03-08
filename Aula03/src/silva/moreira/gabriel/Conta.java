package silva.moreira.gabriel;

public class Conta {
    //Atributos das classes
    Cliente cliente;
    double saldo;
    int numero;

    //Métodos da classe
    void depositar(double valor){
        //this.saldo = this.saldo + valor
        this.saldo += valor;
    }
    boolean sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    boolean transferirDinheiro(Conta destino, double valor){
        if(sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;

    }


    void visualizarSaldo(){
        System.out.println("Saldo atual: R$" + this.saldo);
    }



    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente +
                ", saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }
}
