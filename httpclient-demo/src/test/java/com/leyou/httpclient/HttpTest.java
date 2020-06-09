package com.leyou.httpclient;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class HttpTest {

    CloseableHttpClient httpClient;

    @Before
    public void init(){
        httpClient = HttpClients.createDefault();
    }

    @Test
    public void testGet() throws IOException {
        HttpGet request = new HttpGet("http://www.baidu.com");
        String reponse = this.httpClient.execute(request,new BasicResponseHandler());
        System.out.println(reponse);
    }

    public void testPost(){

    }
}
