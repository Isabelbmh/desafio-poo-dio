public class Main {
    public static void main(String[] args) {
        // Creando el bootcamp
        Bootcamp bootcampPython = new Bootcamp("Bootcamp Python", "Un bootcamp para desarrolladores Python", 6);

        // Creando cursos
        Curso cursoBasico = new Curso("Python Básico", 20, "Fácil");
        Curso cursoAvanzado = new Curso("Python Avanzado", 40, "Difícil");

        // Añadiendo cursos al bootcamp
        bootcampPython.adicionarCurso(cursoBasico);
        bootcampPython.adicionarCurso(cursoAvanzado);

        // Creando mentorías
        Mentoria mentoriaPython = new Mentoria("Mentoria Python", "João Silva", 2);

        // Añadiendo mentorías al bootcamp
        bootcampPython.adicionarMentoria(mentoriaPython);

        // Creando desarrolladores
        Dev devMaria = new Dev("Maria", "Principiante");

        // Matriculando desarrolladores en el bootcamp
        bootcampPython.matricularDev(devMaria);

        // Dev Maria concluye un curso
        devMaria.concluirCurso(cursoBasico);

        // Mostrando información
        System.out.println(bootcampPython.listarCursos());
        System.out.println(bootcampPython.listarMentorias());
        System.out.println(bootcampPython.listarDevs());
        System.out.println(devMaria.listarCursosConcluidos());
    }
}
