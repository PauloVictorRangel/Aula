public class Seguro{
    private float valor;
    private boolean vigencia;

    // ligação 1 pra 1 entre veiculo e seguro
    private Veiculo veiculo;
    //ligação 1 pra 1 entre cliente e seguro
    private Cliente proprietario;
    private Cliente[ ] assegurados;
}