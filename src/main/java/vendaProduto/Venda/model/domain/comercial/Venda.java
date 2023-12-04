package vendaProduto.Venda.model.domain.comercial;

import vendaProduto.Venda.model.domain.pessoal.Usuario;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class Venda{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataVenda;

    public long getId() {
        return id;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Item> getItens() {
        return itens;
    }

    public void setItens(Set<Item> itens) {
        this.itens = itens;
    }

    @OneToMany(mappedBy = "venda")
    Set<Item> itens;
    @ManyToOne
    private Usuario usuario;
}
