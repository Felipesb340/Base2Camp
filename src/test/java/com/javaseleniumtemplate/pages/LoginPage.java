package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {
    //Mapping
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.className("button");
    By errorMessageLabel = By.xpath("/html/body/div[2]/font");
    By loginInfo = By.className("login-info-left");

    //Actions
    public void preenhcerUsuario(String usuario){
        sendKeys(usernameField, usuario);
    }

    public void preencherSenha(String senha){
        sendKeys(passwordField, senha);
    }

    public void clicarEmLogin(){
        click(loginButton);
    }

    public String retornarInfoLogin(){ return getText(loginInfo);}

    public String retornaMensagemErroLogin(){
        return getText(errorMessageLabel);
    }
}
