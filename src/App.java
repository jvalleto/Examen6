public class App {

        public static void main(String[] args) {
            
            Escuela escuela = new Escuela();
    
            
            escuela.agregarEstudiante(new Estudiante("Juan Pérez", 18));
            escuela.agregarEstudiante(new Estudiante("María Gómez", 19));
            escuela.agregarEstudiante(new Estudiante("Carlos López", 17));
    
            
            escuela.mostrarEstudiantes();
        }
    }


