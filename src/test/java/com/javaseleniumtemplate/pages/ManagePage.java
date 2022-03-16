package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ManagePage extends PageBase {
    //Mapping
    By manageButton = By.linkText("Manage");
    By manageProjectsButton = By.linkText("Manage Projects");
    By editProjectButton = By.xpath("/html/body/a/div/table/tbody/tr[20]/td[3]/form[1]/input[2]");
    By updateButton = By.xpath("/html/body/div[3]/form/table/tbody/tr[4]/td[2]/input");
    By categoryField = By.name("name");
    By deleteProjectButton = By.xpath("/html/body/a/div/table/tbody/tr[20]/td[3]/form[2]/input[2]");
    By confirmDeleteButton = By.xpath("/html/body/div[2]/form/input[5]");
    By mensagemSucessoEsperada = By.xpath("/html/body/div[2]");

    //Actions
    public void clicarEmManageButton(){click(manageButton);}

    public void clicarEmManageProjectsButton(){click(manageProjectsButton);}

    public void clicarEmDeleteProjectButton(){click(deleteProjectButton);}

    public void clicarEmEditProjectButton(){click(editProjectButton);}

    public void clicarEmUpdateButton(){click(updateButton);}

    public void clicarEmConfirmDeleteButton(){click(confirmDeleteButton);}

    public void limparCategoryField(){driver.findElement(categoryField).clear();}

    public void preencherCategoryField(String category){sendKeys(categoryField, category);}

    public String retornaMensagemSucessoDelete(){
        return getText(mensagemSucessoEsperada);
    }
}
