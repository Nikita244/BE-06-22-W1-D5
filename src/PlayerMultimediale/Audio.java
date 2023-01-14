package PlayerMultimediale;

 class Audio extends FileMultimediale implements Riproduci{
	
	int volume;
	int durata;
	
	public Audio() {};
	
	
	//metodi per gestire il volume
	public void volumePiu() {
		volume ++;
	}
	
	public void volumeMeno() {
		volume --;
	}
	
	
	//stampa ! per valore volume
	public void play() {
		for (int i = 0; i < durata; i++) {
			System.out.print("Titolo: " + titolo + "   Volume: ");
			for(int v = 0; v < volume; v++) {
				System.out.print("!");
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
	
	
	

}
