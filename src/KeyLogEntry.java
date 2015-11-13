import java.util.Date;
public class KeyLogEntry implements java.io.Serializable{

	public String word;
	public Date date;
	
	public KeyLogEntry(String word){
		this.word = word;
		this.date = new Date();//now
	}
	
	public String toString(){
		return "Word:" + word + "\nTime:" + date.toString();
	}
}
