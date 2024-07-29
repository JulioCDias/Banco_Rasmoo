public class TesteMetodo {
    public static void main(String[] args) {
      Conta primeriaConta = new Conta();
      primeriaConta.saldo = 7567.00;
      System.out.println("O Valor do saldo é: "+primeriaConta.saldo);
      primeriaConta.depositar(3000);
      System.out.println("O Valor do saldo é: "+primeriaConta.saldo);

      primeriaConta.sacar(20000);
        System.out.println(primeriaConta.saldo);
    }
}
