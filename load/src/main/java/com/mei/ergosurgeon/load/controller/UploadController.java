package com.mei.ergosurgeon.load.controller;


import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import com.mei.ergosurgeon.load.business.transform.JaxbUnmarshallerService;
import com.mei.ergosurgeon.load.data.entities.Mvnx;
import com.mei.ergosurgeon.load.data.entities.id.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.time.Instant;
import java.util.UUID;

@Controller
public class UploadController {

    @Autowired
    private KafkaLoadService impl;

    @Autowired
    private JaxbUnmarshallerService unmarshal;

    //Todo Assyncronous call that save the file, and process if a forkjoin pool have threads available. if the file dont
    //TODO   throw an exeption on parse we can guarante that we can be loaded. Make a batch with a scheduler to upload
    //TODO failed files.

    @RequestMapping(value = "/doUpload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public String upload(@RequestParam String email, @RequestParam MultipartFile file) {
        try {
            processRequest(file, setClient(email));

        } catch (Exception e) {
            return "redirect:/failure.html";
        }

        return "redirect:/sucess.html";
    }

    private Client setClient(final String email) {
        return ((Client)
                new Client()
                        .setEmail(email)
                        .setUuid(UUID.randomUUID().toString())
        )
                .setTimeStart(Instant.now().toEpochMilli());

    }

    private void processRequest(final MultipartFile file, final Client client) throws Exception {
        Mvnx object = unmarshal.unmarshal(file.getInputStream());

        object.send(impl, client);
        client.send(impl, null);
    }
}
