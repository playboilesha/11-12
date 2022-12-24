package test;

import model.User;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AlByHomePage;
import service.UserCreator;

public class AvTest extends CommonConditions {

    private static final String URL = "https://aliexpress.ru/";

    /*
     * @Test
     * 
     * public void AddCommentToAd() throws InterruptedException {
     * String Comment = "This!";
     * User testUser = UserCreator.withCredentialsFromProperty();
     * String expectedSearchResultsNumber = new AlByHomePage(driver)
     * .openPage(URL)
     * // .ClickToCloseButton()
     * .OpenAdsPage()
     * .ClickCook()
     * .ClickForFistAds()
     * .ClickToComment(Comment)
     * .LoginComment(testUser)
     * .ClickToButtonForLogin()
     * .GetTextInListComment();
     * 
     * Assert.assertFalse(expectedSearchResultsNumber == Comment, "Successful");
     * }
     * }
     */

    /*
     * @Test
     * 
     * public void SearchTermNumberInThePage() throws InterruptedException {
     * 
     * String expectedSearchResultsNumber = new AlByHomePage(driver)
     * .openPage(URL)
     * // .ClickToCloseButton()
     * .OpenAdsPage()
     * .ClickCook()
     * .ClickForFistAds()
     * .ClickToShowNumberButton()
     * .GetTextInListNumber();
     * 
     * Assert.assertFalse(expectedSearchResultsNumber.isEmpty(), "Successful");
     * }
     * }
     */

    /*
     * @Test
     * 
     * public void SearchAutoAudi() {
     * 
     * Boolean expectedSearchResultsNumber = new AlByHomePage(driver)
     * .openPage(URL)
     * // .ClickToCloseButton()
     * .ClickCooks()
     * .SelectOptionsAudi()
     * .SheckMark();
     * 
     * Assert.assertTrue(expectedSearchResultsNumber, "Successful");
     * }
     */
    /*
     * @Test
     * 
     * public void SearchAutoAudiAndBMWAndMercedes() {
     * 
     * Boolean expectedSearchResultsNumber = new AlByHomePage(driver)
     * .openPage(URL)
     * // .ClickToCloseButton()
     * .ClickCooks()
     * .SelectThreeOptions()
     * .SheckThreeMark();
     * 
     * Assert.assertTrue(expectedSearchResultsNumber, "Successful");
     * }
     * }
     */

    /*
     * @Test
     * 
     * public void SearchCofe() {
     * 
     * Boolean expectedSearchResultsNumber = new AlByHomePage(driver)
     * .openPage(URL)
     * // .ClickToCloseButton()
     * .ClickProduct()
     * 
     * .ClickCafe()
     * 
     * .TrueCafe();
     * 
     * Assert.assertTrue(expectedSearchResultsNumber, "Successful");
     * }
     */
    /*
     * @Test
     * 
     * public void SearchCofeKorz() {
     * User testUser = UserCreator.withCredentialsFromProperty();
     * Boolean expectedSearchResultsNumber = new AlByHomePage(driver)
     * .openPage(URL)
     * // .ClickToCloseButton()
     * .ClickProduct()
     * .ClickCafe()
     * .ClickSearchCafe()
     * .ClickKorz()
     * .LoginAl(testUser)
     * .TrueCafeKorz();
     * 
     * Assert.assertTrue(expectedSearchResultsNumber, "Successful");
     * }
     * }
     */

    /*
     * @Test
     * 
     * public void SearchBluze() {
     * String str = "блузка";
     * Boolean expectedSearchResultsNumber = new AlByHomePage(driver)
     * .openPage(URL)
     * // .ClickToCloseButton()
     * .ClickSearchInput()
     * .EnterBluze(str)
     * .ClickButtonSearch()
     * .ClickBluze()
     * .ClickInKorz()
     * .SearchBluzz();
     * 
     * Assert.assertTrue(expectedSearchResultsNumber, "Successful");
     * }
     * }
     */
    /*
     * @Test
     * 
     * public void BookmarkСars() throws InterruptedException {
     * User testUser = UserCreator.withCredentialsFromProperty();
     * Boolean expectedSearchResultsNumber = new AlByHomePage(driver)
     * .openPage(URL)
     * // .ClickToCloseButton()
     * .OpenAdsPage()
     * .ClickCook()
     * .ClickForFistAds()
     * .Login(testUser)
     * .ClickToButtonForLogin()
     * .AddToBookmarks()
     * .SheckBookMarks();
     * 
     * Assert.assertTrue(expectedSearchResultsNumber, "Successful");
     * }
     * 
     */
    /*
     * @Test
     * public void complaintForAds() throws InterruptedException {
     * User testUser = UserCreator.withCredentialsFromProperty();
     * Boolean expectedSearchResultsNumber = new AlByHomePage(driver)
     * .openPage(URL)
     * // .ClickToCloseButton()
     * .OpenAdsPage()
     * .ClickCook()
     * .ClickForFistAds()
     * .Login(testUser)
     * .ClickToButtonForLogin()
     * .Complaint();
     * 
     * Assert.assertTrue(expectedSearchResultsNumber, "Successful");
     * }
     */

    /*
     * @Test
     * public void complaintForAli() throws InterruptedException {
     * User testUser = UserCreator.withCredentialsFromProperty();
     * Boolean expectedSearchResultsNumber = new AlByHomePage(driver)
     * .openPage(URL)
     * // .ClickToCloseButton()
     * .OpenUserPage()
     * 
     * .LoginAl(testUser)
     * 
     * .ComplaintUs();
     * 
     * Assert.assertTrue(expectedSearchResultsNumber, "Successful");
     * }
     * }
     */

    @Test
    public void complaintForZakaz() throws InterruptedException {
        User testUser = UserCreator.withCredentialsFromProperty();
        Boolean expectedSearchResultsNumber = new AlByHomePage(driver)
                .openPage(URL)
                // .ClickToCloseButton()
                .OpenUserPage()

                .LoginAl(testUser)
                .ClickZak()
                .FindZakaz();

        Assert.assertTrue(expectedSearchResultsNumber, "Successful");
    }
}

/*
 * @Test
 * public void SaveSerachParametrs() throws InterruptedException {
 * User testUser = UserCreator.withCredentialsFromProperty();
 * boolean expectedSearchResultsNumber = new AlByHomePage(driver)
 * .openPage(URL)
 * // .ClickToCloseButton()
 * .ClickCooks()
 * .SelectOptionsAudi()
 * .ClickToSaveSerch()
 * .LoginForSerch(testUser)
 * .ClickToButtonForLogin()
 * .SaveSerchParam();
 * 
 * Assert.assertTrue(expectedSearchResultsNumber, "Successful");
 * 
 * }
 * 
 * @Test
 * public void SerchNewAdsAutoSound() {
 * boolean expectedSearchResultsNumber = new AlByHomePage(driver)
 * .openPage(URL)
 * // .ClickToCloseButton()
 * .ClickCooks()
 * .SelectAutoProducts()
 * .ClickToAutoSound();
 * 
 * Assert.assertTrue(expectedSearchResultsNumber, "Successful");
 * }
 * 
 * @Test
 * public void HowMuchPerMonthIsTheLeasingFee() {
 * boolean expectedSearchResultsNumber = new AlByHomePage(driver)
 * .openPage(URL)
 * // .ClickToCloseButton()
 * .ClickCooks()
 * .SelectFinance()
 * .CheckLisingForSum();
 * 
 * Assert.assertTrue(expectedSearchResultsNumber, "Successful");
 * }
 * 
 * @Test
 * public void CheapAdsFromDriveMotors() throws InterruptedException {
 * boolean expectedSearchResultsNumber = new AlByHomePage(driver)
 * .openPage(URL)
 * // .ClickToCloseButton()
 * .ClickCooks()
 * .SelectCompany()
 * .ChooseCompanyDriveMotors()
 * .ChangeSort()
 * .CheckPriceCar();
 * 
 * Assert.assertTrue(expectedSearchResultsNumber, "Successful");
 * }
 * 
 * }
 */
