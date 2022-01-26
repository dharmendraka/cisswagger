package com.cis.controller;

import com.cis.mapper.IMapper;
import com.cis.model.Service1Request;
import com.cis.model.Service1Response;
import com.cis.model.Service2Request;
import com.cis.model.Service2Response;
import org.mapstruct.factory.Mappers;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/service1")
public class Service1Controller {
    private IMapper mapper
            = Mappers.getMapper(IMapper.class);

    @PostMapping("/getcpdwidget")
    public Service1Response getCPDWidget(@RequestBody Service1Request service1Request) {
        String uri = "http://localhost:8081/service2/getwidgeturl";
        RestTemplate restTemplate= new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.ALL);
        Service2Request service2Request = mapper.sourceToDestination(service1Request);
        HttpEntity<Service2Request> service2RequestHttpEntity = new HttpEntity<>(service2Request, headers);
        ResponseEntity<Service2Response> service2ResponseResponseEntity = restTemplate.exchange(uri, HttpMethod.POST, service2RequestHttpEntity, Service2Response.class);
        Service2Response service2Response = service2ResponseResponseEntity.getBody();
        Service1Response service1Response = mapper.destinationToSource(service2Response);

        // Local call
        //Service2Controller service2Controller= new Service2Controller();
        //Service2Response service2Response = service2Controller.getWidgetURL(new Service2Request());

        return service1Response;
    }
}
