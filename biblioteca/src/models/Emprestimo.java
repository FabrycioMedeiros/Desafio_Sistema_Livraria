package models;

import java.time.LocalDate;

public class Emprestimo {
    private Cliente cliente;
    private Livro livro;
    private LocalDate dataEmprestimo;

    public Emprestimo(Cliente cliente, Livro livro) {
        this.cliente = cliente;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Livro getLivro() {
        return livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    @Override
    public String toString() {
        return "Empréstimo: " + livro.getTitulo() + " emprestado por " + cliente.getNome() + " em " + dataEmprestimo;
    }
}
