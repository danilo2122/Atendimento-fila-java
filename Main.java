public class Main {
    public static void main(String[]args){
        Atedimento atedimento= new Atedimento();
        Cliente n1 =new Cliente("danilo", "444.222.555-77");
        Cliente n2 = new Cliente("oi", "111.222.333-66");
        atedimento.adicionarCliente(n1);
        atedimento.adicionarCliente(n2);
        atedimento.mostrarFila();
        atedimento.chamarProx();
        atedimento.mostrarFila();
    }
}
