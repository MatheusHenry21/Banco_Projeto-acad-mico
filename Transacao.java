import java.text.SimpleDateFormat;
import java.util.Date;

public class Transacao {
    private String tipo;
    private double valor;
    private String date;
    private String detalhes;

    private Date data = new Date();
    private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    private String dateFormat = formato.format(data);

    public Transacao(String tipo, double valor, String detalhes){
        this.tipo = tipo;
        this.valor = valor;
        this.date = dateFormat;
        this.detalhes = detalhes;
    }

    public String getTipo(){
        return tipo;
    }

    public double getValor(){
        return this.valor;
    }

    public String getData(){
        return date;
    }

    public String getDetalhes(){
        return detalhes;
    }
}
