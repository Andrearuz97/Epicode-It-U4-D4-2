package es_1;

public class Main {
	public static void main(String[] args) {
		// Creazione di un'istanza di Dipendente
		Dipendente dipendente = new Dipendente(123, Dipendente.Dipartimento.PRODUZIONE);

		// Stampa dei dati del dipendente
		dipendente.stampaDatiDipendente();

		// Promozione del dipendente
		Dipendente.Livello nuovoLivello = dipendente.promuovi();
		System.out.println("Nuovo livello: " + nuovoLivello);

		// Calcolo della paga mensile
		double pagaMensile = Dipendente.calcolaPaga(dipendente);
		System.out.println("Paga mensile: " + pagaMensile);

		// Calcolo della paga mensile con ore di straordinario
		int oreStraordinario = 10;
		double pagaMensileStraordinario = Dipendente.calcolaPaga(dipendente, oreStraordinario);
		System.out.println("Paga mensile con straordinario: " + pagaMensileStraordinario);
	}
}
