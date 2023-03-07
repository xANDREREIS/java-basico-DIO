
public class SmartTV {
	private boolean ligada;
	private int canal;
	private int volume = 22;

	public void aumentarCanal() {
		canal++;
	}

	public void diminuirCanal() {
		canal--;
	}

	public void selecionarCanal(int canal) {
		this.canal = canal;
	}

	public void ligarTv() {
		ligada = true;
	}

	public void desligarTv() {
		ligada = false;
	}

	public void aumentarVolume() {
		volume++;
	}

	public void diminuirVolume() {
		volume--;
	}

	public void imprimirTv() {
		if (ligada == true) {
			System.out.println("TV ligada? " + ligada);
			System.out.println("Canal: " + canal);
			System.out.println("Volume: " + volume);
		} else {
			System.out.println("TV ligada? " + ligada);
		}
	}

}
