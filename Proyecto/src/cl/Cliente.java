package cl;

public class Cliente {

	private String identificacion;
	private String nombre;
	private String apellido;
	private String telefono;
	private String contrasenna;

	public Cliente() {

	}

	public Cliente(String identificacion, String nombre, String apellido, String telefono, String contrasenna) {

		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContrasenna() {
		return contrasenna;
	}

	public void setContrasenna(String contrasenna) {
		this.contrasenna = contrasenna;
	}

	@Override
	public String toString() {
		return "Cliente [identificacion=" + identificacion + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", telefono=" + telefono + ", contrasenna=" + contrasenna + "]";
	}

}
