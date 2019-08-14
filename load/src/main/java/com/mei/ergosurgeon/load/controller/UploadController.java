package com.mei.ergosurgeon.load.controller;


import com.mei.ergosurgeon.load.business.UnmarshallerJaxb;
import com.mei.ergosurgeon.load.business.api.KafkaLoad;
import com.mei.ergosurgeon.load.data.entities.Mvnx;
import org.apache.tomcat.util.http.fileupload.FileUploadBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

    @Autowired
    KafkaLoad<Mvnx> impl;
    @Autowired
    private UnmarshallerJaxb unmarshal;

    //Todo Assyncronous call that save the file, and process if a forkjoin pool have threads available. if the file dont
    //TODO throw an exeption on parse we can guarante that we can be loadded. Make a batch with a scheduler to upload
    //TODO failed files.

    @RequestMapping(value = "/doUpload", method = RequestMethod.POST, consumes = FileUploadBase.MULTIPART_FORM_DATA)
    public String upload(@RequestParam MultipartFile file) {
        try {
            impl.send(unmarshal.unmarshal(file.getInputStream()));
        } catch (Exception e) {
            return "redirect:/failure.html";
        }

        return "redirect:/sucess.html";
    }
}
