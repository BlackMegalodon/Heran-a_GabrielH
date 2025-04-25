//Herança simples
class Animal {
    void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal {
    void latir() {
        System.out.println("O cachorro late.");
    }
}
//Herança Hierarquica
class Animal {
    void respirar() {
        System.out.println("O animal está respirando.");
    }
}

class Mamifero extends Animal {
    void amamentar() {
        System.out.println("O mamífero amamenta seus filhotes.");
    }
}

class Ave extends Animal {
    void voar() {
        System.out.println("A ave está voando.");
    }
}
//Herança Multinível
class Animal {
    void dormir() {
        System.out.println("O animal está dormindo.");
    }
}

class Mamifero extends Animal {
    void amamentar() {
        System.out.println("O mamífero amamenta seus filhotes.");
    }
}

class Cachorro extends Mamifero {
    void latir() {
        System.out.println("O cachorro late.");
    }
}
//Herança Multipla (Java não aguenta)
interface Animal {
    void emitirSom();
}

interface Mamifero {
    void amamentar();
}

class Cachorro implements Animal, Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz au au.");
    }

    @Override
    public void amamentar() {
        System.out.println("O cachorro amamenta seus filhotes.");
    }
}