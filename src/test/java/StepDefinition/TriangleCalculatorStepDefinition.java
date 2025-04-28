package StepDefinition;

import Step.TriangleCalculatorStep;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;

public class TriangleCalculatorStepDefinition {
    @Steps
    TriangleCalculatorStep triangleCalculatorStep;

    @Dado("que el usuario se conecta a la pagina web TriangleCalculator")
    public void queElUsuarioSeConectaALaPaginaWebTriangleCalculator() {
        triangleCalculatorStep.UrlPre();
    }

    @Entonces("se muestra la pagina web cargada")
    public void seMuestraLaPaginaWebCargada() throws Exception {
        triangleCalculatorStep.seMuestraLaPaginaWebCargada();
    }

    @Y("se muestra el campo YOURNAME")
    public void seMuestraElCampoYOURNAME() throws Exception {
        triangleCalculatorStep.seMuestraElCampoYOURNAME();
    }

    @Y("se muestra el campo de entrada {string}")
    public void seMuestraElCampoDeEntrada(String nombreLado) throws Exception {
        triangleCalculatorStep.seMuestraElCampoDeEntrada(nombreLado);
    }

    @Y("se muestra el boton Check")
    public void seMuestraElBotonCheck() throws Exception {
        triangleCalculatorStep.seMuestraElBotonCheck();
    }

    @Entonces("se ingresa el nombre {string}")
    public void seIngresaElNombre(String nombre) throws Exception {
        triangleCalculatorStep.seIngresaElNombre(nombre);
    }

    @Y("se ingresa el lado {string} {string}")
    public void seIngresaElLado(String nombreLado, String valorLado) throws Exception {
        triangleCalculatorStep.seIngresaElLado(nombreLado,valorLado);
    }

    @Y("el usuario hace click en el boton Check")
    public void elUsuarioHaceClickEnElBotonCheck() throws Exception {
        triangleCalculatorStep.elUsuarioHaceClickEnElBotonCheck();
    }

    @Entonces("el resultado es igual a {string}")
    public void elResultadoEsIgualA(String nombreTriangulo) {
        triangleCalculatorStep.elResultadoEsIgualA(nombreTriangulo);
    }

    @Entonces("se verifica que el lado {string} sea un numero positivo {string}")
    public void seVerificaQueElLadoSeaUnNumeroPositivo(String nombreLado, String valorLado) throws Exception {
        triangleCalculatorStep.seVerificaQueElLadoSeaUnNumeroPositivo(nombreLado,valorLado);
    }

    @Y("se verifica que el lado {string} sea un numero menor al permitido {string}")
    public void seVerificaQueElLadoSeaUnNumeroMenorAlPermitido(String nombreLado, String valorLado) throws Exception {
        triangleCalculatorStep.seVerificaQueElLadoSeaUnNumeroMenorAlPermitido(nombreLado,valorLado);
    }

    @Entonces("el boton CHECK se muestra desactivado")
    public void elBotonCHECKSeMuestraDesactivado() throws Exception {
        triangleCalculatorStep.elBotonCHECKSeMuestraDesactivado();
    }

    @Entonces("el campo {string} es de tipo numerico")
    public void elCampoEsDeTipoNumerico(String nombreLado) throws Exception {
        triangleCalculatorStep.elCampoEsDeTipoNumerico(nombreLado);
    }
}
