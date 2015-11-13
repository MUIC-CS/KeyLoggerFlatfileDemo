import java.util.Scanner;
import java.io.*;
public class KeyLoggerFlatfile {
	
	static String fname =  "test.db";
	
	public static KeyLoggerDB loadDB() throws IOException{
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try{
			fis = new FileInputStream(fname);
			ois = new ObjectInputStream(fis);
			return (KeyLoggerDB)ois.readObject();
		}
		catch(FileNotFoundException fne){
			return new KeyLoggerDB(); //no file so create one.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		finally{
			if(ois!=null) ois.close();
		}
		return null;
	}
	
	public static void saveDB(KeyLoggerDB db) throws IOException{
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		try{
			fs = new FileOutputStream(fname);
			os = new ObjectOutputStream(fs);
			os.writeObject(db);
		}
		finally{
			os.close();
		}
	}
	
	public static void main(String args[]){
		System.out.println("Commands are 'quit', 'reset', 'list'. Other things will be added to db.");
		try{
			Scanner scanner = new Scanner(System.in);
			KeyLoggerDB db = loadDB();
			go(scanner, db);
			saveDB(db);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
		}
	}
		
	public static void go(Scanner scanner, KeyLoggerDB db) throws IOException{
		String s = null;
		while(true){
			s = scanner.nextLine();
			if(s.equals("quit")){
				System.out.println("Quit. bye~");
				break;
			}
			else if(s.equals("reset")){
				System.out.println("DB Reset.");
				db.reset();
			}
			else if(s.equals("list")){
				System.out.println(db);
			}
			else{
				System.out.println("Add: "+s);
				db.add(s);
			}
		}
	}
}
