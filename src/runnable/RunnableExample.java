package runnable;

public class RunnableExample {

	public static void main(String[] args) {
		Thread barra1 = new Thread( new BarraDeCarregamento1());
		Thread barra2 = new Thread(new BarraDeCarregamento2());
		
		barra1.start();
		barra2.start();
		
		System.out.println("print 1");
		System.out.println("print 2");

	}

}



class BarraDeCarregamento1 implements Runnable {
	
	@Override
	public void run(){
		
		
		try {
			Thread.sleep(1000);
			System.out.println("Rodei barra de carregamento 1" );
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}


class BarraDeCarregamento2 implements Runnable {
	
	@Override
	public void run(){
		
		
		try {
			Thread.sleep(1000);
			System.out.println("Rodei barra de carregamento 2" );
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}