package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.ReportPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ReportTests extends TestBase {
    //Objects
   ReportPage reportPage;
   LoginFlows loginFlows;

    //Tests
    @Test
    public void efetuarReportInvalido(){

        //Objects instances
        reportPage = new ReportPage();
        loginFlows = new LoginFlows();

        //Parameteres
        String mensagemErroEsperada = "A necessary field \"Summary\" was empty. Please recheck your inputs.";

        //Test
        loginFlows.efetuarLogin("felipe.batista","123456");
        reportPage.clicarEmSubmitReport();

        Assert.assertTrue(reportPage.retornaMensagemErroReport().contains(mensagemErroEsperada));
    }
    @Test
    public void efetuarReportValido(){

        //Objects instances
        reportPage = new ReportPage();
        loginFlows = new LoginFlows();

        //Parameteres
        String summary = "Teste";
        String description = "Descrição do Bug.";
        String mensagemSucessoEsperada = "Operation successful.";


        //Test
        loginFlows.efetuarLogin("felipe.batista","123456");
        reportPage.clicarEmReportPageButton();
        reportPage.preencherCategoryField();
        reportPage.preencherSummaryField(summary);
        reportPage.preencherDescriptionField(description);
        reportPage.clicarEmSubmitReport();

        Assert.assertTrue(reportPage.retornaMensagemSucessoReport().contains(mensagemSucessoEsperada));

    }

    @Test
    public void editarReport(){

        //Objects instances
        reportPage = new ReportPage();
        loginFlows = new LoginFlows();

        //Parameteres
        String description = "Eu consegui editar a descrição deste report !!!!";

        //Test
        loginFlows.efetuarLogin("felipe.batista","123456");
        reportPage.clicarEmMyViewPageButton();
        reportPage.clicarEmIdButton();
        reportPage.clicarEmEditButton();
        reportPage.limparDescriptionField();
        reportPage.preencherDescriptionField(description);
        reportPage.clicarEmSubmitReport();
        reportPage.clicarEmMyViewPageButton();
        reportPage.clicarEmIdButton();
        reportPage.clicarEmEditButton();

        Assert.assertTrue(reportPage.retornaDescriptionFieldContent().contains(description));

    }
}
