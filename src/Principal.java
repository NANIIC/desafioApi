public class Principal {
    public static void main(String[] args) {
    ConsultaPelicula consulta = new ConsultaPelicula();
    Pelicula pelicula =  consulta.buscaPelicula();
        System.out.println(pelicula);
    }

}
