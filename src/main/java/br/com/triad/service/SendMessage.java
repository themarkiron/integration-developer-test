package br.com.triad.service;


import br.com.triad.dto.MessagesDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "sendMessage",url = "http://localhost:9090/messages" )
public interface SendMessage {


    @PostMapping
    void sendMessage(MessagesDTO messageDTO);


}
