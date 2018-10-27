
public class Programme {

	public static void main(String[] args) {
	Journalisation journalisation= Journalisation.getInstance();
	journalisation.ajouterLog();
	journalisation.ajouterLog();
	journalisation= Journalisation.getInstance();
	journalisation.ajouterLog();
	System.out.println( journalisation.afficherLog() );

	}

}
