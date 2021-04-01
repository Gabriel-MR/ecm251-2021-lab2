
//Gabriel Moreira Silva - 19.00397-8
//Felipe Oliveira Boacnin - 19.00616-0

package silva.moreira.gabriel;

public class Contas {
    private Usuarios usuario;
    private int idConta;
    private double saldo;

    public Contas(Usuarios nome, int idConta, double saldo) {
        this.usuario = new Usuarios(nome);
        this.idConta = idConta;
        this.saldo = saldo;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public int getIdConta() {
        return idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(Contas destino, double valor){
        if(sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Contas{" +
                "usuario=" + usuario +
                ", idConta=" + idConta +
                ", saldo=" + saldo +
                '}';
    }
}
