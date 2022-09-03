package application;

/**
 * Clase padre de los tipos de estudiantes, donde guarda informacion y permite revisarla con los get
 * @author Jose Maria Vindas
 *
 */
/* Clase Estudiante, evidencia de clase, un molde con atributos y metodos
 * de donde se pueden hacer una gran cantidad de diferentes estudiantes
 * y al mismo tiempo abstraccion ya que estamos creando un estudiante
 * pero que solo para guardar informacion y darla, no puede por ejemplo
 * escrbir palabras, como un estudiante puede hacer, pero no lo incluimos ya
 * que no es necesario ni tampoco la gran cantidad de acciones o informacion mas
 */
public class Estudiante {
	/* Atributos de la clase Estudiante, evidencia de atributos
	 * cualidades de los estudiantes como el nombre o carne
	 * y al mismo tiempo encalsulacion, ya que estos atributos
	 * son privados y solo pueden ser vistas por la propia clase
	 * a no ser que diga esos atributos por medio de los get
	 */
	private String carne;
	private String nombre;
	private String correo;
	private int telefono;
	private String nickname;
	private String tipo;
	private float exam;
	private float quic;
	private float tarea;
	private float pro1;
	private float pro2;
	private float pro3;
	protected float prom1;
	protected float prom2;
	private float promf;
	
	/**
	 * Clase constructura de la funcion 
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
	public Estudiante(String carne,String nombre, String correo, String telefono, String nickname, String tipo, String exam, String quic, String tarea, String pro1, String pro2, String pro3) {
		/* Aqui se demuestra una evidencia de la sobrecarga
		 * en la propia clase tenemos varios pares de variables
		 * que tienen el mismo nombre, como carne y carne, pero
		 * aunque tenga el mismo nombre el lenguaje es capaz de 
		 * detectar quien es quien, una muestra de sobrecarga
		 */
		this.carne = carne;
		this.nombre = nombre;
		this.correo = correo;
		try {
			this.telefono = Integer.parseInt(telefono);
		} catch (Exception e)
		{
			this.telefono = -1;
		}
		this.nickname = nickname;
		this.tipo = tipo;
		try {
			this.exam = Float.parseFloat(exam);
		} catch (Exception e)
		{
			this.exam = -1;
		}
		try {
			this.quic = Float.parseFloat(quic);
		} catch (Exception e)
		{
			this.quic = -1;
		}
		try {
			this.tarea = Float.parseFloat(tarea);
		} catch (Exception e)
		{
			this.tarea = -1;
		}
		try {
			this.pro1 = Float.parseFloat(pro1);
		} catch (Exception e)
		{
			this.pro1 = -1;
		}
		try {
			this.pro2 = Float.parseFloat(pro2);
		} catch (Exception e)
		{
			this.pro2 = -1;
		}
		try {
			this.pro3 = Float.parseFloat(pro3);
		} catch (Exception e)
		{
			this.pro3 = -1;
		}
		this.prom1 = (this.pro1+this.pro2+this.pro3)/3;
		this.prom2 = (this.exam+this.quic+this.tarea)/3;
		this.promf = (this.prom1+this.prom2)/2;
	}
	/*Funciones get de la funcion, evidencia de metodos
	 *Acciones que pueden hacer las instancias y en
	 *este caso es del contar informacion privada (atributos) 
	 */
	
	/**
	 * Un metodo get que retorna el carne
	 * @return
	 */
    public String getCarne() {
        return carne;
    }
	/**
	 * Un metodo get que retorna el nombre
	 * @return
	 */
    public String getNombre() {
        return nombre;
    }
	/**
	 * Un metodo get que retorna el correo
	 * @return
	 */
    public String getCorreo() {
        return correo;
    }
	/**
	 * Un metodo get que retorna el telefono
	 * @return
	 */
    public int getTelefono() {
        return telefono;
    }
	/**
	 * Un metodo get que retorna el nickname
	 * @return
	 */
    public String getNickname() {
        return nickname;
    }
	/**
	 * Un metodo get que retorna el tipo de estudiante
	 * @return
	 */
    public String getTipo() {
        return tipo;
    }
	/**
	 * Un metodo get que retorna el promedio de examenes
	 * @return
	 */
    public float getExam() {
        return exam;
    }
	/**
	 * Un metodo get que retorna el promedio de quices
	 * @return
	 */
    public float getQuic() {
        return quic;
    }
	/**
	 * Un metodo get que retorna el promedio de tareas
	 * @return
	 */
    public float getTarea() {
        return tarea;
    }
	/**
	 * Un metodo get que retorna el promedio del primer proyecto
	 * @return
	 */
    public float getPro1() {
        return pro1;
    }
	/**
	 * Un metodo get que retorna el promedio del segundo proyecto
	 * @return
	 */
    public float getPro2() {
        return pro2;
    }
	/**
	 * Un metodo get que retorna el promedio del tercer proyecto
	 * @return
	 */
    public float getPro3() {
        return pro3;
    }
	/**
	 * Un metodo get que retorna el promedio final
	 * @return
	 */
    public float getPromf() {
        return promf;
    }
	/**
	 * Un metodo get que retorna el promedio de proyectos
	 * @return
	 */
    public Object getProm1() {
        return prom1;
    }
	/**
	 * Un metodo get que retorna el promedio de trabajos
	 * @return
	 */
    public Object getProm2() {
        return prom2;
    }
    
}
