package dio.web.api.repository;

import dio.web.api.handler.BusinessException;
import dio.web.api.handler.CampoObrigatorioException;
import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if (usuario.getLogin()==null)
            throw new CampoObrigatorioException("login");
        if (usuario.getPassword()==null)
            throw new CampoObrigatorioException("senha");
        if (usuario.getId() == null)
            System.out.println("SAVE - Recebendo o usuário na camada do repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada do repositório");

        System.out.println(usuario);
    }
    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuario", id));
        System.out.println(id);
    }
    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Matheus", "senha"));
        usuarios.add(new Usuario("Nalyne", "outrasenha"));
        return usuarios;
    }
    public Usuario findById (Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("Matheus", "senha");
    }
    public Usuario findByUsername (String username) {
        System.out.println(String.format("FIND/username - Recebendo o username:  %s para localizar o usuario", username ));
        return new Usuario("Matheus", "senha");
    }
}
