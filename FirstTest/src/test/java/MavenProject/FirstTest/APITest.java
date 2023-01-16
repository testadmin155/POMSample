package MavenProject.FirstTest;

import org.testng.annotations.Test;

public class APITest {

	@Test(groups={"sanity"})
	public void APIwithPostman()
	{
		System.out.println("APIwithPostman");
	}
	
	@Test
	public void APIwithSoapUI()
	{
		System.out.println("APIwithSoapUI");
	}


}
