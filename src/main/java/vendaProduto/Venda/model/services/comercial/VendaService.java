package vendaProduto.Venda.model.services.comercial;

import vendaProduto.Venda.model.domain.comercial.Venda;
import vendaProduto.Venda.model.repositories.comercial.VendaRepository;
import vendaProduto.Venda.exceptions.comercial.VendaNotFoundException;
import org.springframework.stereotype.Service;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendaService {
    private VendaRepository VendaRepository;

    public VendaService(VendaRepository VendaRepository){
        this.VendaRepository = VendaRepository;
    }

    public Venda save(Venda venda){
        return VendaRepository.save(venda);
    }

    public List<Venda> list(){
        return this.VendaRepository.findAll();
    }

    public Venda getById(Long id) throws VendaNotFoundException{
        Optional<Venda> opt = VendaRepository.findById(id);
        if(!opt.isPresent()){
            throw new VendaNotFoundException(id);
        }
        return opt.get();
    }

    public Venda update(Long id, Venda produto) throws VendaNotFoundException{
        Venda vendaAux = this.getById(id);
        vendaAux.setDataVenda(vendaAux.getDataVenda());
        vendaAux.setItens(vendaAux.getItens());
        return VendaRepository.save(vendaAux);
    }

    public void deleteById(Long id) throws VendaNotFoundException{
        if(!this.VendaRepository.existsById(id)){
            throw new VendaNotFoundException(id);
        }
        this.VendaRepository.deleteById(id);
    }
}