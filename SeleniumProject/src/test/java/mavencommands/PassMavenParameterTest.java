package mavencommands;

import org.testng.annotations.Test;

public class PassMavenParameterTest {
	
	@Test
	public void creatContact1Test()
	{
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser", "chrome");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
	}	
		
   @Test
   public void deleteContactTest()
   {
	   System.out.println("execcute delete contact test");
   }
		
		
	

}
