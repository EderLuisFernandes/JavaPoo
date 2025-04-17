public class Main {
    public static void main(String[] args) {
        // Instanciando os objetos ja adicionando o nome e idade  porque declarei como parametro nas classes 
        Animal meuCachorro = new Cachorro("Rex", 5);
        Animal meuGato = new Gato("Mimi", 3);

        // Polimorfismo: mesma chamada, comportamento diferente sendo que so vai mostrar nome + o som  do animal que eu atribuir
        meuCachorro.fazerSom();  // Output: Rex diz: Au Au!
        meuGato.fazerSom();      // Output: Mimi diz: Miau!
    }
}
