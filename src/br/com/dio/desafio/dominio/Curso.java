public class Curso {
    private String nombre;
    private int cargaHoraria;
    private String dificultad;

    public Curso(String nombre, int cargaHoraria, String dificultad) {
        this.nombre = nombre;
        this.cargaHoraria = cargaHoraria;
        this.dificultad = dificultad;
    }

    public String detallesCurso() {
        return "Curso: " + nombre + ", Carga Horaria: " + cargaHoraria + "h, Dificultad: " + dificultad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
}
