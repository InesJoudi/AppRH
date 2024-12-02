package Page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class LoginAppRHPage {

	
@FindBy	(xpath="/html/body/div/div/div/div/div/form/div[1]/input")
WebElement username;

@FindBy (xpath="/html/body/div/div/div/div/div/form/div[2]/input")
WebElement password;

@FindBy (xpath="/html/body/div/div/div/div/div/form/div[4]/button")
WebElement login;

@FindBy (xpath="/html/body/div/nav/div/div/aside/ul/li[1]/a/div")
WebElement verifSuccess;
	
@FindBy (xpath="/html/body/div[2]/div/h2")	
WebElement verifdecline;

@FindBy(xpath="/html/body/div[2]/div/div[6]/button[1]")
WebElement click;

public LoginAppRHPage() {
	
	PageFactory.initElements(Config.driver, this);
	}

public void connect (String name, String pwd) {
	Config.attents(10);
username.sendKeys(name);
password.sendKeys(pwd);
login.click();

}


public void verifTitleS (String sucess ) {
	Config.attents(10);
	String verifTitlesSTex= verifSuccess.getText();
	Assert.assertEquals(verifTitlesSTex, sucess);
}	
public void verifTitlesD (String decline)	{
	Config.attents(10);
	click.click();
	String veriftitlesDTex= verifdecline.getText();
	
	Assert.assertEquals(veriftitlesDTex, decline);	
	
}
}