class Moto extends Veiculo { // Classe Filha que herda características da Classe Pai (Veiculo)
    public Moto(String nome) {
        super(nome); // Chama o construtor da Classe Pai
    }
    @Override // Sobrescreve o método da Classe Pai
    public void fazerSom() {
        System.out.println("Minha moto faz 'van van' ao acelerar!");
    }
}