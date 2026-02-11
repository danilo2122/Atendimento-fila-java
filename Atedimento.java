import java.util.LinkedList;
import java.util.Queue;

public class Atedimento {
    private Queue<Cliente> fila = new LinkedList<>();
    public void adicionarCliente(Cliente cliente){
        fila.add(cliente);
        System.out.println("Cliente adicionado a fila: "+ cliente.getNome());
    }
    public void chamarProx(){
        if (fila.isEmpty()){
            System.out.println("Nenhum cliente na fila");
        }else{
            Cliente cliente = fila.poll();
            System.out.println("Chamando cliente" + cliente.getNome());
        }
    }
    public void mostrarFila(){
        if(fila.isEmpty()){
            System.out.println("Fila vazia");
        }else{System.out.println("Clientes na fila ");
            for (Cliente c: fila){
                System.out.println("-"+ c.getNome());
            }
        }
    }
}
