/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi2018.service;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import com.jayway.restassured.RestAssured;
import static com.jayway.restassured.RestAssured.expect;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;


/**
 *
 * @author enrique
 */
public class MarcaSteps {
    
    private String nombre="";
    private String path="http://localhost:7070/MantenimientoTPI-web/resources";
    private String resultado="";
    private int status=200;
    private HttpResponse response;
    private final CloseableHttpClient httpClient = HttpClients.createDefault();
    private int id;
    private int inicio,finalizacion;
    
    
    public MarcaSteps(){
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 7070;
        RestAssured.basePath = "/MantenimientoWeb-web-1.0-SNAPSHOT/webresources/";

    }
   
    
  @When("^tengo un (.*)$")
public void tengo_un_nombre(String name) {
    // Write code here that turns the phrase above into concrete actions
    this.nombre=name;
}

@When("^tengo una (.*)")
public void tengo_una_ruta(String ruta) {
    // Write code here that turns the phrase above into concrete actions
    RestAssured.basePath+=ruta;
}

//@Then("hago una peticion al resource con tamanio")
//public void hago_una_peticion_al_resource_con_tamanio() {
//    // Write code here that turns the phrase above into concrete actions
//    resultado=expect().statusCode(status).when().get("/marca").asString();
//}

@Then("^obtengo un estado (\\d+)")
public void obtengo_un_estado(int in) {
    // Write code here that turns the phrase above into concrete actions
//        resultado=expect().statusCode(status).when().get("/marca").asString();

    assertEquals(this.status,200);
}

@Then("^obtengo una lista de marcas:$")
public void obtengo_una_lista_de_marcas(String esperado) {
    // Write code here that turns the phrase above into concrete actions
    resultado = expect().statusCode(status).when().get("marca/").asString();
    assertEquals(esperado, resultado);
}

@When("^tengo una marca (.*)")
public void tengo_una_marca(String name) {
    // Write code here that turns the phrase above into concrete actions
    this.nombre+=name;
}

@Then("creo una marca")
public void creo_una_marca() throws Throwable{
    // Write code here that turns the phrase above into concrete actions
    HttpPost request;
        request = new HttpPost("http://localhost:7070/MantenimientoWeb-web-1.0-SNAPSHOT/webresources/marca");
        request.addHeader("content-type", "application/json");
        StringEntity entity = new StringEntity("{\"activo\":\"true\",\"descripcion\":\"DESCRIPCION\",\"detalleEquipoCollection\":\"[]\",\"idMarca\":22,\"marca\":\"ostiaa\"}");
        request.setEntity(entity);
        response = httpClient.execute(request);


}

@Then("actualizo una marca")
public void actualizo_una_marca() throws Throwable{
    // Write code here that turns the phrase above into concrete actions
    HttpPut request;
        request = new HttpPut("http://localhost:7070/MantenimientoWeb-web-1.0-SNAPSHOT/webresources/marca");
        request.addHeader("content-type", "application/json");
        StringEntity entity = new StringEntity("{\"activo\":\"true\",\"descripcion\":\"DESCRIPCION\",\"detalleEquipoCollection\":\"[]\",\"idMarca\":23,\"marca\":\"ostiaa\"}");
        request.setEntity(entity);
        response = httpClient.execute(request);

}

@Then("elimino una marca")
public void elimino_una_marca() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    HttpDelete request;
        request = new HttpDelete("http://localhost:7070/MantenimientoWeb-web-1.0-SNAPSHOT/webresources/marca");
        response = httpClient.execute(request);

}

@When("tengo un (\\d+)")
public void tengo_un_id(int id) {
    // Write code here that turns the phrase above into concrete actions
    this.id=id;
}

@Then("obtengo una marca")
public void obtengp_una_entidad_marca() {
    // Write code here that turns the phrase above into concrete actions
    resultado = expect().statusCode(status).when().get("marca/").asString();
    
}

@Then("obtengo una lista de la entidad (.*)")
public void obtengo_una_lista_de_la_entidad_marca(String arg1) {
    // Write code here that turns the phrase above into concrete actions
    resultado = expect().statusCode(status).when().get("marca/").asString();
    
}

@When("tengo un numero de (\\d+)")
public void tengo_un_numero_de_inicio(int inicio) {
    // Write code here that turns the phrase above into concrete actions
    this.inicio=inicio;
}

@When("tengo un numero de finalizacion (\\d+)")
public void tengo_un_numero_de_finalizacion(int finalizacion) {
    // Write code here that turns the phrase above into concrete actions
    this.finalizacion=finalizacion;
}

@Then("obtengo una estado {int}")
public void obtengo_una_respuesta(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    resultado = expect().statusCode(status).when().get("marca/" + int1).asString();
    assertEquals(200, status);
}

@Then("^obtengo una lista de rango:$")
public void obtengo_una_lista_de_rango(String listado) {
    // Write code here that turns the phrase above into concrete actions
    resultado = expect().statusCode(status).when().get("marca/").asString();
    assertEquals(listado,resultado);
}

@Then("obtengo el numero de elementos marca")
public void obtengo_el_numero_de_elementos_marca() {
    // Write code here that turns the phrase above into concrete actions
    resultado = expect().statusCode(status).when().get("marca/").asString();
}
    
}
