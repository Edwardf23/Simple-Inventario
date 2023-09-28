import java.util.Scanner;
public class SimpleInventario {

    public static void agregararticulo(String s){
        System.out.println("Agregar un articulo: ");

    }
    public static void removerArticulo(int id){
    }
    public static double obtenerPrecioArticulo(int id){
    return 0.00;
    }
    public static void imprimiendoinventario(){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String usuario=scanner.next();
         System.out.println("Bienvenid@ "+ usuario);

         String articuloExistente = obtenerNombreArticulo();
         System.out.println("Articulo existente: " +articuloExistente);


    }
    public static void main(String[] args) {
       imprimiendoinventario();
    }
    public static String obtenerNombreArticulo(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese el nombre del articulo");
        String nombreArticulo= scanner.next();
        System.out.println("Usted ha ingresado el articulo" + nombreArticulo);
        return nombreArticulo;





   }


}



