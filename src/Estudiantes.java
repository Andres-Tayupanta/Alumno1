import java.util.Scanner;

public class Estudiantes {
    private String nombre = "";
    private String cedula = "" ;
    private int numMatricula = 0;
    private Materias materia1 ;
    private Materias materia2 ;
    private Materias materia3 ;

    public Estudiantes (){

    }
    public Estudiantes(String nombre, String cedula, int numMatricula, Materias materia1, Materias materia2, Materias materia3) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.numMatricula = numMatricula;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
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

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public Materias getMateria1() {
        return materia1;
    }

    public void setMateria1(Materias materia1) {
        this.materia1 = materia1;
    }

    public Materias getMateria2() {
        return materia2;
    }

    public void setMateria2(Materias materia2) {
        this.materia2 = materia2;
    }

    public Materias getMateria3() {
        return materia3;
    }

    public void setMateria3(Materias materia3) {
        this.materia3 = materia3;
    }

    public void  ingresarDatosEstudiante(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        nombre = sc.next();
        System.out.println("Ingrese la cedula del estudiante: ");
        cedula = sc.next();
        System.out.println("Ingrese el numero de matricula: ");
        numMatricula = sc.nextInt();

    }

    public void imprimirDatos(){
        System.out.println("NOMBRE DEL ESTUDIANTE:"+nombre);
        System.out.println("CEDULA DEL ESTUDIANTE:"+cedula);
        System.out.println("NUMERO DE MATRICULA:"+numMatricula);

    }

  /*  public  void imprimirNomProfesores(){
        String docente1 = materia1.getProfesor1().getNombre();
        System.out.println("El nombre del profesor  de la materia 1 "+materia1.getNombre()+"es:"+docente1);
        String docente2 = materia2.getProfesor2().getNombre();
        System.out.println("El nombre del profesor de la materia 2"+materia2.getNombre()+"es:"+docente2);
        String docente3 = materia3.getProfesor3().getNombre();
        System.out.println("El nombre del profesor de la materia 3"+materia3.getNombre()+"es: "+docente3);

    }*/

    public void ingresarDatosTodasMaterias(int i){

        if (i==1){
            materia1 = new Materias();
            materia1.ingresarDatosMateria(i);
            materia1.ingresarProfesores(1);
        }else if  (i==2){
            materia2 = new Materias();
            materia2.ingresarDatosMateria(i);
            materia2.ingresarProfesores(2);
        }else if (i==3){
            materia3 = new Materias();
            materia3.ingresarDatosMateria(i);
            materia3.ingresarProfesores(3);
        }
    }
    public void imprimirMateriaDatosMaterias(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Los datos de la materia1 son:");
        materia1.imprimirDatosMateria();
        materia1.imprimirProfesores(1);
        System.out.println("Los datos de la materia2 son:");
        materia2.imprimirDatosMateria();
        materia2.imprimirProfesores(2);
        System.out.println("Los datos de la materia3 son:");
        materia3.imprimirDatosMateria();
        materia3.imprimirProfesores(3);
    }
}
