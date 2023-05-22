import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrackingSystem {
    List<Libro> libros=new ArrayList<>();
    List<Libro> librosPorAutor=new ArrayList<>();
    int suma=0;

    public TrackingSystem() {
    }

    public void addPackage(Libro libro1){
        libros.add(libro1);
        Collections.sort(libros);
    }
    /*public void ordenarListaPackage(Package package1){
        packages.add(package1);
    }*/
    public void removePackage(List<Libro> listaRemover,String trackingNumberT){
        if (searchByTrackingNumberLineal(listaRemover,trackingNumberT)>=0){
            libros.remove(searchByTrackingNumberLineal(listaRemover,trackingNumberT));
        }
    }
    public void removePackagePorNombre(List<Libro> listaRemover,String nombre){
        if (searchByTrackingNombre(listaRemover,nombre)>=0){
            libros.remove(searchByTrackingNombre(listaRemover,nombre));
        }
    }

    public List<Libro> searchByNombreLineal (List<Libro> listaBuscarPorNombre, String nombre) {
        for (int a=0; a<listaBuscarPorNombre.size(); a++){
            if (listaBuscarPorNombre!=null && listaBuscarPorNombre.size()>=0 && listaBuscarPorNombre.get(a).getNombre().equals(nombre)){

                librosPorAutor.add(listaBuscarPorNombre.get(a));
            }
        }
        return librosPorAutor;
    }

    public int searchByTrackingNumberLineal(List<Libro> listaBuscar, String trackingNumberT) {
        for (int j=0; j<listaBuscar.size(); j++){
            if (listaBuscar!= null && listaBuscar.size()>=0 && listaBuscar.get(j).getId().equals(trackingNumberT)){
                return j;
            }
        }
        return -1;
    }
    public int searchByTrackingNombre(List<Libro> listaBuscar, String nombre) {
        for (int j=0; j<listaBuscar.size(); j++){
            if (listaBuscar!= null && listaBuscar.size()>=0 && listaBuscar.get(j).getNombre().equals(nombre)){
                return j;
            }
        }
        return -1;
    }
    public boolean searchByTrackingNombreValidar(List<Libro> listaBuscar, String nombre) {
        for (int j=0; j<listaBuscar.size(); j++){
            if (listaBuscar!= null && listaBuscar.size()>=0 && listaBuscar.get(j).getNombre().equals(nombre)){
                return true;
            }
        }
         return false;
    }
    public  Libro searchBinary(List<Libro> listaBuscarPorTrackingBinario, int targetTrackingNumberT) {
        int izquierda=0, derecha= listaBuscarPorTrackingBinario.size() -1;
        while (izquierda<=derecha){
            int numMedio=(derecha+izquierda)/2;
            if(targetTrackingNumberT==Integer.parseInt(listaBuscarPorTrackingBinario.get(numMedio).getId())){
                return listaBuscarPorTrackingBinario.get(numMedio);
            }else if(Integer.parseInt(listaBuscarPorTrackingBinario.get(numMedio).getId())<targetTrackingNumberT){
                izquierda=numMedio+1;
            }else{
                derecha=numMedio-1;
            }
        }
        return null;
    }
    public List<Libro> searchByAutor (List<Libro> listaBuscarPorAutor, String autor) {
        for (int a=0; a<listaBuscarPorAutor.size(); a++){
            if (listaBuscarPorAutor!=null && listaBuscarPorAutor.size()>=0 && listaBuscarPorAutor.get(a).getAutor().equals(autor)){

                librosPorAutor.add(listaBuscarPorAutor.get(a));
            }
        }
        return librosPorAutor;
    }

    public int sumaPaginasRecursiva(List<Libro> listaParaSumarPaginas, int indice){
        if (indice==0){
            return listaParaSumarPaginas.get(indice).getPagina();
        }else {
            return listaParaSumarPaginas.get(indice).getPagina()+sumaPaginasRecursiva(listaParaSumarPaginas,indice-1);
        }
    }
}


