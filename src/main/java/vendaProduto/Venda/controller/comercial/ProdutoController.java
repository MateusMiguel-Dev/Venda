package  vendaProduto.Venda.controller.comercial;

import vendaProduto.Venda.model.domain.comercial.Produto;
import vendaProduto.Venda.model.repositories.comercial.ProdutoRepository;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    //operacao Create
    @PostMapping
    public Produto save(@Valid @RequestBody Produto produto){
        return this.produtoService.save(produto);
    }

    //operacao Read
    @GetMapping
    public List<Produto> list(){
        return this.produtoService.list();
    }

    @GetMapping("/{id}")
    public ResponseEntity show(@PathVariable Long id){
        Produto produto = this.produtoService.getById(id);
        return new ResponseEntity<Produto>(produto, HttpStatus.OK);
    }

    //operacao Updade
    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @Valid @RequestBody Produto produto){
        return new ResponseEntity<Produto>(this.produtoService.update(id, produto),
                HttpStatus.OK);
    }

    //operacao Delete
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        this.produtoService.deleteById(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}