
public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario ariel = new Contador();
		ariel.setSalario(2000);
		
		Gerente ana = new Gerente();
		ana.setSalario(10000);
		
		Contador karla = new Contador();
		karla.setSalario(5000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		
		controlBonificacion.registrarSalario(ariel);
		controlBonificacion.registrarSalario(ana);
		controlBonificacion.registrarSalario(karla);
	}

}
