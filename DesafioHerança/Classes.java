class pessoa {
    String cpf = "000.000.000.00";
    DataNascimento dataNascimento;
}

class funcionario extends pessoa {
    String nome = "";
    Double salario = 0.0;
    String departamento = "";

    void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Departamento: " + departamento);
        dataNascimento.mostrarData();
        if (salario != 0.0) {
            System.out.println("Salario: " + salario);
        }
    }

    void baterponto() {
        int ponto = 0;
        ponto++;
        System.out.println("Ponto Batido.");
    }
}

class gerente extends funcionario {
    void fazerReuniao() {
        System.out.println("Reunião agora");
    }
}

class desenvolvedor extends funcionario {
    void programar() {
        System.out.println("Parabéns, Somos a mesma pessoa");
    }
}

class estagiario extends funcionario {
    void fazerTarefa() {
        System.out.println("sua tarefa é sofrer e receber 5 centavos por hora");
    }
}