package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.CareersPage;

public class CareersPageStep {

    CareersPage careersPage = new CareersPage();

    @Step("Click careers department:<department>")
    public void clickCareersDepartment(String departmentName) {
        careersPage.clickCareersDepartment(departmentName);
    }

    @Step("Click send cv on career page")
    public void clickSendCv() {
        careersPage.clickSendCv();
    }

    @Step("Upload file on career page")
    public void uploadFile() {
        careersPage.uploadFile();
    }

    @Step("Entering email address:<email> on career page")
    public void enteringEmailAddress(String email) {
        careersPage.enteringEmailAddress(email);
    }

    @Step("Click upload button on career page")
    public void clickUploadButton() {
        careersPage.clickUploadButton();
    }

}
