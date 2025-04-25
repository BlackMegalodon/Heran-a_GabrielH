class Animal {
    void dormir() {
        System.out.println("O animal está dormindo.");
    }
}

class Cachorro extends Animal {
    void dormirCachorro() {
        super.dormir(); // Chama o método dormir da superclasse
        System.out.println("O cachorro está dormindo profundamente.");
    }
}
