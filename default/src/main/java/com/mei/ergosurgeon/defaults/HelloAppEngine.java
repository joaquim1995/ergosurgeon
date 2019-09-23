package com.mei.ergosurgeon.defaults;

import com.google.appengine.api.utils.SystemProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@RestController
public class HelloAppEngine {

    @GetMapping(path = "/", name = "HelloAppEngine", produces = "text/plain")
    public ResponseEntity doGet() {

        Properties properties = System.getProperties();

        return ResponseEntity.ok("Hello App Engine - Standard using "
                + SystemProperty.version.get() + " Java " + properties.get("java.specification.version"));
    }


}
