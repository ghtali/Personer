
public class Ansat extends Person {
		private String institut;
		
		public Ansat(String navn, String institut){
			super(navn);
			this.institut = institut;
		}
		public String toString(){
			return super.toString() +"\tInstitut: \t"+institut;
		}
		public String getInstitut(){
			return institut;
		}
		public void setInstitut(String institut){
			this.institut = institut;
		}
		
		
	
}
