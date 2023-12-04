package vendaProduto.Venda.controller.pessoal;

import vendaProduto.Venda.model.domain.comercial.Usuario;
import vendaProduto.Venda.model.repositories.pessoal.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioRepository usuarioRepository;
    public UsuarioController(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    //operacao Create
    @PostMapping
    public Usuario save(@RequestBody Usuario usuario){
        return this.usuarioRepository.save(usuario);
    }

    //operacao Read
    @GetMapping
    public List<Usuario> list(){
        return this.usuarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Usuario show(@PathVariable Long id){
        return this.usuarioRepository.getById(id);
    }

    //operacao Updade
    @PutMapping("/{id}")
    public Usuario update(@PathVariable Long id, @RequestBody Usuario usuario){
        Usuario usuarioAux = usuarioRepository.getById(id);
        usuarioAux.setNome(usuario.getNome());
        usuarioAux.setTelefone(usuario.getNome());
        usuarioAux.setCpf(usuario.getCpf());
        usuarioAux.setTelefone(usuario.getTelefone());
        usuarioAux.setSenha(usuario.getSenha());
        usuarioAux.setEmail(usuario.getEmail());
        return usuarioRepository.save(usuarioAux);
    }

    //operacao Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        usuarioRepository.deleteById(id);
    }
}
