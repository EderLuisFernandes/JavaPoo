// Herança: Gato herda de Animal
public class Gato extends Animal {
    
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    // Polimorfismo: implementação do método abstrato
    @Override
    public void fazerSom() {
        System.out.println(getNome() + " diz: Miau!");
    }
}
