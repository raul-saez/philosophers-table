package philosophersTable;

public class Tenedor {
	private int id;
	private boolean libre = true;
	
	public Tenedor(int id) {
		this.id=id;
	}
	
	public synchronized void cogeTenedor(int i) throws InterruptedException{
		while(!libre)
			wait();
		System.out.println("Filosofo " + i + " coge tenedor " + id);
		libre = false;
	}
	
	public synchronized void sueltaTenedor(int i) {
		libre=true;
		System.out.println("Filosofo " + i + " suelta el tenedor " + id);
		notify();
	}

}
