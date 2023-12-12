package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo = "A";
	private double saldo;
	public String getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cuenta(String id) {
		this.id = id;
	}
	public Cuenta(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	public void imprimir(){
		System.out.println("******************\nCUENTA\n******************\nNummero de cuenta: "
				+ id +"\nTipo: " + tipo + "\nSaldo: USD "+ saldo + "\n******************");
	}
	public void imprimirmiEstilo(){
		System.out.println("-------CUENTA del Usuario--------\n------------------\nNummero de cuenta | "
				+ id +"\nTipo | " + tipo + "\nSaldo | USD "+ saldo + "\n------------------");
	}
	
	
	
}
