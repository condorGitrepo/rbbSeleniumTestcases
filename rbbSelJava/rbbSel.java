

// Import Package openqa.selenium with Interface firefox and Interface webdriver
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.WebDriver;  

public class rbbSel {  

	/* Global static variable within this class */
	public static WebDriver driver;  

	public static void main( String[] args ) {  

		System.out.println("starting selenium web driver");  

		System.setProperty("webdriver.firefox.marionette","./geckodriver/geckodriver");
		//System.setProperty("webdriver.chrome.driver","./chromedriver/chromedriver");

		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();

		// Define some website specific variables
		//String baseUrl = "http://demo.guru99.com/selenium/newtours/";
		String baseUrl = "http://rbb24.de";
	
		// Using the Interface webdriver with the Methode get, launches the explorer
		driver.get(baseUrl);

		
		// -----------------------------------

		// Testfall	1 
		
		// API: Package Selenium -> Interface webdriver -> Methode getTitle
		String actualTitle = actualTitle=driver.getTitle();
		//String expectedTitle = "Welcome: Mercury Tours for mge";
		String expectedTitle = "rbb|24 – Nachrichten aus Berlin und Brandenburg | rbb Rundfunk Berlin-Brandenburg";

		System.out.println("actualTitle: "+ actualTitle);
		// Vergleiche Titel mit zu erwartenden Titel	
		if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }	

		// -----------------------------------


		// Wait before exit	
		try{  
			Thread.sleep(1000);  
		}catch(Exception e){}  
		// Close firefox
		driver.close();  
		// Quit driver 
		driver.quit();  
	}  
}

