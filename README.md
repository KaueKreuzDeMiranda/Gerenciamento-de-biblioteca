# 📚 Sistema de Gerenciamento de Biblioteca

Este é um projeto console desenvolvido em **Java** com foco prático no aprendizado e aplicação dos pilares da **Orientação a Objetos (POO)**. O sistema simula o gerenciamento, empréstimo, devolução e geração de relatórios de diferentes materiais didáticos (Livros, Revistas e DVDs).

## 🏗️ Estrutura e Conceitos de POO Aplicados

O projeto foi estruturado para exercitar conceitos fundamentais de arquitetura de software:

* **Abstração e Herança:**
* **Polimorfismo:**
* **Interfaces:**
* **Encapsulamento:**
  
---

## 🛠️ Funcionalidades do Sistema

1.  **Cadastrar Livro, Revista e DVD**
2.  **Listar Materiais**: Exibe todos os itens cadastrados e suas respectivas informações detalhadas.
3.  **Consultar por Código**: Busca rápida de um material específico na lista.
4.  **Realizar Empréstimo**: Altera o status do material para indisponível (caso já não esteja emprestado).
5.  **Realizar Devolução**: Altera o status do material de volta para disponível.
6.  **Alterar Dados**: Permite editar todas as informações de um material já cadastrado, identificando dinamicamente seu tipo (`instanceof`).
7.  **Excluir Material**: Remove permanentemente um item do acervo usando seu código.
8.  **Gerar Relatório**: Exibe métricas em tempo real sobre a quantidade total de itens, divisões por categorias e o balanço de materiais disponíveis/emprestados.
