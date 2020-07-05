package com.example.demo;


import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        DocsConfig config = new DocsConfig();
        config.setProjectPath("D://demo"); // root project path
        config.setProjectName("ProjectName"); // project name
        config.setApiVersion("V1.0");       // api version
        config.setDocsPath("D://api"); // api docs target path
        config.setAutoGenerate(Boolean.TRUE);  // auto generate
        Docs.buildHtmlDocs(config); // execute to generate
    }

}
