package ActividadAula;

public class Habitacion {

    private int id;
    private int planta;
    private tipoHabitacion tipo;
    private double precio;
    private boolean ocupado;
    private boolean tieneVistaExterior;

    /**
     * Constructor con todos los atributos
     * 
     * @param id                 : entero
     * @param planta             : entero
     * @param tipo               : tipoHabitacion
     * @param precio             : double
     * @param ocupado            : boolean
     * @param tieneVistaExterior : boolean
     */

    public Habitacion(int id, int planta, tipoHabitacion tipo, double precio, boolean ocupado,
            boolean tieneVistaExterior) {
        this.id = id;
        this.planta = planta;
        this.tipo = tipo;
        this.precio = precio;
        this.ocupado = ocupado;
        this.tieneVistaExterior = tieneVistaExterior;
    }

    /**
     * Metodo get del atributo id
     * 
     * @return : entero
     */

    public int getId() {
        return id;
    }

    /**
     * Metodo set del atributo id
     * 
     * @param id : entero
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo get del atributo planta
     * 
     * @return : entero
     */

    public int getPlanta() {
        return planta;
    }

    /**
     * Metodo set del atributo planta
     * 
     * @param planta : entero
     */

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    /**
     * Metodo get del atributo tipo
     * 
     * @return : tipoHabitacion
     */

    public tipoHabitacion getTipo() {
        return tipo;
    }

    /**
     * Metodo set del atributo tipo
     * 
     * @param tipo : tipoHabitacion
     */

    public void setTipo(tipoHabitacion tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo get del atributo precio
     * 
     * @return : double
     */

    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo set del atributo precio
     * 
     * @param precio : double
     */

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo get del atributo ocupado
     * 
     * @return : boolean
     */

    public boolean isOcupado() {
        return ocupado;
    }

    /**
     * Metodo set del atributo ocupado
     * 
     * @param ocupado : boolean
     */

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    /**
     * Metodo get del atributo tieneVistaExterior
     * 
     * @return : boolean
     */

    public boolean isTieneVistaExterior() {
        return tieneVistaExterior;
    }

    /**
     * Metodo set del atributo tieneVistaExterior
     * 
     * @param tieneVistaExterior : boolean
     */

    public void setTieneVistaExterior(boolean tieneVistaExterior) {
        this.tieneVistaExterior = tieneVistaExterior;
    }

    public String localizacion() {
        String loc = String.valueOf(tipo.name().charAt(0));

        return loc + planta + id;
    }

    /**
     * Metodo toString de la clase Habitacion
     */

    @Override
    public String toString() {
        return "Habitacion [id=" + id + ", planta=" + planta + ", tipo=" + tipo + ", precio=" + precio + ", ocupado="
                + ocupado + ", tieneVistaExterior=" + tieneVistaExterior + ", Localizacion: " + localizacion() + "]";
    }

    @Override
    public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Habitacion other = (Habitacion) obj;
    if (id != other.id)
      return false;
    if (ocupado != other.ocupado)
      return false;
    if (planta != other.planta)
      return false;
    if (precio != other.precio)
      return false;

      return true;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    



}
