package clase_4;

public class Profesor extends Persona{
    private String curso;
    private boolean ayudante;

    public Profesor(String apellido, String nombre, String curso, boolean ayudante) {
        super(apellido, nombre);
        this.curso = curso;
        this.ayudante = ayudante;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isAyudante() {
        return ayudante;
    }

    public void setAyudante(boolean ayudante) {
        this.ayudante = ayudante;
    }
}
