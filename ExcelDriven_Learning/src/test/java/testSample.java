import java.io.IOException;
import java.util.ArrayList;

public class testSample {

	public static void main(String[] args) throws IOException   {
		DataDrivenExcel dd = new DataDrivenExcel();
		ArrayList<String> data = dd.getData("Add Profile");
	
		for( String val : data){
			System.out.println(val);
		}

	}

}
