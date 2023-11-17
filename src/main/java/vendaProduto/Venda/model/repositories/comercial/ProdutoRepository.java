package vendaProduto.Venda.model.repositories.comercial;

import vendaProduto.Venda.model.domain.comercial.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
