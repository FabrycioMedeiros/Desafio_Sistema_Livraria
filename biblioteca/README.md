# Sistema de Gerenciamento de Biblioteca

Este é um sistema simples para gerenciar uma biblioteca, permitindo listar livros, realizar empréstimos, devolver livros e buscar livros por título ou autor. O sistema foi desenvolvido em **Java** e usa estrutura de classes para organizar as funcionalidades.

## Funcionalidades

- **Listar Livros Disponíveis**: Exibe todos os livros disponíveis para empréstimo.
- **Realizar Empréstimo**: Permite que um cliente pegue um livro emprestado, marcando o livro como indisponível.
- **Devolver Livro**: Permite que um cliente devolva um livro, tornando-o disponível novamente.
- **Buscar Livro por Título**: Busca livros pelo título parcial ou completo.
- **Buscar Livro por Autor**: Busca livros por um autor específico.
- **Histórico de Empréstimos**: Exibe o histórico de todos os empréstimos realizados.

## Estrutura do Projeto

O projeto está organizado da seguinte maneira:

biblioteca/
└── src/
    ├── models/
    │   ├── Autor.java          
    │   ├── Cliente.java        
    │   ├── Emprestimo.java     
    │   └── Livro.java          
    ├── services/
    │   └── Biblioteca.java     
    ├── utils/
    │   └── MenuUtil.java       
    └── App.java                

## Pré-requisitos
 * Java 17 ou superior instalado.
 * Um terminal ou IDE para compilar e rodar o código (como VSCode, Eclipse, IntelliJ, etc.).

## Como Configurar e Executar

1. Clonar o Repositório
 git clone https://github.com/FabrycioMedeiros/Desafio_Sistema_Livraria.git

2. Compilar o Projeto
 cd biblioteca/src/

3. Executar o Programa
 java App

 ## Menu do Sistema

  ### Menu:

1. Listar livros disponíveis
2. Realizar empréstimo
3. Listar clientes
4. Histórico de empréstimos
5. Sair
6. Buscar livro por título
7. Buscar livro por autor
8. Devolver livro
  ### Escolha uma opção:

4. Melhorias Futuras

Sugestões de melhorias que podem ser feitas no sistema:

* Persistência de Dados: Adicionar a funcionalidade de salvar os dados dos livros, autores, clientes e empréstimos em um arquivo ou banco de dados para manter os registros entre execuções.
* Validação de Entradas: Melhorar as validações de entrada de dados, como checar se um ID de livro ou cliente existe antes de permitir a realização de empréstimos ou devoluções.
* Filtros e Relatórios: Adicionar opções para filtrar livros por categorias, ou para gerar relatórios de livros mais emprestados.
* Interface Gráfica: Implementar uma interface gráfica para facilitar o uso do sistema com um design mais intuitivo, usando JavaFX ou Swing.
* Controle de Acesso: Implementar um sistema de login para controlar quem pode cadastrar livros ou realizar empréstimos.

5. Contribuição

Contribuições são bem-vindas!
