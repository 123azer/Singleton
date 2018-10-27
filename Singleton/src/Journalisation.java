import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Journalisation {
	// unique instance
	private static Journalisation uniqueInstance;
	// msg log ou l'enregistrement de la class
	private String log;
	// constructeur privé (inaccessible de l'exterieur)
	private Journalisation() {
		log=new String();
	}
    // M statique pseudo-constructeur ( synchronized pour le multithread)
	public static synchronized Journalisation getInstance() {
		if(uniqueInstance==null) {
			uniqueInstance=new Journalisation();
		}
		return uniqueInstance;
	}
	
	public void ajouterLog() {
		Date d= new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH'h'mm");
		this.log+="["+dateFormat.format(d)+"]"+log+"\n";
		
	}
	
	public String afficherLog() {
		return log;
	}
	
}
