package com.infosys.ekart;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
//import com.infy.EcommerceUserManagement.EcommerceUserManagementApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Properties;

@SpringBootApplication()
@ComponentScan({"com.infosys.ekart"})
public class Application {
//    public static Properties PROP;
//
//    public static void main(String[] args) {
//        PROP = readPropertiesFromS3();
//       
//		SpringApplication app = new SpringApplication(Application.class);
//	  
//		app.setAdditionalProfiles("aws");
//		app.run(args);
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	
 
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

//    public static Properties readPropertiesFromS3() {
//
//        String key_name = "application.properties";
//        String bucket_name = "properties-bucket";
//        Properties prop = new Properties();
//
//        final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();
//
//        S3Object object = s3.getObject(new GetObjectRequest(bucket_name, key_name));
//        try {
//
//            BufferedReader reader = new BufferedReader(new InputStreamReader(object.getObjectContent()));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] arrOfStr = line.split("=");
//                prop.put(arrOfStr[0].trim(), arrOfStr[1].trim());
//            }
//
//            object.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return prop;
//
//    }

}
