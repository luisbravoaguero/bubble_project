package Step;

import Page.BasePage;
import Page.TriangleCalculatorPage;
import net.serenitybdd.annotations.Screenshots;
import net.thucydides.core.steps.ScenarioSteps;

public class TriangleCalculatorStep extends ScenarioSteps {
    BasePage basePage;
    TriangleCalculatorPage triangleCalculatorPage;

    @Screenshots(afterEachStep = true)
    public void UrlPre() {
        basePage.open();
    }

    public void seMuestraLaPaginaWebCargada() throws Exception {
        triangleCalculatorPage.seMuestraLaPaginaWebCargada();
    }

    public void seMuestraElCampoYOURNAME() throws Exception {
        triangleCalculatorPage.seMuestraElCampoYOURNAME();
    }

    public void seMuestraElCampoDeEntrada(String nombreLado) throws Exception {
        triangleCalculatorPage.seMuestraElCampoDeEntrada(nombreLado);
    }

    public void seMuestraElBotonCheck() throws Exception {
        triangleCalculatorPage.seMuestraElBotonCheck();
    }

    public void seIngresaElNombre(String nombre) throws Exception {
        triangleCalculatorPage.seIngresaElNombre(nombre);
    }

    public void seIngresaElLado(String nombreLado, String valorLado) throws Exception {
        triangleCalculatorPage.seIngresaElLado(nombreLado,valorLado);
    }

    public void elUsuarioHaceClickEnElBotonCheck() throws Exception {
        triangleCalculatorPage.elUsuarioHaceClickEnElBotonCheck();
    }

    public void elResultadoEsIgualA(String nombreTriangulo) {
        triangleCalculatorPage.elResultadoEsIgualA(nombreTriangulo);
    }
}
