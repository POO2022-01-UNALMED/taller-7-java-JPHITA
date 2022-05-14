package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public String toString(){
        String r = "";
        r += this.getOrigen() + "\n";
        r += this.getTitulo() + "\n";
        r += this.getAutor() + "\n";
        r += this.getPaginas() + "\n";

        r += this.ensenanza;

        return r;
    }

    public int palabrasTotales(int param){
        return this.getPaginas()*param;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
