package PlayerMultimediale;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Immagine img1 = new Immagine();
		Audio aud1= new Audio();
		Video vid1 = new Video();
		Immagine img2 = new Immagine();
		Video vid2 = new Video();
		
		
		Scanner scanner = new Scanner(System.in);
		
		//--------------------immagine 1
		
		System.out.println("Inserisci il titolo dell'immagine");
		String titolo1 = scanner.next();
		img1.setTitolo(titolo1);
		
		System.out.println("Inserisci un numero per impostare la luminosità dell'immagine");
		int luminosita1 = scanner.nextInt();
		img1.setLuminosita(luminosita1);
		
		//-----------------------------------audio 1
		
		System.out.println("Inserisci il titolo dell'audio");
		String titolo2 = scanner.next();
		aud1.setTitolo(titolo2);
		
		System.out.println("Inserisci un numero per impostare il volume dell'audio");
		int volume1 = scanner.nextInt();
		aud1.SetVolume(volume1);
		
		System.out.println("Inserisci la durata della traccia audio");
		int durata1 = scanner.nextInt();
		aud1.setDurata(durata1);
		
		//--------------------video 1
		
		System.out.println("Inserisci il titolo del video");
		String titolo3 = scanner.next();
		vid1.setTitolo(titolo3);
		
		System.out.println("Inserisci un numero per impostare il volume del video");
		int volume2 = scanner.nextInt();
		vid1.SetVolume(volume2);
		
		System.out.println("Inserisci un numero per impostare la luminosità del video");
		int luminosita2 = scanner.nextInt();
		vid1.setLuminosita(luminosita2);
		
		System.out.println("Inserisci la durata del video");
		int durata2 = scanner.nextInt();
		vid1.setDurata(durata2);
		
		//--------------------immagine 2
		
		System.out.println("Inserisci il titolo dell'immagine");
		String titolo4 = scanner.next();
		img2.setTitolo(titolo4);
		
		System.out.println("Inserisci un numero per impostare la luminosità dell'immagine");
		int luminosita3 = scanner.nextInt();
		img2.setLuminosita(luminosita3);
		
		//--------------------video 2
		
		System.out.println("Inserisci il titolo del video");
		String titolo5 = scanner.next();
		vid2.setTitolo(titolo5);
		
		System.out.println("Inserisci un numero per impostare il volume del video");
		int volume3 = scanner.nextInt();
		vid2.SetVolume(volume3);
		
		System.out.println("Inserisci un numero per impostare la luminosità del video");
		int luminosita4 = scanner.nextInt();
		vid2.setLuminosita(luminosita4);
		
		System.out.println("Inserisci la durata del video");
		int durata3 = scanner.nextInt();
		vid2.setDurata(durata3);
		
		int start;
		do {
			System.out.println("Digita un numero tra 1 e 5 per avviare il lettore multimediale oppure premi 0 per terminare");
			start = scanner.nextInt();
			switch(start) {
			case 0:
				System.out.println("Lettore multimediale chiuso");
				scanner.close();
				break;
			case 1:
				img1.show();
				break;
			case 2:
				aud1.play();
				break;
			case 3:
				vid1.play();
				break;
			case 4:
				img2.show();
				break;
			case 5:
				vid2.play();
				break;
				
			default: System.out.println("Hai inserito un numero sbagliato");
				break;
			}
		
		}while(start !=0);
		
	}

}
