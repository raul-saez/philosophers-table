package philosophersTable;

public class Filosofo extends Thread {
	
	private int id;
	private Silla s;
	private Tenedor izq,dcha;
	public Filosofo(int id, Tenedor izq, Tenedor dcha, Silla s) {
		this.id=id;
		this.izq=izq;
		this.dcha=dcha;
		this.s=s;
	}
	
	// Run
	public void run() {
		while(true) {
			try {
				s.cogeSilla(id);
				izq.cogeTenedor(id);
				dcha.cogeTenedor(id);
				
				dcha.sueltaTenedor(id);
				izq.sueltaTenedor(id);
				s.liberaSilla(id);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} 
	}
}

