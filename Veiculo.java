class Veiculo { // Classe Pai
    protected String nome; // Atributo que armazena o nome do veículo
    
    public Veiculo(String nome) {
        this.nome = nome; // Contrutor que inicia o nome do veículo
    }
    public void fazerSom() { // Método que define um comportamento
        System.out.println("Som de um veículo qualquer ao acelerar.");
    }
    public String getNome() { // Método que retorna o nome do veículo
        return nome;
    }
}
