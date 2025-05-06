class Carro extends Veiculo { // Classe Filha que herda características da Classe Pai (Veiculo)
    public Carro(String nome) {
        super(nome); // Chama o construtor da Classe Pai
    }
    @Override // Sobrescreve o método da Classe Pai
    public void fazerSom() {
        System.out.println("Meu carro faz 'vrom vrom' ao acelerar!");
    }
}