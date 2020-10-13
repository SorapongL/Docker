package dockerGrid;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

//import org.testng.annotations.Test;

public class Setup_DockerGrid {
	
	//@Test(priority=1)
	@BeforeTest
	void startDockerGride() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
		Thread.sleep(20000);
	}
	
	//@Test(priority=2)
	@AfterTest
	void stopDockerGrid() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
		Thread.sleep(11000);
		
		//Runtime.getRuntime().exec("taskkill /f /im cmd.exe"); //closes command prompt //run pom.xml not use line this
	}

}
