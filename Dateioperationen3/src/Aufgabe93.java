import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aufgabe93 {

	public static void main(String[] args) throws IOException {
	
		
		BufferedReader einlesen=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bitt Pfad eingeven !");
		
		String pfad=einlesen.readLine();
		
		System.out.println("Anzeige der Verzeichnisse von :"+ pfad);
		 
File f=new File(pfad);

 File [] verzichnesse=f.listFiles();
 
 
 for(File n:verzichnesse) {
                    if(n.isFile()==true)
                    System.out.println("Datei  "+ n.getName());	
 
                    else System.out.println("Verzichnesse  "+ n.getName());}

	}

}
