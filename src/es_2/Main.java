package es_2;

import es_1.Dipendente;

public class Main {
	public static void main(String[] args) {
		// Istanziamento dei dipendenti
		Dipendente operaio1 = new Dipendente(1, Dipendente.Dipartimento.PRODUZIONE);
		Dipendente operaio2 = new Dipendente(2, Dipendente.Dipartimento.PRODUZIONE);
		Dipendente impiegato = new Dipendente(3, Dipendente.Dipartimento.AMMINISTRAZIONE);
		Dipendente dirigente = new Dipendente(4, Dipendente.Dipartimento.VENDITE);

		// Promozione di un operaio a impiegato
		GestioneDipendenti.promuoviDipendenti(operaio1, impiegato);

		// Stampa dello stato di tutti i dipendenti
		Dipendente[] dipendenti = { operaio1, operaio2, impiegato, dirigente };
		GestioneDipendenti.stampaStatoDipendenti(dipendenti);

		// Calcolo dell'importo degli stipendi con 5 ore di straordinario per ciascun
		// dipendente
		int oreStraordinario = 5;
		double stipendioTotale = GestioneDipendenti.calcolaStipendioTotale(dipendenti, oreStraordinario);
		System.out.println("Stipendio totale: " + stipendioTotale);
	}
}
