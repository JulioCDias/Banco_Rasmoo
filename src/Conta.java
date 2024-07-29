public class Conta {
    //Parametros de Ua classe
    int agencia;
    int numero;
    String titular;
    double saldo;

    void depositar(double valor){ // Método de Classe, Void especifica que nao ha retorno
        saldo += valor;
    }
}
