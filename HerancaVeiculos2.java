public class HerancaVeiculos2 { // Classe Principal que executa o programa Java
    public static void main(String[] args) { // Cria instâncias das classes Carro e Moto, cada um com um nome específico
        Carro meuCarro = new Carro("Ford Ranger");
        Moto minhaMoto = new Moto("Honda Biz");
        
        System.out.println("O modelo do meu carro é: " + meuCarro.getNome());
        meuCarro.fazerSom();
        
        System.out.println("\nO modelo da minha moto é: " + minhaMoto.getNome());
        minhaMoto.fazerSom();
    }
}