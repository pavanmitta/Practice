
public class ReadData {

	public static void main(String[] args) throws Exception {

		String sUserName = ReadData_Excel.getCellData(1, 1);
        String sPassword = ReadData_Excel.getCellData(1, 2);
        System.out.println(sUserName);
        System.out.println(sPassword);
 
	}
}
