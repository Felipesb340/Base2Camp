package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ReportPage extends PageBase {
    //Mapping

    By myViewPageButton = By.linkText("My View");
    By idButton = By.linkText("0008609");
    By editButton = By.xpath("/html/body/table[3]/tbody/tr[17]/td/table/tbody/tr/td[1]/form/input[3]");
    By reportButtonPage = By.linkText("Report Issue");
    By categoryFieldContent = By.xpath("/html/body/div[3]/form/table/tbody/tr[2]/td[2]/select/option[19]");
    By summaryField = By.name("summary");
    By descriptionField = By.name("description");
    By submitButton = By.className("button");
    By successMessageLabel = By.xpath("/html/body/div[2]");
    By errorMessageLabel = By.xpath("/html/body/div[2]/table/tbody/tr[2]/td/p");


    //Actions
    public void clicarEmMyViewPageButton(){click(myViewPageButton);}

    public void clicarEmIdButton(){click(idButton);}

    public void clicarEmEditButton(){click(editButton);}

    public void clicarEmReportPageButton(){click(reportButtonPage);}

    public void clicarEmSubmitReport(){click(submitButton);}

    public void preencherCategoryField(){click(categoryFieldContent);}

    public void preencherSummaryField(String summary){sendKeys(summaryField, summary);}

    public void preencherDescriptionField(String description){sendKeys(descriptionField, description);}

    public void limparDescriptionField(){driver.findElement(descriptionField).clear();}

    public String retornaDescriptionFieldContent(){return getText(descriptionField);}

    public String retornaMensagemSucessoReport(){return getText(successMessageLabel);}

    public String retornaMensagemErroReport(){
        return getText(errorMessageLabel);
    }

}
