package thread;

public class ThreadExample {
	
	public static void main(String[] args) {
		GeradorPdf geradorPdf = new GeradorPdf();
		BarraDeCarregamento barraDeCarregamento = new BarraDeCarregamento(geradorPdf);
		
		geradorPdf.start();
		barraDeCarregamento.start();
		
		
	}

}

class GeradorPdf extends Thread{
	
	@Override
	public void run(){
		
		
		try {
			System.out.println("Iniciando geração de PDF");
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Gerado PDF");
	}
}


class BarraDeCarregamento extends Thread{
	
	private Thread geradorPdf;
	
	public BarraDeCarregamento(Thread iniciarGeradorPdf){
		this.geradorPdf = iniciarGeradorPdf;
	}
	
	@Override
	public void run(){
		
		while(true){	
			try {
				Thread.sleep(500);
								
				if(!geradorPdf.isAlive()){
					break;
				}
				System.out.println("Carregando...");
								
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
		}
	}
}
