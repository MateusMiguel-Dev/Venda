package vendaProduto.Venda.model.domain.comercial;

import java.util.Date;

import jakarta.persistence.Entity;

@Entity
public class Armazem {
    private Date validade;
    private int qtdeEstoque;
}
