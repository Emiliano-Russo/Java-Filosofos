
public class Simulacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tarea task = new Tarea();		
		Thread f1 = new Thread(task);
		Thread f2 = new Thread(task);
		Thread f3 = new Thread(task);
		Thread f4 = new Thread(task);
		Thread f5 = new Thread(task);
		
		f1.setName("Hilo filosofo 1");
		f2.setName("Hilo filosofo 2");
		f3.setName("Hilo filosofo 3");
		f4.setName("Hilo filosofo 4");
		f5.setName("Hilo filosofo 5");
		
		f1.start();
		f2.start();
		f3.start();
		f4.start();
		f5.start();		
		
	}
}
