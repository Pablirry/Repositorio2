package Ejercicio_5;

public class Curso_universitario {

    /*
     * Se tiene un curso universitario el cual contiene un array de estudiantes.
     * Para cada estudiante se tienen los datos: nombre y apellidos del estudiante,
     * código, número de semestre y nota final del estudiante. Se requiere
     * implementar los siguientes métodos:
     * • Añadir un estudiante al curso: se ingresan por teclado los datos del
     * estudiante. El código del estudiante debe ser único, si el código ya existe
     * se debe generar el mensaje correspondiente.
     * • Buscar un estudiante de acuerdo con su código ingresado por teclado: si se
     * encuentra muestra los datos del estudiante. De lo contrario, debe mostrar el
     * mensaje correspondiente.
     * • Eliminar un estudiante de acuerdo con su código ingresado por teclado: si
     * se encuentra muestra los datos del estudiante y se solicita una confirmación
     * de la eliminación. Si no, debe mostrar el mensaje correspondiente.
     * • Calcular promedio del curso: sumar las notas de los estudiantes y
     * dividirlas por la cantidad de estudiantes que tiene el curso.
     * • Obtener la cantidad de estudiantes que aprobó el curso: calcular el número
     * de estudiantes que obtuvo un promedio mayor o igual a 3.0 y mostrarlo en
     * pantalla. También se debe calcular el porcentaje de estudiantes que aprobó el
     * curso.
     */

    private int contEstudiantes;
    Estudiante[] v;

    /**
     * Constructor curso universitario
     */

    public Curso_universitario() {
        v = new Estudiante[10];
        this.contEstudiantes = 0;
    }

    /**
     * Metodo que añade un estudiante al vector
     * @param e : Estudiante
     */

    public void agregarEstudiante(Estudiante e) {
        if (contEstudiantes < v.length) {
            v[contEstudiantes] = e;
            contEstudiantes++;
        } else {
            System.out.println("El estudiante " + (contEstudiantes + 1) + " no entra en el curso, está completo");
        }
    }

    /**
     * Metodo que lista los estudiantes del curso
     */

    public void listarAlumnos(){
        for(int i = 0;i<this.contEstudiantes;i++){
            Estudiante e = v[i];
            System.out.println(e.toString());
        }
    }

    /**
     * Metodo que busca un alumno por su codigo
     * @param codigo : entero
     */

    public void buscarAlumno(int codigo){
        boolean encontrado = false;
        for(int i = 0;i<this.contEstudiantes;i++){
            Estudiante e = v[i];
            if(e.getCodigo()==codigo){
                System.out.println(e.toString());
                encontrado = true;
            }
        
        }
        if(encontrado == false)
        System.out.println("ERROR, estudiante no encontrado");
        }

}
