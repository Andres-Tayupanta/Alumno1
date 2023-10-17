public class Main {
    public static void main(String[] args){
        Estudiantes alumno = new Estudiantes();
        alumno.ingresarDatosEstudiante();
        alumno.ingresarDatosTodasMaterias(1);
        alumno.ingresarDatosTodasMaterias(2);
        alumno.ingresarDatosTodasMaterias(3);
        alumno.imprimirDatos();
        alumno.imprimirMateriaDatosMaterias();

    }
}