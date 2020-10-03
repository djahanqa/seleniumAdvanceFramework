package homePagetest;

import controller.CataloguePageController;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

    public class CataloguePageTest {
       CataloguePageController cataloguePageController;
        @Test
        public void verifyWomenCataloguePage(WebDriver driver) {
         cataloguePageController= new CataloguePageController(driver) ;

            cataloguePageController.homePageCatalogue(driver,"Women");
        }
        @Test
        public void verifyDressesCataloguePage(WebDriver driver) {
            cataloguePageController= new CataloguePageController(driver);
            cataloguePageController.homePageCatalogue(driver,"Dresses");
        }
    }

