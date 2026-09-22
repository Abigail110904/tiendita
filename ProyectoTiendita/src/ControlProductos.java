
import java.util.ArrayList;
import java.util.List;

public class ControlProductos {
    
    private List<Producto> listaProductos=new ArrayList();
    
    public void inicializar(){
        listaProductos.add(new Producto(1,"Soda",20f));
        listaProductos.add(new Producto(2,"Galletas",15f));
        listaProductos.add(new Producto(3,"Chicle",2.5f));
    }

    void agregar() {
     Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el Codigo del producto: ");
        int codigo = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Ingresa la Descripcion del producto: ");
        String descripcion = teclado.nextLine();

        System.out.print("Precio del producto: ");
        float precio = teclado.nextFloat();

        Producto nuevoProducto = new Producto(codigo, descripcion, precio);

        listaProductos.add(nuevoProducto);

        System.out.println("Producto agregado correctamente.");
     }

    void ver() {void ver() {
    System.out.println("--------------------------------------------");
    System.out.printf("%-10s %-20s %-10s%n", "CODIGO", "DESCRIPCION", "PRECIO");
    System.out.println("--------------------------------------------");

    for (Producto producto : listaProductos) {
        System.out.printf("%-10d %-20s $%-10.2f%n",
                producto.getCodigo(),
                producto.getDescripcion(),
                producto.getPrecio());
    }

    System.out.println("--------------------------------------------");
}


    void buscar() {
        throw new UnsupportedOperationException("En construcción."); 
    }
    
    
}
