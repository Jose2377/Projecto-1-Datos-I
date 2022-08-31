package application;

public class Estudiante {
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
	private float prom1;
	private float prom2;
	private float promf;
	
	public Estudiante(String carne,String nombre, String correo, String telefono, String nickname, String tipo, String exam, String quic, String tarea, String pro1, String pro2, String pro3) {
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
    public String getCarne() {
        return carne;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public int getTelefono() {
        return telefono;
    }
    public String getNickname() {
        return nickname;
    }
    public String getTipo() {
        return tipo;
    }
    public float getExam() {
        return exam;
    }
    public float getQuic() {
        return quic;
    }
    public float getTarea() {
        return tarea;
    }
    public float getPro1() {
        return pro1;
    }
    public float getPro2() {
        return pro2;
    }
    public float getPro3() {
        return pro3;
    }
    public float getProm1() {
        return prom1;
    }
    public float getProm2() {
        return prom2;
    }
    public float getPromf() {
        return promf;
    }
}
