package ui;

import java.io.*;
import cl.*;

public class UIProyecto {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;
	static CapaLogica miCliente = new CapaLogica();
	static CapaLogica miEmpleado = new CapaLogica();
	static CapaLogica miProceso = new CapaLogica();

	public static void main(String[] args) throws IOException {

		mostrarMenu();

	}

	static void mostrarMenu() throws IOException {

		int opc = -1;

		do {

			out.println("----MENU PRINCIPAL DE LA TIENDA----");
			out.println();
			out.println("1.  Ingresar Cliente.");
			out.println("2.  Ingresar Usuario.");
			out.println("3.  Ingresar Proceso.");
			out.println("4.  Listar Cliente.");
			out.println("5.  Listar Empleado.");
			out.println("6.  Listar Proceso.");
			out.println("7. Salir.");
			out.println();
			out.println(" Digite la opcion: ");
			out.println();
			opc = Integer.parseInt(in.readLine());
			out.println();
			procesarOpcion(opc);
			out.println();
			out.println(" La opcion ingresada fue " + opc);
			out.println();
		} while (opc != 7);

	}

	public static void procesarOpcion(int popc) throws IOException {

		switch (popc) {

		case 1:

			ingresarCliente();

			break;

		case 2:

			ingresarEmpleado();

			break;

		case 3:

			ingresarProceso();

			break;

		case 4:
			listarCliente();

			break;

		case 5:
			listarEmpleado();

			break;

		case 6:
			listarProcesos();

			break;

		case 7:

			out.println("MUCHAS GRACIAS!!");

			break;

		default:

			out.println("Opcion invalida");
			out.println();
			break;

		}

	}

	public static void ingresarCliente() throws IOException {

		String id;
		String nombre;
		String apellido;
		String telefono;
		String contrasenna;

		out.println("Digite su identificacion");
		id = in.readLine();
		out.println("Digite su nombre");
		nombre = in.readLine();
		out.println("Digite su apellido");
		apellido = in.readLine();
		out.println("Digite su numero de telefono");
		telefono = in.readLine();
		out.println("Digite una contraseña");
		contrasenna = in.readLine();

		miCliente.registrarCliente(id, nombre, apellido, telefono, contrasenna);

	}

	public static void ingresarEmpleado() throws IOException {

		String id;
		String nombre;
		String apellido;
		String areaFuncional;
		String contrasenna;

		out.println("Digite su identificacion");
		id = in.readLine();
		out.println("Digite su nombre");
		nombre = in.readLine();
		out.println("Digite su apellido");
		apellido = in.readLine();
		out.println("Digite su area funcional");
		areaFuncional = in.readLine();
		out.println("Digite una contraseña");
		contrasenna = in.readLine();

		miEmpleado.registrarEmpleado(id, nombre, apellido, areaFuncional, contrasenna);

	}

	public static void ingresarProceso() throws IOException {

		String codigo;
		String nombre;
		String descripcion;
		String estado;

		out.println("Digite el codigo del proceso");
		codigo = in.readLine();
		out.println("Digite el nombre del proceso");
		nombre = in.readLine();
		out.println("Digite la descripcion del proceso");
		descripcion = in.readLine();
		out.println("Digite el estado actual del proceso");
		estado = in.readLine();

		miProceso.registrarProceso(codigo, nombre, descripcion, estado);

	}

	public static void listarCliente() throws IOException {

		for (int i = 0; i < miCliente.getListaClientes().size(); i++) {

			Cliente tempCliente = (Cliente) miCliente.getListaClientes().get(i);
			out.println(tempCliente.toString());
		}

	}

	public static void listarEmpleado() throws IOException {

		for (int i = 0; i < miEmpleado.getListaEmpleados().size(); i++) {

			Empleado tempEmpleado = (Empleado) miEmpleado.getListaEmpleados().get(i);
			out.println(tempEmpleado.toString());
		}

	}

	public static void listarProcesos() throws IOException {

		for (int i = 0; i < miProceso.getListaProcesos().size(); i++) {

			Proceso tempProceso = (Proceso) miProceso.getListaProcesos().get(i);
			out.println(tempProceso.toString());
		}

	}

}
