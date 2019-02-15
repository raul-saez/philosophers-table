package philosophersTable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Silla s = new Silla();
		
		// Array of 5 forks
		Tenedor[] tenedores = new Tenedor[5];
		for (int i = 0; i < tenedores.length; i++) {
			tenedores[i] = new Tenedor(i);
		}
		
		// Array of philosophers
		Filosofo[] filosofos = new Filosofo[5];
		for (int i = 0; i < filosofos.length; i++) {
			filosofos[i] = new Filosofo(i, tenedores[i], tenedores[(i+1)%5], s);
		}
		// Run
		for (int i = 0; i < filosofos.length; i++){
			filosofos[i].start();
		}
		
		
	}

}
