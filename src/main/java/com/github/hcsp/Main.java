package com.github.hcsp;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Main {
  public static void main(String[] args) throws IOException {
    CloseableHttpClient httpclient = HttpClients.createDefault();
    HttpGet httpGet = new HttpGet("http://sina.cn");
    try (CloseableHttpResponse response1 = httpclient.execute(httpGet)) {
      System.out.println(response1.getStatusLine());
      HttpEntity entity1 = response1.getEntity();
      System.out.println(EntityUtils.toString(entity1));
    }
  }
}
