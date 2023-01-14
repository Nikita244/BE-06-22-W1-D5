package PlayerMultimediale;

abstract class FileMultimediale {
	
	//tutti condividono il titolo
	
	protected String titolo;
	
	public FileMultimediale() {}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) {
			this.titolo = titolo;
		}
}
