public class TesteComposicao {
    public static void main(String[] args) {
        Cliente clientePedro = new Cliente(); //Intancia do Objeto Cliente
        clientePedro.nome = "Julio"; // parametros do Objeto
        clientePedro.cpf = "12345678999";
        clientePedro.profissao = "Programador";
        clientePedro.salario = 5.550;
        Conta conta = new Conta(); //Instancia do Objeto Conta
        conta.titular = clientePedro; //Composição O objeto Conta no campo/parametro titular esta recebendo um Objeto Cliente
        System.out.println(conta.titular.nome); // pegadndo informações
        System.out.println(conta.titular.cpf);
        System.out.println(conta.titular.profissao);
    }
}
