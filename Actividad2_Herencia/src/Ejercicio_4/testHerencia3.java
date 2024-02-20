package Ejercicio_4;

public class testHerencia3 {

    public static void main (String[] args) {

        Productos p = new Productos("20/12/2024", 5);

        ProductosFrescos pf = new ProductosFrescos("20/12/2024", 5, "20/12/2025", "España");

        ProductosRefrigerados pr = new ProductosRefrigerados("20/12/2024", 5, "256", "20/12/2025", 20.2f, "España");
        ProductosRefrigerados pr2 = new ProductosRefrigerados("20/12/2024", 5, "220", "20/12/2025", 20.2f, "Alemania");
        ProductosRefrigerados pr3 = new ProductosRefrigerados("20/12/2024", 5, "286", "20/12/2025", 20.2f, "Croacia");

        productosCongelados pc = new productosCongelados("20/12/2024", 5, "20/12/2025", "España", 10);

        congeladoPorAgua ca = new congeladoPorAgua("10/12/2024", 5, "20/10/2024", "Alemania", 20, 12);

        congeladoPorAire cai = new congeladoPorAire("20/12/2024", 5, "20/06/2024", "Francia", 20, 15, 2, 30, 0);

        congeladoPorNitrogeno cn = new congeladoPorNitrogeno("20/12/2024", 5, "20/06/2024", "Francia", 20, "Congelador", 10);

        System.out.println("Productos");
        p.mostrarInformacion();
        System.out.println("***********************************");
        System.out.println("Productos Frescos");
        pf.mostrarInformacion();
        System.out.println("***********************************");
        System.out.println("Productos Refrigerados");
        pr.mostrarInformacion();
        System.out.println("***********************************");
        pr2.mostrarInformacion();
        System.out.println("***********************************");
        pr3.mostrarInformacion();
        System.out.println("***********************************");
        System.out.println("Productos Congelados");
        pc.setnLote(9);
        pc.mostrarInformacion();
        System.out.println("***********************************");
        System.out.println("Congelados por Agua");
        ca.mostrarInformacion();
        System.out.println("***********************************");
        System.out.println("Congelados por Aire");
        cai.mostrarInformacion();
        System.out.println("***********************************");
        System.out.println("Congelados por Nitrogeno");
        cn.mostrarInformacion();


    }

}
