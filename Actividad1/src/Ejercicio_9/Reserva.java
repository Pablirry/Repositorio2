package Ejercicio_9;

public class Reserva {

    private String fechaEntrada;
    private String fechaSalida;
    private Habitacion[] habitaciones;
    private Cargo[] cargos;
    private int numHabitaciones;
    private int numCargos;

    public Reserva(String fechaEntrada, String fechaSalida) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.habitaciones = new Habitacion[5]; // Tamaño arbitrario inicial
        this.cargos = new Cargo[5]; // Tamaño arbitrario inicial
        this.numHabitaciones = 0;
        this.numCargos = 0;
    }

    // Getters y setters
    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Habitacion[] habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Cargo[] getCargos() {
        return cargos;
    }

    public void setCargos(Cargo[] cargos) {
        this.cargos = cargos;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumCargos() {
        return numCargos;
    }

    public void setNumCargos(int numCargos) {
        this.numCargos = numCargos;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        if (numHabitaciones < habitaciones.length) {
            habitaciones[numHabitaciones++] = habitacion;
        } else {
            System.out.println("Las habitaciones están llenas");
        }
    }

    public void realizarCobro(Cargo cargo) {
        if (numCargos < cargos.length) {
            cargos[numCargos++] = cargo;
        } else {
            System.out.println("Los cargos están completos");
        }
    }

    public String toString() {
        String texto = "Reserva [fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + "]";

        if(numHabitaciones > 0) {
            texto += "\nHabitaciones:\n";
        
        for (int i = 0; i < numHabitaciones; i++) {
            texto += "\n\tHabitacion " + habitaciones.toString();
        }
    }else{
        texto += "\nHabitaciones: No hay habitaciones";
    }
        
    if(numCargos>0){
        texto += "\nCargos:\n";
    for (int i = 0; i < numCargos; i++) {
            texto += "\n\tCargo " + cargos.toString();
        }
    }else{
        texto += "\nCargos: No hay cargos";
    }

        return texto;
    }

}
