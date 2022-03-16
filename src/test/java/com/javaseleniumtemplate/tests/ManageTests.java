package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;

import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.ManagePage;
import org.junit.Assert;
import org.junit.Test;

public class ManageTests extends TestBase {
    //Objects
    ManagePage managePage;
    LoginFlows loginFlows;

    //Tests
    @Test
    public void deletarProject(){

        //Objects instances
        managePage = new ManagePage();
        loginFlows = new LoginFlows();

        //Parameteres
        String mensagemSucessoEsperada = "Operation successful.";

        //Test
        loginFlows.efetuarLogin("felipe.batista","123456");
        managePage.clicarEmManageButton();
        managePage.clicarEmManageProjectsButton();
        managePage.clicarEmDeleteProjectButton();
        managePage.clicarEmConfirmDeleteButton();
        
        Assert.assertTrue(managePage.retornaMensagemSucessoDelete().contains(mensagemSucessoEsperada));

    }
    @Test
    public void editarProject(){

        //Objects instances
        managePage = new ManagePage();
        loginFlows = new LoginFlows();

        //Parameteres
        String mensagemSucessoEsperada = "Operation successful.";
        String category = "Categoria editada";

        //Test
        loginFlows.efetuarLogin("felipe.batista","123456");
        managePage.clicarEmManageButton();
        managePage.clicarEmManageProjectsButton();
        managePage.clicarEmEditProjectButton();
        managePage.limparCategoryField();
        managePage.preencherCategoryField(category);
        managePage.clicarEmUpdateButton();

        Assert.assertTrue(managePage.retornaMensagemSucessoDelete().contains(mensagemSucessoEsperada));

    }

}
