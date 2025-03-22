import java.util.List;
import java.util.ArrayList;

public class Escuela {
    private List<Estudiante> listaEstudiantes;

    public Escuela() {
        this.listaEstudiantes = new ArrayList<>();
    }
    public void agregarEstudiante(Estudiante estudiante) {
        this.listaEstudiantes.add(estudiante);
    }
    public void mostrarEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("Lista de Estudiantes:");
            for (Estudiante e : listaEstudiantes) {
                System.out.println(e);
            }
        }
    }
}


