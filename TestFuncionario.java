
public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario ariel = new Contador();
		ariel.setNombre("Ariel");
		ariel.setDocumento("12345678");
		ariel.setSalario(2000);
		ariel.setTipo(0);
		
		System.out.println(ariel.getNombre());
		System.out.println(ariel.getSalario());
		System.out.println(ariel.getBonificacion());
	
	}

}
