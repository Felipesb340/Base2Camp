package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.SearchPage;
import org.junit.Assert;
import org.junit.Test;

public class SearchTests extends TestBase {
    //Objects
    SearchPage searchPage;
    LoginFlows loginFlows;

    //Tests
    @Test
    public void efetuarSearchInvalido(){

        //Objects instances
        searchPage = new SearchPage();
        loginFlows = new LoginFlows();

        //Parameteres
        String mensagemErroEsperada = "A number was expected for bug_id.";
        String conteudo = "conteudoInvalido";

        //Test
        loginFlows.efetuarLogin("felipe.batista","123456");
        searchPage.preencherSearchField(conteudo);
        searchPage.clicarEmSearchButton();

        Assert.assertTrue(searchPage.retornaMensagemErroSearch().contains(mensagemErroEsperada));
    }

    @Test
    public void efetuarSearchValido(){

        //Objects instances
        searchPage = new SearchPage();
        loginFlows = new LoginFlows();

        //Parameteres
        String conteudo = "0008563";

        //Test
        loginFlows.efetuarLogin("felipe.batista","123456");
        searchPage.preencherSearchField(conteudo);
        searchPage.clicarEmSearchButton();

        Assert.assertTrue(searchPage.retornaIdDoReport().contains(conteudo));
    }
}
