package pack1;

import java.io.IOException;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		String name =Excel.readStringData(1,0);
		System.out.println("Name :"+ "\t"+name);
		
		String id= Excel.readIntegerData(1, 1);
		System.out.println("id   :"+"\t"+ id);

	}

}
