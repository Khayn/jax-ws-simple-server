package pl.khayn.dev.jaxws.server.service;

import jakarta.xml.ws.Endpoint;
import lombok.extern.java.Log;

@Log
public class Exporter {

    public static final String WEBSERVICE_ENDPOINT_URL = "http://localhost/ws/:8080";

    public static void main(String[] args) {
        Endpoint.publish(WEBSERVICE_ENDPOINT_URL, new EmployeeServiceImpl());

        log.info("Service up and running at " + WEBSERVICE_ENDPOINT_URL);
    }
}
