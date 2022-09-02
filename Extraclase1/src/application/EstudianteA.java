package application;

/**
 * Clase hija de la clase Estudiante
 * @author Jose Maria Vindas
 *
 */
// Clase EstudianteA, hija de la clase Estudiante, evidencia de herencia
public class EstudianteA extends Estudiante{
	
	/**
	 * Constructor de la clase EstudianteA, como es hija de la clase Estudiante tiene un super en los atributos
	 * @param carne - Valor del carne del estudiante
	 * @param nombre - Valor del nombre del estudiante
	 * @param correo - Valor del correo del estudiante
	 * @param telefono - Valor del telefono del estudiante
	 * @param nickname - Valor del nickname del estudiante
	 * @param tipo - Valor del tipo del estudiante
	 * @param exam - Valor de la nota de los examenes del estudiante
	 * @param quic - Valor de la nota de los quices del estudiante
	 * @param tarea - Valor de la nota de las tareas del estudiante
	 * @param pro1 - Valor de la nota del primer proyecto del estudiante
	 * @param pro2 - Valor de la nota del segundo proyecto del estudiante
	 * @param pro3 - Valor de la nota del tercer proyecto del estudiante
	 */
	// Constructor de la clase
	public EstudianteA(String carne, String nombre, String correo, String telefono, String nickname, String tipo,
			String exam, String quic, String tarea, String pro1, String pro2, String pro3) {
		super(carne, nombre, correo, telefono, nickname, tipo, exam, quic, tarea, pro1, pro2, pro3);
	}
	/**
	 * Un metodo get que retorna el promedio de proyectos, siendo null por ser tipo A
	 * @return
	 */
	// Metodos get
    public Object getProm1() {
        return null;
    }
	/**
	 * Un metodo get que retorna el promedio de evaluaciones
	 * @return
	 */
    public float getProm2() {
        return prom2;
    }
	
}
