package com.cis.controller;

import com.cis.model.*;
import org.json.JSONObject;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.spring.web.json.Json;

@Controller
@RequestMapping("/cis")
public class CompositeController {

    @PostMapping("/composite")
    public JSONObject getComposite(@RequestBody CompositeResponse compositeResponse) {
        JSONObject jsonObject=new JSONObject();
        return jsonObject;
    }
}
