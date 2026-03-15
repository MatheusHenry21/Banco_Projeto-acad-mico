import java.util.Date;

public class Transacao {
    private String tipo;
    private double valor;
    private Date data;
    private String detalhes;

    public Transacao(String tipo, double valor, Date data, String detalhes){
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.detalhes = detalhes;
    }

    public String getTipo(){
        return tipo;
    }

    public double getValor(){
        return this.valor;
    }

    public Date getData(){
        return data;
    }

    public String getDetalhes(){
        return detalhes;
    }
}
