package cl;

public class Empleado {

	private String identificacion;
	private String nombre;
	private String apellido;
	private String areaFuncional;
	private String contrasenna;

	public Empleado() {

	}

	public Empleado(String identificacion, String nombre, String apellido, String areaFuncional, String contrasenna) {

		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.areaFuncional = areaFuncional;
		this.contrasenna = contrasenna;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getAreaFuncional() {
		return areaFuncional;
	}

	public void setAreaFuncional(String areaFuncional) {
		this.areaFuncional = areaFuncional;
	}

	public String getContrasenna() {
		return contrasenna;
	}

	public void setContrasenna(String contrasenna) {
		this.contrasenna = contrasenna;
	}

	@Override
	public String toString() {
		return "Empleado [identificacion=" + identificacion + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", areaFuncional=" + areaFuncional + ", contrasenna=" + contrasenna + "]";
	}

}
