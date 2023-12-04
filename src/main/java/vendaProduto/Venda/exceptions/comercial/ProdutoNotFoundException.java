package vendaProduto.Venda.exceptions.comercial;

public class ProdutoNotFoundException extends RuntimeException{
    public ProdutoNotFoundException(Long id){
        super("Produto #" + id + " não encontrado");
    }
}