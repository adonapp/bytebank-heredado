
public class TestReferencias {
	public static void main(String[] args) {
		
		// Elemento mas generico puede ser adaptado al elemento mas espesifico
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Ariel");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Ana");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		gerente.iniciarSesion("_ddddd");
		
	}
}
