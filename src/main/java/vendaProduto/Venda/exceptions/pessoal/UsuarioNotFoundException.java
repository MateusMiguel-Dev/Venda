package vendaProduto.Venda.exceptions.pessoal;

public class UsuarioNotFoundException extends RuntimeException{
    public UsuarioNotFoundException(Long id){
        super("Usuario #" + id + " não encontrado");
    }
}