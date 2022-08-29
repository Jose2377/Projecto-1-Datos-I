package application;

public class Estudiante {
	private String carne;
	private String nombre;
	private String correo;
	/*
	private int Telefono;
	private String Nickname;
	private String T_estudiante;
	private float N_promedio_exam;
	private float N_promedio_quic;
	private float N_promedio_tar;
	private float N_promedio1;
	private float N_promedio2;
	private float N_promedio3;
	*/
	public Estudiante(String carne,String nombre, String correo) {
		this.carne = carne;
		this.nombre = nombre;
		this.correo = correo;

	}
    public String getCarne() {
        return carne;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
}
