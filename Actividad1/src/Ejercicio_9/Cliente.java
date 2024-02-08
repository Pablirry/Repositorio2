package Ejercicio_9;

public class Cliente {

    // nombre, apellidos, teléfono, email y fecha de nacimiento. 

    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    private String fechaNacimiento;
    private Reserva[] historicoReservas;
    private int numReservas;

    public Cliente(String nombre, String apellidos, String telefono, String email, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.historicoReservas = new Reserva[10]; // Tamaño arbitrario inicial
        this.numReservas = 0;
    }

    public void realizarReserva(Reserva reserva) {
        if (numReservas < historicoReservas.length) {
            historicoReservas[numReservas++] = reserva;
        } else {
            System.out.println("El historico de reservas esta lleno");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Reserva[] getHistoricoReservas() {
        return historicoReservas;
    }

    public void setHistoricoReservas(Reserva[] historicoReservas) {
        this.historicoReservas = historicoReservas;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", email=" + email
                + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

}
