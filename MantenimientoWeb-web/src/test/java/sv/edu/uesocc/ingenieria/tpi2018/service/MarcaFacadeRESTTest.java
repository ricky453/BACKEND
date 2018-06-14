/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi2018.service;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import sv.edu.uesocc.ingenieria.tpi2018.entities.Marca;
import sv.edu.uesocc.ingenieria.tpi2018.extras.Excepciones;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.AbstractFacadeInterface;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.MarcaFacadeLocal;

/**
 *
 * @author ricky
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = "src/test/resources/ProbarMarcaRest.feature", strict = true)
public class MarcaFacadeRESTTest{
   
    
}
