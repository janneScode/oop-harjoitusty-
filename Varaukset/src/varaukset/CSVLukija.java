package varaukset;
	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import java.util.ArrayList;
	import java.util.List;

	public class CSVLukija {

		/**
		 * Tiedostonimi, jonka perusteella tiedosto avataan.
		 */
		private String tiedostonimi;

		/**
		 * Erotin, jonka mukaan CSV-tiedoston sis‰ltˆ erotellaan.
		 */
		private String erotin;

		/**
		 * 
		 * @param tiedostonimi osoittaa tiedostonimen, jonka t‰m‰ olio avaa.
		 */
		public CSVLukija(String tiedostonimi) {
			this(tiedostonimi, ",");
		}

		/**
		 * 
		 * @param tiedostonimi osoittaa tiedostonimen, jonka t‰m‰ olio avaa.
		 * @param erotin       m‰‰ritt‰‰, millaisella erottimella CSV-tiedoston arvot on
		 *                     erotettu toisistaan.
		 */
		public CSVLukija(String tiedostonimi, String erotin) {
			this.tiedostonimi = tiedostonimi;
			this.erotin = erotin;

		}

		/**
		 * 
		 * Lukee tiedoston, jonka {@link CSVLukija#tiedostonimi} osoittaa.
		 * 
		 * @return Lista, joka sis‰lt‰‰ tiedoston sis‰lt‰m‰t rivit sellaisenaan
		 * 
		 * @throws IOException jos {@link Files#readAllLines} heitt‰‰ poikkeuksen
		 */
		public List<String> lueRivit() throws IOException {
			Path polku = Paths.get(tiedostonimi);
			List<String> rivit = Files.readAllLines(polku);
			return rivit;
		}

		/**
		 * T‰m‰ metodi
		 * 
		 * @return
		 * @throws IOException {@link CSV#lueRivit()}
		 */
		public List<String[]> erotteleArvot() throws IOException {
			List<String> rivit = lueRivit();
			List<String[]> arvot = new ArrayList<>();
			for (String s : rivit) {
				String[] eroteltu = s.split(erotin);
				arvot.add(eroteltu);

			}
			return arvot;
		}
	}
	

