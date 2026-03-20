import java.util.ArrayList;
import java.util.List;
public class ServiçoUsuario {
    private List <Usuario> usuarios =new ArrayList<>();
      public void cadastrar(Usuario usuario)
      {
          usuarios.add(usuario);
      }
      public Usuario login(String email,String senha)
      {
          for (Usuario u:usuarios){
              if (u.getEmail().equals(email) &&
              u.getSenha().equals(senha)) {
                  return u;
              }
          }
              return null;
      }

    public List<Usuario> listar() {
          return usuarios;
    }
}
