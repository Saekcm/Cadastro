import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ServiçoUsuario serviço = new ServiçoUsuario();

    static void mostrarMenu() {
        System.out.println("Menu");
        System.out.println("Boas-vindas, por favor escolha uma das opções abaixo");
        System.out.println("1 - Cadastro");
        System.out.println("2 - Login");
        System.out.println("3 - Listar");
        System.out.println("0 - Sair");
    }

    static void cadastrarUsuario() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Senha: ");
        String senha = sc.nextLine();
        serviço.cadastrar(new Usuario(nome,email,senha));
        System.out.println("Cadastro concluido!");
    }
    public static void fazerlogin(){
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Senha: ");
        String senha = sc.nextLine();

        Usuario u = serviço.login(email,senha);
        if (u!=null) {
            System.out.println("Boas vindas," + u.getNome());
        }else {
            System.out.println("Email ou senha errada");
        }
    }
    static void listarusuario(){
        if(serviço.listar().isEmpty()){
            System.out.println("Nenhum usuario foi cadastrado");
            return;
        }
        for (Usuario u: serviço.listar())
        {
            System.out.println(u.getNome() + "-" + u.getEmail());
        }
    }

    static void main(String[] args) {
        int op;
        do {
            mostrarMenu();
            op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    cadastrarUsuario();
                break;
                case 2:
                    fazerlogin();
                break;
                case 3:
                    listarusuario();
                break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        } while (op!=0);
    }
}