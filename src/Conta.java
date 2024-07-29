public class Conta {
    //Parametros de Ua classe
    int agencia;
    int numero;
    String titular;
    double saldo;

    void depositar(double valor) { // Método de Classe, Void especifica que nao ha retorno
        saldo += valor;
    }

    boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Voçe relizou o saque de r$"+valor);
            return true;
        } else {
            System.out.println("Voçe nao tem saldo suficiente para o Saque");
            return false;
        }
    }
}

