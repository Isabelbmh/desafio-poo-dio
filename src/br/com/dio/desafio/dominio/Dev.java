import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nombre;
    private String nivel;
    private List<Curso> cursosConcluidos;

    public Dev(String nombre, String nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.cursosConcluidos = new ArrayList<>();
    }

    public void concluirCurso(Curso curso) {
        this.cursosConcluidos.add(curso);
    }

    public List<String> listarCursosConcluidos() {
        List<String> nombresCursosConcluidos = new ArrayList<>();
        for (Curso curso : cursosConcluidos) {
            nombresCursosConcluidos.add(curso.getNombre());
        }
        return nombresCursosConcluidos;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
}
