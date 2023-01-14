package PlayerMultimediale;

//l'immagine non ha il play e il volume ma ha il titolo e la gestione luminosità

class Immagine extends FileMultimediale implements Luminosità{

	int luminosita;
	
	public Immagine() {};
	
	
	//stampa * per valore luminosità
	public void show() {
		System.out.print("Titolo: " + titolo + "   Luminosità: ");
		for(int l = 0; l < luminosita; l++) {
			System.out.print("*");
		}
		System.out.println();
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
