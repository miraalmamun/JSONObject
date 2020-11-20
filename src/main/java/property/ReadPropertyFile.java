package property;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws Exception {
		
		
		String propPath = System.getProperty("user.dir") + "\\read.properties";
		File file = new File(propPath);
		//FileInputStream fs = new FileInputStream(file);
		FileReader fs = new FileReader(file);
		Properties pro = new Properties();
		pro.load(fs);
		System.out.println(pro.getProperty("mir"));
		
		//InputStream s = new FileInputStream(file);
		
		

	}

}
