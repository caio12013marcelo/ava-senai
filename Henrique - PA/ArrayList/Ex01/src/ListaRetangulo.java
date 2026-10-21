import java.util.ArrayList;
import java.util.List;

public class ListaRetangulo {
    private List<Retangulo> retangulos;

    public ListaRetangulo() {
        retangulos =  new ArrayList<Retangulo>();
    }

    public void adicionarRetangulo(Retangulo r){
        retangulos.add(r);
    }
    public Retangulo maiorArea(){
        Retangulo maiorAreaRetangulo = null;
        double maiorArea = Double.MIN_VALUE;

        for(Retangulo r : retangulos ){
            if (r.calcularArea()>maiorArea){
                maiorArea=r.calcularArea();
                maiorAreaRetangulo=r;
            }
        }
        return  maiorAreaRetangulo;
    }
    public Retangulo maiorPerimetro(){
        Retangulo maiorPerimetroRetangulo = null;
        double maiorPerimetro = Double.MIN_VALUE;

        for(Retangulo r : retangulos ){
            if (r.calcularPerimetro()>maiorPerimetro){
                maiorPerimetro=r.calcularPerimetro();
                maiorPerimetroRetangulo=r;
            }
        }
        return  maiorPerimetroRetangulo;
    }
}
