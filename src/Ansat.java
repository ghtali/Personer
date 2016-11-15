
public class Ansat extends Person {
		private String institut;
		
		public Ansat(String navn, String institut){
			super(navn);
			this.institut = institut;
		}
		public String toString(){
			return "class Ansat\n\t[navn="+navn+"]"+"\n\t[institutnavn="+institut+"]";
		}
		public String getInstitut(){
			return institut;
		}
		public void setInstitut(String institut){
			this.institut = institut;
		}
		
		
	
}
