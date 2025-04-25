class Veiculo {
    String marca = "Ford";
    void buzinar() {
        System.out.println("Buzina");
    }
}

// Subclasse
class Carro extends Veiculo {
    String modelo = "Mustang";
}

public class SintaxeHerança {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        System.out.println(meuCarro.marca);
        System.out.println(meuCarro.modelo);
        meuCarro.buzinar();
    }
}