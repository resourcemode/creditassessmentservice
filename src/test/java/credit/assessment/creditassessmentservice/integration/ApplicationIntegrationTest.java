package credit.assessment.creditassessmentservice.integration;

import credit.assessment.creditassessmentservice.CreditassessmentserviceApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = CreditassessmentserviceApplication.class)
public class ApplicationIntegrationTest {
    protected final String BASE_URL = "http://localhost";

    @LocalServerPort
    protected int port;

    protected TestRestTemplate restTemplate = new TestRestTemplate();

    protected ResponseEntity<String> response;

    public void get(String url) {
        response = restTemplate.getForEntity(BASE_URL + ":" + port + url, String.class);
    }

    public void post(String url, HttpEntity httpEntity) {
        String _url = BASE_URL + ":" + port + url;
        response = restTemplate.postForEntity(_url, httpEntity, String.class);
    }

    @Test
    public void testNothing() {
        Assert.assertEquals(1, 1);
    }
}

