package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;

    //Tests
    @Test
    public void efetuarLoginValido(){

        //Objects instances
        loginPage = new LoginPage();

        //Parameteres
        String usuario = "felipe.batista";
        String senha = "123456";
        String infoLoginEsperada = "Logged in as: felipe.batista";

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        Assert.assertTrue(loginPage.retornarInfoLogin().contains(infoLoginEsperada));
    }

    @Test
    public void efetuarLoginEmailInvalido(){

        //Objects instances
        loginPage = new LoginPage();

        //Parameteres
        String usuario = "emailerrado@email.com";
        String senha = "123456";
        String mensagemErroEsperada = "Your account may be disabled or blocked or the username/password you entered is incorrect.";

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        Assert.assertTrue(loginPage.retornaMensagemErroLogin().contains(mensagemErroEsperada));
    }

    @Test
    public void efetuarLoginSenhalInvalida(){

        //Objects instances
        loginPage = new LoginPage();

        //Parameteres
        String usuario = "felipe.batista";
        String senha = "SenhaInvalida";
        String mensagemErroEsperada = "Your account may be disabled or blocked or the username/password you entered is incorrect.";

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        Assert.assertTrue(loginPage.retornaMensagemErroLogin().contains(mensagemErroEsperada));
    }
}
