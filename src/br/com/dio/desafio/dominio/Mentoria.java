public class Mentoria {
    private String nombre;
    private String mentor;
    private int duracion;

    public Mentoria(String nombre, String mentor, int duracion) {
        this.nombre = nombre;
        this.mentor = mentor;
        this.duracion = duracion;
    }

    public String detallesMentoria() {
        return "Mentoria: " + nombre + ", Mentor: " + mentor + ", Duración: " + duracion + "h";
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
}
