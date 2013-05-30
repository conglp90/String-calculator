//
public class Calculator {
	String deLimiter;
	int kq=0;
	String sohang_temp[] ;
	int Add(String numbers){
		//////tien xu ly du lieu:
		try {
			if(numbers.startsWith("//")){
				deLimiter=numbers.substring(2,numbers.indexOf("\n"));
				numbers=numbers.substring(numbers.indexOf("\n")+1);
			}
			numbers= numbers.replaceAll("\n",",");
			numbers= numbers.replaceAll(deLimiter,",");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//////////////////////////
		sohang_temp=numbers.split(",");
		try {
			for(String sohang : sohang_temp)
				kq+=Integer.parseInt(sohang);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return kq;
	}
}
