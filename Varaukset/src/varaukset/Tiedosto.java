package varaukset;
	
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileWriter;
 


public class Tiedosto {

	
	
	public void tallennaVaraus(int paikka, int näytös) throws IOException {
		FileWriter fw1 = new FileWriter("varaukset.txt", true);
		
		fw1.write(paikka+"," + näytös +"\n");
	
		
	}
	
	
		
		public ArrayList<Varaus> lueVaraukset(){
			
			CSVLukija c = new CSVLukija("varaukset.txt", ",");
			List<String>[] listana = c.erotteleArvot();
			ArrayList<Varaus> rivit = new ArrayList<>();	
			
			for(int i=1; i<listana.length; i=i+2) {
				for(int j=0; listana.size(); )
				String[] eka = listana[i];
				int näytös = Integer.parseInt();
				
				rivit.add(listana[i+1]));
									
			}
			

			return rivit;				
								
			}


		
}



	
	
