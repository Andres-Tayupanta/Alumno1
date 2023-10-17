import java.util.Scanner;

public class Materias {
    private String nombre;
    private String codigo;
    private int numHoras;
    private Profesores profesor1;
    private Profesores profesor2;

    private Profesores profesor3;


    public Materias (){

    }
    public Materias(String nombre, String codigo, int numHoras, Profesores profesor1, Profesores profesor2, Profesores profesor3) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.numHoras = numHoras;
        this.profesor1 = profesor1;
        this.profesor2 = profesor2;
        this.profesor3 = profesor3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public Profesores getProfesor1() {
        return profesor1;
    }

    public void setProfesor1(Profesores profesor1) {
        this.profesor1 = profesor1;
    }

    public Profesores getProfesor2() {
        return profesor2;
    }

    public void setProfesor2(Profesores profesor2) {
        this.profesor2 = profesor2;
    }

    public Profesores getProfesor3() {
        return profesor3;
    }

    public void setProfesor3(Profesores profesor3) {
        this.profesor3 = profesor3;
    }

    public void ingresarDatosMateria(int i){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la materia : "+i);
        this. nombre = sc.next();
        System.out.println("Ingrese el codigo de la materia : "+i);
        this.codigo = sc.next();
        System.out.println("Ingrese la catidad de horas a tomar de la materia del profesor : "+i);
        this.numHoras = sc.nextInt();

    }

    public void ingresarProfesores (int i){
        if (i==1){
            profesor1 = new Profesores();
            profesor1.ingresarDatosProfesor(i);

        }else if (i==2){
            profesor2 = new Profesores();
            profesor2.ingresarDatosProfesor(i);
        }else if (i==3){
            profesor3 = new Profesores();
            profesor3.ingresarDatosProfesor(i);
        }
    }
    public  void imprimirProfesores(int i){
        if (i==1){
            profesor1.imprimirDatosProfesor();
        }else if(i==2){
            profesor2.imprimirDatosProfesor();
        }else if (i==3){
            profesor3.imprimirDatosProfesor();
        }
    }


    public  void imprimirDatosMateria(){
        System.out.println("MATERIA: "+ nombre);
        System.out.println("CODIGO: "+ codigo);
        System.out.println("HORAS: "+ numHoras);


    }
}
