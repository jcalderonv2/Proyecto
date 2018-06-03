package cl;

import java.util.ArrayList;

public class CapaLogica {

	private ArrayList<Cliente> listaClientes;
	private ArrayList<Empleado> listaEmpleados;
	private ArrayList<Proceso> listaProcesos;

	public CapaLogica() {

		this.listaClientes = new ArrayList<Cliente>();
		this.listaEmpleados = new ArrayList<Empleado>();
		this.listaProcesos = new ArrayList<Proceso>();

	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public ArrayList<Proceso> getListaProcesos() {
		return listaProcesos;
	}

	public void setListaProcesos(ArrayList<Proceso> listaProcesos) {
		this.listaProcesos = listaProcesos;
	}

	public void registrarCliente(String identificacion, String nombre, String apellido, String telefono,
			String contrasenna) {
		Cliente tempCliente = new Cliente(identificacion, nombre, apellido, telefono, contrasenna);
		listaClientes.add(tempCliente);

	}

	public void registrarEmpleado(String identificacion, String nombre, String apellido, String areaFuncional,
			String contrasenna) {
		Empleado tempEmpleado = new Empleado(identificacion, nombre, apellido, areaFuncional, contrasenna);
		listaEmpleados.add(tempEmpleado);

	}
	
	public void registrarProceso(String codigo, String nombre, String descripcion, String estado) {
		Proceso tempProceso = new Proceso(codigo, nombre, descripcion, estado);
		listaProcesos.add(tempProceso);

	}

}
