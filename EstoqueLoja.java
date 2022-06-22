package br.com.generation.estoque;

public class EstoqueLoja {

	
		private String nome;
		private double preco;
		private int quantidade;
		private double peso;
		
		public EstoqueLoja(String nome, double preco, int quantidade, double peso) {
			this.preco = preco;
			this.quantidade = quantidade;
			this.nome = nome;
			this.peso = peso;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

		
		public String toString() {
			return "Nome: " + nome + " | Preco: " + preco + " | Quantidade: " + quantidade + " | Peso: " + peso + " |";
		}
		
		
		
		
	}
