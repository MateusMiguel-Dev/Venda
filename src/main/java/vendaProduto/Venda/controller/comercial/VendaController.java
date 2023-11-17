package  vendaProduto.Venda.controller.comercial;

import vendaProduto.Venda.model.domain.comercial.Venda;
import vendaProduto.Venda.model.repositories.comercial.VendaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaController {
    private VendaRepository vendaRepository;
    public VendaController(VendaRepository vendaRepository){
        this.vendaRepository = vendaRepository;
    }

    //operacao Create
    @PostMapping
    public Venda save(@RequestBody Venda venda){
        return this.vendaRepository.save(venda);
    }

    //operacao Read
    @GetMapping
    public List<Venda> list(){
        return this.vendaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Venda show(@PathVariable Long id){
        return this.vendaRepository.getById(id);
    }

    //operacao Updade
    @PutMapping("/{id}")
    public Venda update(@PathVariable Long id, @RequestBody Venda venda){
        Venda vendaAux = vendaRepository.getById(id);
        return vendaRepository.save(vendaAux);
    }

    //operacao Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        vendaRepository.deleteById(id);
    }
}
