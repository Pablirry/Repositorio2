package Ejercicio_7;

public class Polideportivos {

    private String nombre;
    private String direccion;
    private int extension;
    private Pistas pistas[];

    public Polideportivos(String nombre, String direccion, int extension, int numPistas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.extension = extension;
        pistas = new Pistas[0];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        String texto = "Polideportivo [nombre=" + nombre + ", direccion=" + direccion + ", extension=" + extension + "]\n";

        for (int i = 0; i < pistas.length; i++) {
            texto += "\t" + pistas[i].toString()+ "\n";
        }
        return texto;
    }

    public void añadirPista (int codigo, tipoPista tipo, boolean operativa, double precio, String fechaUltimaReserva){

        Pistas pNueva = new Pistas(codigo, tipo, operativa, precio, fechaUltimaReserva);
        
        int tam = pistas.length;
        int nuevoTam = pistas.length+1;

        Pistas nuevoVector[] = new Pistas[nuevoTam];

        for(int i=0;i<tam;i++){
            nuevoVector[i] = pistas[i];
        }

        int posNuevo = nuevoTam-1;
        nuevoVector[posNuevo] = pNueva;

        this.pistas = nuevoVector;
    }

    public void eliminarPista (int pos){

        int tamNuevo = pistas.length-1;

        Pistas nuevoV[] = new Pistas[tamNuevo];

        for(int i=0;i<pos;i++){
            nuevoV[i] = pistas[i];
        }

        for(int i=pos;i<tamNuevo;i++){
            nuevoV[i] = pistas[i+1];
        }

        this.pistas = nuevoV;
}

public Pistas getPista(int pos){
    if(pos<=0 && pos<pistas.length){
        return pistas[pos];
    }
    else{
        return null;

    }

}

}
