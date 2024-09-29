package services;

import models.Autor;
import models.Cliente;
import models.Emprestimo;
import models.Livro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public Autor encontrarAutorPorId(int id) {
        for (Autor autor : autores) {
            if (autor.getId() == id) {
                return autor;
            }
        }
        return null;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros Disponíveis:");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void emprestarLivro(int idLivro, int idCliente) {
        Livro livro = null;
        Cliente cliente = null;

        for (Livro l : livros) {
            if (l.getId() == idLivro && l.isDisponivel()) {
                livro = l;
                break;
            }
        }

        for (Cliente c : clientes) {
            if (c.getId() == idCliente) {
                cliente = c;
                break;
            }
        }

        if (livro != null && cliente != null) {
            livro.setDisponivel(false);
            Emprestimo emprestimo = new Emprestimo(cliente, livro);
            emprestimos.add(emprestimo);
            System.out.println("Livro emprestado com sucesso para " + cliente.getNome());
        } else {
            System.out.println("Livro ou cliente não encontrado ou livro não disponível.");
        }
    }

    public void listarEmprestimos() {
        System.out.println("Histórico de Empréstimos:");
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println(emprestimo);
        }
    }

    public void devolverLivro(int idLivro, int idCliente) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().getId() == idLivro && emprestimo.getCliente().getId() == idCliente) {
                emprestimo.getLivro().setDisponivel(true);
                System.out.println("Livro devolvido com sucesso!");
                return;
            }
        }
        System.out.println("Empréstimo não encontrado.");
    }

    public void buscarLivroPorTitulo(String titulo) {
        System.out.println("Resultados da busca por título '" + titulo + "':");
        for (Livro livro : livros) {
            if (livro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                System.out.println(livro);
            }
        }
    }

    public void buscarLivroPorAutor(String nomeAutor) {
        System.out.println("Resultados da busca por autor '" + nomeAutor + "':");
        for (Livro livro : livros) {
            if (livro.getAutor().getNome().toLowerCase().contains(nomeAutor.toLowerCase())) {
                System.out.println(livro);
            }
        }
    }
}
