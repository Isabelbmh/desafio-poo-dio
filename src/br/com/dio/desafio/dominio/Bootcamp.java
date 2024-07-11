import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nombre;
    private String descripcion;
    private int duracion;
    private List<Curso> cursos;
    private List<Mentoria> mentorias;
    private List<Dev> devs;

    public Bootcamp(String nombre, String descripcion, int duracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.cursos = new ArrayList<>();
        this.mentorias = new ArrayList<>();
        this.devs = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        this.mentorias.add(mentoria);
    }

    public void matricularDev(Dev dev) {
        this.devs.add(dev);
    }

    public List<String> listarCursos() {
        List<String> nombresCursos = new ArrayList<>();
        for (Curso curso : cursos) {
            nombresCursos.add(curso.getNombre());
        }
        return nombresCursos;
    }

    public List<String> listarMentorias() {
        List<String> nombresMentorias = new ArrayList<>();
        for (Mentoria mentoria : mentorias) {
            nombresMentorias.add(mentoria.getNombre());
        }
        return nombresMentorias;
    }

    public List<String> listarDevs() {
        List<String> nombresDevs = new ArrayList<>();
        for (Dev dev : devs) {
            nombresDevs.add(dev.getNombre());
        }
        return nombresDevs;
    }

    // Getters y Setters
}
