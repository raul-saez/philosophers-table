package philosophersTable;

public class Silla {
	private int sillasLibres = 4;
	
	public synchronized void cogeSilla(int i) throws InterruptedException{
		while(sillasLibres==0)
			wait();
		System.out.println("Filosofo " + i + " coge una silla");
		sillasLibres--;
	}
	
	public synchronized void liberaSilla(int i) {
		sillasLibres++;
		System.out.println("Filosofo " + i + " libera la silla");
		notify();
	}

}
