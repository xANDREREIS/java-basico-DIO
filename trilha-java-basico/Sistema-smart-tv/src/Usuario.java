
public class Usuario {
	public static void main(String[] args) {
		SmartTV tv = new SmartTV();	
		tv.imprimirTv();
		System.out.println("--------");
		
		tv.ligarTv();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarCanal();
		tv.imprimirTv();
		System.out.println("--------");
		
		tv.diminuirVolume();
		tv.selecionarCanal(11);
		tv.diminuirVolume();
		tv.imprimirTv();
		System.out.println("--------");
		
		tv.desligarTv();
		tv.imprimirTv();
	}
}
