import java.util.ArrayList;
import java.util.List;

public class Floricultura {
    private List<Flor> flores;

    public Floricultura() {
        flores = new ArrayList<>();
    }
    public void adicionarFlores(Flor r){
        flores.add(r);
    }
    public List<Flor> retornarCompraCliente(String nomeClient){
        List<Flor> floresCompradas = new ArrayList<>();
        for (Flor r : flores){
            if (r.getNomeCliente().equals(nomeClient)){
                floresCompradas.add(r);
            }
        }
        return  floresCompradas;
    }
}
