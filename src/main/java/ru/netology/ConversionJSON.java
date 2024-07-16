package ru.netology;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;

import java.io.IOException;
import java.util.List;

public class ConversionJSON {
    public List<Cat> conversionJSON(CloseableHttpResponse response, CloseableHttpClient httpClient, HttpGet request) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        List<Cat> cat =objectMapper.readValue(
                response.getEntity().getContent(),
                new TypeReference<>() {}
        );
        return cat;
    }
}
