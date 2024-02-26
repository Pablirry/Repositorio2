package Ejercicio_3;

public class pruebaEmpleado {

    public static void main(String[] args) {
        
		Empleado e1 = new Empleado("Rafa");
		Operario o1=new Operario("Alfonso");
		Directivo d1= new Directivo("Ramon");
		Oficial of1=new Oficial("Lolo");
		Tecnico t1=new Tecnico("Juan");
		
		Empleado v[]=new Empleado[5];
		v[0]=e1;
		v[1]=d1;
		v[2]=o1;
		v[3]=t1;
		v[4]=of1;
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i].datos());
		}	
	}

}
