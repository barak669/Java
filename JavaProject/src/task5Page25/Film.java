package task5Page25;

public class Film {
	
		private String name;
		private String director;
		private int copies;
		
		public Film(String name, String director, int copies) {
			this.name = name;
			this.director = director;
			this.copies = copies;
		}
			
			
		public Film() {

			this.name = "NA";
			this.director = "NA";
			this.copies = 0;
			
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}

		public int getCopies() {
			return copies;
		}

		public void setCopies(int copies) {
			this.copies = copies;
		}
		
		
		
		
	}

