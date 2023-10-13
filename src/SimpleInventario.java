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
    public static String obtenerPrecioArticulo(String articulo,double precio){
        double random=(Math.random()* 5000) + 100;
        if (articulo.startsWith("mar")&&precio>=0.00){
            return "Articulo "+articulo +" tiene un valor de RD$  " + random;
        } else if (articulo.startsWith("tab")||precio>=12000.00){
            return "Articulo "+articulo+" tiene un valor de que sobrepasa 12,000.00."+" El monto es de RD$ "+ random;
        }else{
            return "Ninguno de los escenario pudo aplicar";
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
