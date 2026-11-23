import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pedido {

    private String codigo;
    private double peso;
    private Endereco endereco;
    private Prioridade prioridade;
    private LocalDateTime dataCriacao;

    private static int totalPedidosCriados = 0;

    public Pedido(String codigo, double peso, Endereco endereco, Prioridade prioridade) {
        this.codigo = codigo;
        this.peso = peso > 0 ? peso : 1.0;
        this.endereco = endereco;
        this.prioridade = prioridade;
        this.dataCriacao = LocalDateTime.now();
        totalPedidosCriados++;
    }

    public Pedido(String codigo, double peso, Endereco endereco) {
        this(codigo, peso, endereco, Prioridade.PADRAO);
    }

    public Pedido(String codigo, double peso) {
        this(codigo, peso, new Endereco("Centro de Distribuicao Principal, 100", "Rio de Janeiro"), Prioridade.PADRAO);
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public boolean setPeso(double novoPeso) {
        if (novoPeso <= 0) {
            return false;
        }
        this.peso = novoPeso;
        return true;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public static int getTotalPedidosCriados() {
        return totalPedidosCriados;
    }

    public String obterResumo() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return String.format("Código: %-7s | Peso: %6.2f kg | Prioridade: %-7s | Destino: %-35s | Criado em: %s",
                codigo, peso, prioridade, endereco, dataCriacao.format(formato));
    }

    @Override
    public String toString() {
        return obterResumo();
    }
}
