package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends CommonAPI {
   Logger LOG= (Logger) LogManager.getLogger(ProductPage.class.getName());
   public ProductPage(WebDriver driver){
      PageFactory.initElements(driver, this);
   }
   @FindBy(id = "nameofuser")
   WebElement WelcomeUser;

   public String getHeaderText() {
      String headerText = getElementText(WelcomeUser);
      LOG.info("header Text " + headerText);
      return headerText;
   }


   }


