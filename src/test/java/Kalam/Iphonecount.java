package Kalam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iphonecount {

	public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();
RemoteWebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com");
driver.manage().window().maximize();
driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 13",Keys.ENTER);
Thread.sleep(10000);

for(int i=1;i<=10;i++)
{
	try
	{
	driver.findElement(By.xpath("//a[text()='"+i+"']")).click();
	System.out.println("page update"+i);
	}
	catch(Exception ex)
	{
		
	}

//TABLE 
WebElement table=driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']"));

Thread.sleep(10000);
int num=table.findElements(By.xpath("descendant::div[@class='_13oc-S']")).size();



System.out.println(num+" no of mobiles");
Thread.sleep(5000);

List<WebElement> all=driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//div[@class='_13oc-S']"));
for(WebElement one:all)
{
	String name=one.findElement(By.xpath("descendant::div[@class='_4rR01T']")).getText();
	String price=one.findElement(By.xpath("descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
	System.out.println(name+"-----------"+price);
	
}
}






















































/*List<WebElement> mobiles=table.findElements(By.xpath("descendant::div[@class='_4rR01T']"));

for(WebElement mobile:mobiles) 
{
	System.out.println(mobile.getText());
	
	
}
List<WebElement> prices=table.findElements(By.xpath("descendant::div[@class='_30jeq3 _1_WHN1']"));

for(WebElement price:prices) 
{
	System.out.println(price.getText());
	
	
}
*/


List<WebElement> all=driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//div[@class='_13oc-S']"));
for(WebElement one:all)
{
	String name=one.findElement(By.xpath("descendant::div[@class='_4rR01T']")).getText();
	String price=one.findElement(By.xpath("descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
	System.out.println(name+"-----------"+price);
	
	
	
}







	}

}
