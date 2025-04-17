// Herança: Cachorro herda de Animal
public class Cachorro extends Animal {
    
    
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    // Polimorfismo: implementação do método abstrato
    @Override
    public void fazerSom() {
        System.out.println(getNome() + " diz: Au Au!");
    }
}
