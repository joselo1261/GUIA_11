package ejercicio1_entidades;


public class DNI {
    
    private char serie;
    private long numero;

    public DNI() {
    }

    public DNI(char serie, long numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "DNI{" + "serie=" + serie + ", numero=" + numero + '}';
    }
    
}
