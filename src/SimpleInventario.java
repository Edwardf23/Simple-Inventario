import java.util.Scanner;

public class SimpleInventario {
    public static void agregarArticulo(String s) {
        System.out.println("Agregar un articulo:  ");
        if(s.length()>4){
            System.out.println("Articulo agregado exitosamente!");
        } else{
            System.out.println("No se permite este Articulo");
        }
    }

    public static void removerArticulo(int id){
        if (id>0){
            System.out.println("Articulo Removido");
        }
    }

    public static double obtenerPrecioArticulo(String articulo){
        double random=(Math.random()* 5000) + 100;
        return random;
    }

    public static void modificarArticulo(){
        String nombrearticulo = obtenerNombredelArticulo();
        double precio = obtenerPrecioArticulo(nombrearticulo);

        if(nombrearticulo.toLowerCase().startsWith("a") || nombrearticulo.toLowerCase().startsWith("d")){
            if(precio >= 150 && precio <= 250){
                precio += precio * 0.02;
                System.out.println("El nombre del articulo es " + nombrearticulo + " y el precio actualizado es " + precio);
            } else if(precio > 250 && precio <= 500){
                precio += precio * 0.08;
                System.out.println("El nombre del articulo es " + nombrearticulo + " y el precio actualizado es " + precio);
            } else {
                precio += precio * 0.12;
                System.out.println("El nombre del articulo es " + nombrearticulo + " y el precio actualizado es " + precio);
            }
        } else if(nombrearticulo.toLowerCase().startsWith("co") || nombrearticulo.toLowerCase().startsWith("m")){
            precio -= precio * 0.20;
            System.out.println("El nombre del articulo es " + nombrearticulo + " y el precio actualizado es " + precio);
        }
    }

    public static void imprimiendoinventario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String usuario = scanner.next();
        System.out.println("Bienvenid@ "+ usuario);

        String articuloExistente = obtenerNombredelArticulo();
        System.out.println("Articulo existente: " +articuloExistente);
    }

    public static void main(String[] args) {
        imprimiendoinventario();
        modificarArticulo();
    }

    public static String obtenerNombredelArticulo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo: ");
        String nombrearticulo;
        nombrearticulo= scanner.next();
        System.out.println("Usted ha ingresado el articulo: "+ nombrearticulo);
        return nombrearticulo;
    }
}


