import java.util.ArrayList;

public class KeyLoggerDB implements java.io.Serializable{
	ArrayList<KeyLogEntry> db;
	public KeyLoggerDB(){
		db = new ArrayList<KeyLogEntry>();
	}
	
	public void reset(){
		db.clear();
	}
	
	public void add(String word){
		db.add(new KeyLogEntry(word));
	}
	
	public String toString(){
		StringBuffer bs = new StringBuffer();
		for(int i=0;i<db.size();i++){
			bs.append( db.get(i).toString() );
			bs.append("\n");
		}
		return bs.toString();
	}
}
