package vendaProduto.Venda.exceptions.comercial;

public class VendaNotFoundException extends RuntimeException{
    public VendaNotFoundException(Long id){
        super("Venda #" + id + " não encontrado");
    }
}