import java.util.concurrent.Semaphore;


public class Tarea implements Runnable{

	Semaphore asiento = new Semaphore(4);
	Semaphore tenedor = new Semaphore(5);
	
	@Override
	public void run() {
		try {
			String nombre = Thread.currentThread().getName();
			System.out.println(ConsoleColors.BLUE_UNDERLINED+"Esperando para entrar : "+nombre+ConsoleColors.RESET);
			asiento.acquire();
			System.out.println(ConsoleColors.GREEN+"Asiento ocupado por: "+nombre+ConsoleColors.RESET);
			tenedor.acquire();
			tenedor.acquire();			
			System.out.println(ConsoleColors.RED_UNDERLINED+"Agarra dos tenedores: "+nombre+ConsoleColors.RESET);
			System.out.println(ConsoleColors.RED+nombre+" Esta comiendo... "+ConsoleColors.RESET);
			//Thread.sleep(2000);
			tenedor.release();			
			tenedor.release();	
			System.out.println(ConsoleColors.YELLOW_BOLD+nombre+ " deja los 2 tenedores en la mesa "+ConsoleColors.RESET);
			asiento.release();
			System.out.println(ConsoleColors.YELLOW_BOLD+nombre+ " deja el asiento libre "+ConsoleColors.RESET);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
