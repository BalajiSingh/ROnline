package com.ryder.online.api.util;

import com.ryder.online.configreader.FileReaderManager;
import io.restassured.path.xml.XmlPath;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
public class SOAPAPI {


    public static void SOAPAPIPostCall(String FilePath, String HostURL) throws Exception  {
        //wsdl file :http://currencyconverter.kowabunga.net/converter.asmx?wsdl
        File soapRequestFile = new File(System.getProperty("user.dir") + FileReaderManager.getInstance().getConfigReader().getEDIFilePath("EDIFilePath"));

        CloseableHttpClient client = HttpClients.createDefault(); //create client
        HttpPost request = new HttpPost("http://st.ryderonline.ryder.com/ryderonline/ro_service"); //Create the request
        request.addHeader("Content-Type", "text/xml"); //adding header
        request.setEntity(new InputStreamEntity(new FileInputStream(soapRequestFile)));
        CloseableHttpResponse response =  client.execute(request);//Execute the command

        int statusCode=response.getStatusLine().getStatusCode();//Get the status code and assert
        System.out.println("Status code: " +statusCode );
        Assert.assertEquals(200, statusCode);

        String responseString = EntityUtils.toString(response.getEntity(),"UTF-8");//Getting the Response body
        System.out.println(responseString);


        XmlPath jsXpath= new XmlPath(responseString);//Converting string into xml path to assert
        String rate=jsXpath.getString("GetConversionRateResult");
        System.out.println("rate returned is: " +  rate);

    }

}
