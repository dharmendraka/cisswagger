package com.cis.controller;


import com.cis.model.Service2Request;
import com.cis.model.Service2Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service2")
public class Service2Controller {

    @PostMapping("/getwidgeturl")
    public Service2Response getWidgetURL(@RequestBody Service2Request service2Request) {
        Service2Response service2Response = new Service2Response();
        return service2Response;
    }
}
