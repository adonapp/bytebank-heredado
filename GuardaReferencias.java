import com.bytebank.modelo.Cuenta;

public class GuardaReferencias {
	
		//Crear objeto para guardar muchas cuentas
		//Permitirnos agregar cuentas con un metodo
		//GuardaCuentas.adicional(cuenta);
		//obtener, remover, etc.
		
		Object[] referencia = new Object[10];
		int indice = 0;
		
		
		//       [  |  |  |  |  |  |... |  ]
		public void adicionar(Object cc) {
			referencia[indice] = cc;
			indice++;	
		}
		
		public Object obtener(int indice) {
			return referencia[indice];
		}

}
