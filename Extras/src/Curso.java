public class Curso {
    private String nombreCurso;
    private string [] estudiantes;

    public Curso() {
        this.nombreCurso = ¨¨ ;
        this.estudiantes = ¨¨;
    }

    public Curso(String nombreCursoP, string[] estudiantesP) {
        this.nombreCurso = nombreCursoP;
        this.estudiantes = estudiantesP;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCursoP) {
        this.nombreCurso = nombreCursoP;
    }

    public string[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(string[] estudiantesP) {
        this.estudiantes = estudiantesP;
    }
}
