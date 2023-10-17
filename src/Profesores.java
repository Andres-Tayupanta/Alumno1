import java.util.Scanner;

public class Profesores {
    private String nombre;
    private String cedula;
    private String codigo;

    public Profesores (){

    }
    public Profesores (String nombre,String cedula,String codigo){
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void ingresarDatosProfesor(int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del profesor:"+i);
        this.nombre= sc.next();
        System.out.println("Ingrese la cedula del profesor:"+i);
        this.cedula= sc.next();
        System.out.println("Ingrese el codigo del profesor:"+i);
        this.codigo= sc.next();
    }
    public void imprimirDatosProfesor(){
        System.out.println("NOMBRE DEL PROFESOR: "+nombre);
        System.out.println("CEDULA DEL PROFESOR: "+cedula);
        System.out.println("CODIGO DE IDENTIFICACION: "+codigo);

    }

}