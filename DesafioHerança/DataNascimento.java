public class DataNascimento {
    int dia;
    int mes;
    int ano;
    String horario = "00:00";

    public DataNascimento(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void mostrarData() {
        System.out.println("Data de Nascimento: " + dia + "/" + mes + "/" + ano + " às " + horario);
    }
}
