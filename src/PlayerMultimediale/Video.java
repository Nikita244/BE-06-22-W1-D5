package PlayerMultimediale;

public class Video extends FileMultimediale implements Riproduci,Luminosità{
	
	int volume;
	int durata;
	int luminosita;
	
	public Video() {};
	
	//metodi per gestire il volume
		public void volumePiu() {
			volume ++;
		}
		
		public void volumeMeno() {
			volume --;
		}
		

	//stampa ! per valore volume
	@Override
	public void play() {
		for (int i = 0; i < durata; i++) {
			System.out.print("Titolo: " + titolo + "   Volume: ");
			for(int v = 0; v < volume; v++) {
				System.out.print("!");
			}
			System.out.print("  Luminosità: ");
			for(int l = 0; l < luminosita; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void SetVolume(int volume) {
		if(volume > 0) {
			this.volume = volume;
		}else {
			System.out.println("Il volume è al minimo!");
		}
	}

	@Override
	public int getDurata() {
		return durata;
	}

	@Override
	public void setDurata(int durata) {
		if(durata > 0) {
			this.durata = durata;
		}else {
			System.out.println("La durata è zero, devi aumentarla!");
		}
		
	}
	

	@Override
	public int getLuminosita() {
		return luminosita;
	}
	
	@Override
	public void setLuminosita(int luminosita) {
		if (luminosita > 0 ) {
		this.luminosita = luminosita;
		}else {
			System.out.println("La luminosità è al minimo!");
		}
	}
}
