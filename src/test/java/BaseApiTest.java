import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.specification.ProxySpecification;
import org.junit.Before;

public class BaseApiTest {
    @Before
    @Step("Opening the web site")
    public void setUp() {
        RestAssured.baseURI = "http://qa-scooter.praktikum-services.ru";

//        ProxySpecification proxy = ProxySpecification.auth("zhiyenbetov_51826", "Aza_0524")
//                .withScheme("http")
//                .withHost("proxy-all.hq.bc")
//                .withPort(8080);
//
//        RestAssured.proxy(proxy);
    }
}
