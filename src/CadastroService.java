import java.util.ArrayList;

public class CadastroService {

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void cadastrar(String nome, int idade) {
        usuarios.add(new Usuario(nome, idade));
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void listar() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        System.out.println("=== Lista de Usuários ===");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}
