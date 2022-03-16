package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class SearchPage extends PageBase {
    //Mapping
    By searchField = By.name("bug_id");
    By searchButton = By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[2]");
    By idDoReport = By.xpath("/html/body/table[3]/tbody/tr[3]/td[1]");
    By errorMessageLabel = By.xpath("/html/body/div[2]/table/tbody/tr[2]/td/p");

    //Actions
    public void preencherSearchField(String conteudo){sendKeys(searchField, conteudo);}

    public void clicarEmSearchButton(){
        click(searchButton);
    }

    public String retornaIdDoReport(){
        return getText(idDoReport);
    }

    public String retornaMensagemErroSearch(){
        return getText(errorMessageLabel);
    }
}
