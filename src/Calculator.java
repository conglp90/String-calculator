import java.awt.List;
import java.util.ArrayList;

//
public class Calculator {
	
	int Add(String numbers){
		
		
		String delimiters;
		int kq=0;
		String sohang_temp[];
		ArrayList<String> delimiter_list= new ArrayList<String>();
		
		//////tien xu ly du lieu:
		try {
			if(numbers.startsWith("//")){
				delimiters=numbers.substring(2,numbers.indexOf("\n"));
				numbers=numbers.substring(numbers.indexOf("\n")+1);
				
//				for(String delimiter: delimiter_list)
					numbers= numbers.replaceAll(delimiters,",");
			}
			numbers= numbers.replaceAll("\n",",");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//////////////////////////
		sohang_temp=numbers.split(",");
		try {
			for(String sohang : sohang_temp){
				if(Integer.parseInt(sohang)>1000)
					continue;
				if(Integer.parseInt(sohang)<0)
					throw new RuntimeException("negatives not allowed");
				
				kq+=Integer.parseInt(sohang);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
			// TODO: handle exception
		}
		return kq;
	}
}
