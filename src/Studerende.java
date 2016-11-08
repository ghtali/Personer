
public class Studerende extends Person {
	private String studienummer;
	
	public Studerende(String navn, String studienummer){
		super(navn);
		this.studienummer = studienummer;
	}
	public String toString(){
		return super.toString() + "\n\t[studienummer="+studienummer+"]";
	}
	public String getStudienummer() {
		return studienummer;
	}
	public void setStudienummer(String studienummer) {
		this.studienummer = studienummer;
	}
	
	
	

}
