public class TesteNull {
    public static void main(String[] args) {
        Conta conta = new Conta();
        System.out.println(conta.agencia); // Zerado
        System.out.println(conta.numero); //Zerado
        System.out.println(conta.saldo);// Zerado

        System.out.println(conta.titular);//Null
        //NullPointerExecption aparece quando tenta trabalhar com algum atributo ou variavel que nao esta referenciada
        conta.titular = new Cliente(); //Corrigindo esse exemplo de NullpointerExecption

        conta.titular.nome = "Julio C D Santos";
        System.out.println(conta.titular.nome);
    }
}
