
public class Gerente extends Funcionario implements Autenticable {
	
	// Sobreescritura de metodo
	public double getBonificacion() {
		System.out.println("EJECUTANDO DESDE GERENTE");
		// super: de la clase padre (superior: que se encuentra arriba) llama al metodo getSalario
		return 2000;	
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}
