package pages;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Helper;

import java.util.List;

import static utils.driver.Driver.webDriver;

public class CareersPage extends Helper {

    private static Log log = LogFactory.getLog(CareersPage.class);

    public CareersPage() {
        super(webDriver);
    }

    @FindBy(className = "post-title")
    private List<WebElement> buttonDepartmentTitle;

    @FindBy(css = "[data-toggle='modal'] small")
    private WebElement buttonSendCv;

    @FindBy(id = "file")
    private WebElement textboxSelectFile;

    @FindBy(id = "email")
    private WebElement textboxEmail;

    @FindBy(id = "btn_upload")
    private WebElement buttonUpload;

    public void clickCareersDepartment(String departmentName) {
        log.info("Click careers department");
        for (WebElement department : buttonDepartmentTitle) {
            if (department.getText().equalsIgnoreCase(departmentName)) {
                centerElement(department).click();
                break;
            }
        }
    }

    public void clickSendCv() {
        log.info("Click send cv");
        centerElement(buttonSendCv).click();
    }

    public void uploadFile() {
        log.info("Upload file");
        centerElement(textboxSelectFile).sendKeys("/Users/cemalyaver/Downloads/Roofstacks_Otomasyon_Test_Engineer_Case_Study.pdf");
    }

    public void enteringEmailAddress(String email) {
        log.info("Entering email address");
        textboxEmail.sendKeys(email);
    }

    public void clickUploadButton() {
        log.info("Click upload button");
        buttonUpload.click();
    }
}
