package unittest;

//import org.testng.annotations.Test;

import factory.DataProviderFactory;

public class UnitTest {
	public static void main(String[] args) {
		System.out.println(DataProviderFactory.getConfig().getConfigProperty("coderName"));
		

	}
	
	/*@Test
	public void testing() {
		System.out.println(DataProviderFactory.getConfig().getConfigProperty("coderName"));
		}*/

}
