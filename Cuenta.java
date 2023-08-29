// entidad   Cuenta
public abstract class Cuenta {
	
	protected double saldo;
	private int agencia;
	private int numero;
    private Cliente titular = new Cliente();
    private static int total;
    
    public Cuenta(int agencia, int numero) {
    		this.agencia = agencia;
    		this.numero = numero;
    		System.out.println("Se van creando: " + total + " cuentas");
    	
    		Cuenta.total ++;
    	
    }
    
    public abstract void deposita(double valor);
      
    public boolean retirar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfiere(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
            this.retirar(valor);
            destino.deposita(valor);
            return true;
        }
        return false;
    }
    
    public double getSaldo() {
    	return this.saldo;
	}
    
    public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}
/*    
    public void setAgencia(int agencia) {
    	if (agencia > 0) {
    		this.agencia = agencia;
    	}else {
    		System.out.println("No estan permitidos los valores negativos");
    	}
		
	}
*/
	public void getSaldo(int i) {
		
	}
	
	public static int getTotal() {
		return Cuenta.total;
		
	}
    
   }
