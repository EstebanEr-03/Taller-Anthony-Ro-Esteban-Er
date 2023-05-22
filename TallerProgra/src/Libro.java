
import java.util.Collections;
public class Libro implements Comparable <Libro> {
    String nombre,autor,editorial,id;
    int pagina;

    public Libro(String nombre, int pagina, String autor, String editorial, String id) {
        this.nombre = nombre;
        this.pagina = pagina;
        this.autor = autor;
        this.editorial = editorial;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int compareTo(Libro o) {
        int comparedResult=id.compareTo(o.id);
        if(comparedResult>0){
            return 1;
        } else if (comparedResult<0) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", id='" + id + '\'' +
                ", pagina=" + pagina +
                '}';
    }
}
