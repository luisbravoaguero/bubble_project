package Page;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TriangleCalculatorPage extends PageObject {
    BasePage basePage;
    static Double valorLimitePermitido = 100.0;

    By h1title = By.xpath("//h1[contains(text(),'Test the Famous Triangle')]");
    By inputNombre = By.xpath("//input[@id='username']");
    By botonCheck = By.xpath("//button[@type='button']");
    By ladoSide = By.xpath("//input[contains(@id,'Side')]");

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
            basePage.sendKeyAndNotFail(lado, valorLado);
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

    public void seVerificaQueElLadoSeaUnNumeroPositivo(String nombreLado, String valorLado) throws Exception {
        basePage.waitForSeconds(1);
        By lado = By.xpath("//input[@id='"+nombreLado+"']");
        String valorLadoIngresado = basePage.getInputValueJS(lado);
        System.out.println("Valor del lado ingresado String es: "+valorLadoIngresado);
        if(!valorLadoIngresado.isEmpty()){
            System.out.println("SUCCESS:El campo donde se ingreso el lado "+nombreLado+" no esta vacio, ya que el valor es: "+valorLadoIngresado);
            if(valorLadoIngresado.trim().equalsIgnoreCase(valorLado.trim())){
                System.out.println("SUCCESS: El valor ingresado "+valorLado+" es igual al valor recuperado con GETTEXT(), el cual es: '"+valorLadoIngresado+"'");
                boolean espaciosAlInicio = valorLadoIngresado.startsWith(" ");
                boolean espaciosAlFinal = valorLadoIngresado.endsWith(" ");
                if(espaciosAlInicio || espaciosAlFinal){
                    System.out.println("FAIL: El valor ingresado en el lado "+nombreLado+" tiene espacios en blanco, el valor evaluado es el recuperado con el metodo GEXTTEXT(), el valor es: '"+valorLadoIngresado+"'");
                    Assert.fail("FAIL: El valor ingresado en el lado "+nombreLado+" tiene espacios en blanco, el valor evaluado es el recuperado con el metodo GEXTTEXT(), el valor es: '"+valorLadoIngresado+"'");
                }else {
                    System.out.println("SUCCESS: El valor ingresado en el lado " + nombreLado + " NO tiene espacios en blanco, el valor evaluado es el recuperado con el metodo GEXTTEXT(), el valor es: '" + valorLadoIngresado + "'");
                    String primerCaracterLado = String.valueOf(valorLado.trim().toLowerCase().charAt(0));
                    System.out.println("El primer caracter del lado "+nombreLado+" ingresado es igual a: "+primerCaracterLado.trim());
                    if(!primerCaracterLado.equalsIgnoreCase("0")){
                        System.out.println("SUCCESS: El primer caracter ingresado en el campo "+nombreLado+" NO es igual cero, sino, el valor es: "+primerCaracterLado);
                        if(basePage.isNumeric(valorLadoIngresado)){
                            System.out.println("SUCCESS:El valor ingresado en el campo "+nombreLado+" es un numero, el cual es: "+valorLadoIngresado);
                            double valorLadoIgresadoDouble = Double.parseDouble(valorLadoIngresado);
                            System.out.println("SUCCESS: Valor del lado ingresado en el campo "+nombreLado+" se pudo convertir al tipo de datos Double, el cual es: "+valorLadoIgresadoDouble);
                            if(valorLadoIgresadoDouble > 0){
                                System.out.println("SUCCESS: El valor ingresado en el campo "+nombreLado+"fue un numero positivo, el cual es: "+valorLadoIgresadoDouble);
                            }else{
                                System.out.println("FAIL: El valor ingresado en el campo "+nombreLado+" fue un numero negativo, el valor ingresado fue: "+valorLadoIgresadoDouble);
                                Assert.fail("FAIL: El valor ingresado fue un numero negativo, el valor ingresado fue: "+valorLadoIgresadoDouble);
                            }
                        }else{
                            System.out.println("FAIL:El valor ingresado en el campo "+nombreLado+" NO es un numero, el valor actual es: "+valorLadoIngresado);
                            Assert.fail("FAIL:El valor ingresado en el campo "+nombreLado+" NO es un numero, el valor actual es: "+valorLadoIngresado);

                        }
                    }else{
                        System.out.println("FAIL: El primer caracter ingresado en el campo "+nombreLado+" es igual cero, el valor es: "+primerCaracterLado);
                        Assert.fail("FAIL: El primer caracter ingresado en el campo "+nombreLado+" es igual cero, el valor es: "+primerCaracterLado);
                    }
                }
            }else{
                System.out.println("FAIL: El valor ingresado "+valorLado+" recuperado por el metodo GETTEXT() es diferente al que se ha enviado, el cual es: "+valorLadoIngresado);
                Assert.fail("FAIL: El valor ingresado "+valorLado+" recuperado por el metodo GETTEXT() es diferente al que se enviado, el cual es: "+valorLadoIngresado);
            }
        }else {
            System.out.println("FAIL:El campo "+nombreLado+" donde se ingreso el lado "+nombreLado+" esta vacio");
            Assert.fail("FAIL:El campo "+nombreLado+" donde se ingreso el lado "+nombreLado+" esta vacio");
        }
    }

    public void seVerificaQueElLadoSeaUnNumeroMenorAlPermitido(String nombreLado, String valorLado) throws Exception {
        basePage.waitForSeconds(1);
        By lado = By.xpath("//input[@id='"+nombreLado+"']");
        String valorLadoIngresado = basePage.getInputValueJS(lado);
        System.out.println("Valor del lado ingresado String es: "+valorLadoIngresado);
        double valorLadoIgresadoDouble = Double.parseDouble(valorLadoIngresado);
        System.out.println("Valor del lado ingresado Double es:"+valorLadoIgresadoDouble);
        if(valorLadoIgresadoDouble < valorLimitePermitido || valorLadoIgresadoDouble == valorLimitePermitido){
            System.out.println("SUCCESS: El valor ingresado '"+valorLadoIgresadoDouble+"' esta dentro del valor limite permitido, el cual es: '"+valorLimitePermitido);
            Assert.assertTrue("SUCCESS: El valor ingresado '"+valorLadoIgresadoDouble+"' esta dentro del valor limite permitido, el cual es: '"+valorLimitePermitido,true);
        }else {
            System.out.println("FAIL: El valor ingresado '"+valorLadoIgresadoDouble+"' excede al valor limite permitido, el cual es: '"+valorLimitePermitido);
            Assert.fail("FAIL: El valor ingresado '"+valorLadoIgresadoDouble+"' excede al valor limite permitido, el cual es: '"+valorLimitePermitido);
        }
    }

    public void elBotonCHECKSeMuestraDesactivado() throws Exception {
        basePage.waitForSeconds(1);
        boolean isSideEmpty = false;
        List<WebElement> ladoSideList = basePage.findElements(ladoSide);
        for(WebElement ladoSide: ladoSideList){
            if(ladoSide.getAttribute("value").isEmpty()){
                System.out.println("el lado '"+ladoSide.getAttribute("id")+"' tiene valor vacio, el cual es: '"+ladoSide.getAttribute("value")+"'");
                isSideEmpty = true;
            }else{
                System.out.println("el lado '"+ladoSide.getAttribute("id")+"' no esta vacio, el cual es: '"+ladoSide.getAttribute("value")+"'");
            }
        }

        if(isSideEmpty){
            if(!basePage.isEnabled(botonCheck)){
                System.out.println("SUCCESS: El boton CHECK esta desactivado porque exite un campo vacio");
                Assert.assertTrue("SUCCESS: El boton CHECK esta desactivado porque exite un campo vacio",true);
            }else{
                System.out.println("FAIL: El boton CHECK NO esta desactivado aunque exite un campo vacio, esto es incorrecto");
                Assert.fail("FAIL: El boton CHECK NO esta desactivado aunque exite un campo vacio, esto es incorrecto");
            }
        }

    }

    public void elCampoEsDeTipoNumerico(String nombreLado) throws Exception {
        basePage.waitForSeconds(1);
        By lado = By.xpath("//input[@id='"+nombreLado+"']");

        if(basePage.isNumericInputField(lado)){
            System.out.println("SUCCESS: El tipo del campo '"+nombreLado+"' es numerico, de tipo: '"+basePage.getCustomizedAttribute(lado,"type")+"'");
        }else{
            System.out.println("FAIL: El tipo del campo '"+nombreLado+"' NO es numerico, es su lugar es: '"+basePage.getCustomizedAttribute(lado,"type")+"'");
            Assert.fail("FAIL: El tipo del campo '"+nombreLado+"' NO es numerico, es su lugar es: '"+basePage.getCustomizedAttribute(lado,"type")+"'");
        }
    }
}
