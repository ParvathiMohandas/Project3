package Page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Naveenpage {
	WebDriver driver;
	By naccount=By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]");
	By nregister=By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a");
	By nfn=By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[2]/div/input");
	By nln=By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[3]/div/input");
	By nemail=By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[4]/div/input");
	By ntelephone=By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[5]/div/input");
	By npass=By.xpath("/html/body/div[2]/div/div/form/fieldset[2]/div[1]/div/input");
	By npass1=By.xpath("/html/body/div[2]/div/div/form/fieldset[2]/div[2]/div/input");
	By ncheck=By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]");
	By ncontinue=By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]");
	By nradio=By.xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[2]");
	By nlogout=By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a");
	By ncon=By.xpath("/html/body/div[2]/div/div/div/div/a");
	public Naveenpage(WebDriver driver) {
		this.driver=driver;
	}
	public void account()
	{
		driver.findElement(naccount).click();
	}
	public void register()
	{
		driver.findElement(nregister).click();
	}
	public void details(String f,String l,String e,String t)
	{
		driver.findElement(nfn).sendKeys(f);
		driver.findElement(nln).sendKeys(l);
		driver.findElement(nemail).sendKeys(e);
		driver.findElement(ntelephone).sendKeys(t);
	}
	public void details1(String pass,String pass1)
	{
		driver.findElement(npass).sendKeys(pass);
		driver.findElement(npass1).sendKeys(pass1);
	}
	public void radio()
	{
		WebElement radio=driver.findElement(nradio);
		if(radio.isSelected())
		{
			System.out.println("checked");
		}
		else
		{
			System.out.println("Not checked");
			radio.click();
		}
	}
	public void check()
	{
		driver.findElement(ncheck).click();
	}
	public void continue1()
	{
		driver.findElement(ncontinue).click();
	}
	public void con1()
	{
		driver.findElement(ncon).click();
	}
	public void logout()
	{
		driver.findElement(naccount).click();
		driver.findElement(nlogout).click();
	}
}
