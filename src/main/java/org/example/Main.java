package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriver wd = new ChromeDriver();
        wd.get("https://buscacepinter.correios.com.br/app/endereco/index.php?t");
        wd.findElement(By.id("endereco")).sendKeys("38410130");
        wd.findElement(By.id("btn_pesquisar")).click();
    }
}