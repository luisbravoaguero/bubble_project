package Page;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class TriangleCalculatorPage extends PageObject {
    BasePage basePage;

    By h1title = By.xpath("//h1[contains(text(),'Test the Famous Triangle')]");
    By inputNombre = By.xpath("//input[@id='username']");
    By botonCheck = By.xpath("//button[@type='button']");

    public void seMuestraLaPaginaWebCargada() throws Exception {
        basePage.waitForVisibility(h1title,15);
        basePage.waitForSeconds(1);
        System.out.println("SUCCESS: El campo h1Title esta visible, el cual contiene: "+basePage.getText(h1title));
    }

    public void seMuestraElCampoYOURNAME() throws Exception {
        basePage.waitForVisibility(inputNombre,10);
        System.out.println("SUCCESS: Se muestra el campo YOUR NAME");
    }

    public void seMuestraElCampoDeEntrada(String nombreLado) throws Exception {
        By lado = By.xpath("//input[@id='"+nombreLado+"']");
        basePage.waitForVisibility(lado,10);
        System.out.println("SUCCESS: Se muestra el campo LADO :"+nombreLado);
    }

    public void seMuestraElBotonCheck() throws Exception {
        basePage.waitForVisibility(botonCheck,10);
        System.out.println("SUCCESS: Se muestra el boton CHECK");
    }

    public void seIngresaElNombre(String nombre) throws Exception {
        if(basePage.isEnabled(inputNombre)){
            basePage.waitForSeconds(1);
            System.out.println("El boton USERNAME esta habilitado");
            basePage.sendKey(inputNombre, nombre);
            basePage.waitForSeconds(1);
            System.out.println("SUCESS: El campo 'username' esta habilitado para ingresar datos");
        }else{
            System.out.println("FAIL: El campo 'username' NO esta habilitado para ingresar datos");
            Assert.fail("FAIL: El campo 'username' NO esta habilitado para ingresar datos");
        }
    }

    public void seIngresaElLado(String nombreLado, String valorLado) throws Exception {
        By lado = By.xpath("//input[@id='"+nombreLado+"']");
        if(basePage.isEnabled(lado)){
            System.out.println("El campo "+nombreLado+" esta habilitado");
            basePage.sendKey(lado, valorLado);
            basePage.waitForSeconds(1);
            System.out.println("SUCCESS: Se ingreso el valor "+valorLado+" en el campo "+nombreLado);
        }else{
            Assert.fail("FAIL: El campo "+nombreLado+" NO esta habilitado, no se pudo ingresar el valor "+valorLado);
        }
    }

    public void elUsuarioHaceClickEnElBotonCheck() throws Exception {
        basePage.waitForSeconds(1);
        if(basePage.isEnabled(botonCheck)){
            System.out.println("El boton CHECK esta habilitado");
            basePage.click(botonCheck);
            System.out.println("SUCCESS: Se hizo click en el boton CHECK");
        }else {
            System.out.println("FAIL: El boton CHECK no esta habilitado y no se hizo click");
            Assert.fail("FAIL: El boton CHECK no esta habilitado y no se hizo click");
        }
    }

    public void elResultadoEsIgualA(String nombreTriangulo) {
        basePage.waitForSeconds(2);
        String type = basePage.getTriangleTypeUsingOriginalLogic();
        System.out.println("Triangulo nombre: "+type);
        if(type.trim().equalsIgnoreCase(nombreTriangulo.trim())){
            System.out.println("SUCCESS: El nombre del triangulo esperado ("+nombreTriangulo+") es igual al nombre del triangulo obtenido en la pagina web, la cual es "+type);
            Assert.assertTrue("SUCCESS: El nombre del triangulo esperado ("+nombreTriangulo+") es igual al nombre del triangulo obtenido en la pagina web, la cual es "+type,true);
        }else{
            Assert.fail("FAIL: El nombre del triangulo esperado ("+nombreTriangulo+") NO es igual al nombre del triangulo obtenido en la pagina web, la cual es ("+type.toUpperCase()+")");
        }
    }
}
