package produto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoPerecivel extends Produto {

    Date dataValidade;

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public ProdutoPerecivel(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dataValidade != null ? sdf.format(dataValidade) : "Data não definida";
        return super.toString() + ", data de validade: " + dataFormatada;
    }
}
