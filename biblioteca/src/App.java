import models.Autor;
import models.Cliente;
import models.Livro;
import services.Biblioteca;
import utils.MenuUtil;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Autor autor1 = new Autor(1, "George Orwell", "25/06/1903");
        Autor autor2 = new Autor(2, "J.K. Rowling", "31/07/1965");
        Autor autor3 = new Autor(3, "J.R.R. Tolkien", "03/01/1892");
        Autor autor4 = new Autor(4, "Isaac Asimov", "02/01/1920");
        Autor autor5 = new Autor(5, "Agatha Christie", "15/09/1890");
        Autor autor6 = new Autor(6, "Arthur Conan Doyle", "22/05/1859");

        biblioteca.adicionarAutor(autor1);
        biblioteca.adicionarAutor(autor2);
        biblioteca.adicionarAutor(autor3);
        biblioteca.adicionarAutor(autor4);
        biblioteca.adicionarAutor(autor5);
        biblioteca.adicionarAutor(autor6);

        biblioteca.adicionarLivro(new Livro(1, "1984", autor1));
        biblioteca.adicionarLivro(new Livro(2, "Harry Potter e a Pedra Filosofal", autor2));
        biblioteca.adicionarLivro(new Livro(3, "O Senhor dos Anéis", autor3));
        biblioteca.adicionarLivro(new Livro(4, "Fundação", autor4));
        biblioteca.adicionarLivro(new Livro(5, "Assassinato no Expresso do Oriente", autor5));
        biblioteca.adicionarLivro(new Livro(6, "Sherlock Holmes: Um Estudo em Vermelho", autor6));

        Cliente cliente1 = new Cliente(1, "João Silva", "joao@gmail.com");
        Cliente cliente2 = new Cliente(2, "Maria Oliveira", "maria@gmail.com");
        Cliente cliente3 = new Cliente(3, "Pedro Alves", "pedro.alves@hotmail.com");
        Cliente cliente4 = new Cliente(4, "Ana Paula", "ana.paula@yahoo.com");
        Cliente cliente5 = new Cliente(5, "Roberto Costa", "roberto.costa@outlook.com");
        Cliente cliente6 = new Cliente(6, "Camila Santos", "camila.santos@gmail.com");

        biblioteca.adicionarCliente(cliente1);
        biblioteca.adicionarCliente(cliente2);
        biblioteca.adicionarCliente(cliente3);
        biblioteca.adicionarCliente(cliente4);
        biblioteca.adicionarCliente(cliente5);
        biblioteca.adicionarCliente(cliente6);

        boolean continuar = true;

        while (continuar) {
            MenuUtil.exibirMenu();
            int escolha = MenuUtil.capturarOpcao();

            switch (escolha) {
                case 1:
                    biblioteca.listarLivrosDisponiveis();
                    break;
                case 2:
                    int idLivro = MenuUtil.capturarInt("Digite o ID do livro: ");
                    int idCliente = MenuUtil.capturarInt("Digite o ID do cliente: ");
                    biblioteca.emprestarLivro(idLivro, idCliente);
                    break;
                case 3:
                    System.out.println("Clientes cadastrados:");
                    for (Cliente cliente : biblioteca.getClientes()) {
                        System.out.println(cliente);
                    }
                    break;
                case 4:
                    biblioteca.listarEmprestimos();
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Encerrando aplicação...");
                    break;
                case 6:
                    String titulo = MenuUtil.capturarString("Digite o título do livro que deseja buscar: ");
                    biblioteca.buscarLivroPorTitulo(titulo);
                    break;
                case 7:
                    String nomeAutor = MenuUtil.capturarString("Digite o nome do autor que deseja buscar: ");
                    biblioteca.buscarLivroPorAutor(nomeAutor);
                    break;
                case 8:
                    int idLivroDevolucao = MenuUtil.capturarInt("Digite o ID do livro que deseja devolver: ");
                    int idClienteDevolucao = MenuUtil.capturarInt("Digite o ID do cliente: ");
                    biblioteca.devolverLivro(idLivroDevolucao, idClienteDevolucao);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
