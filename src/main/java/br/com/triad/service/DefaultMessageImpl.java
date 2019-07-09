package br.com.triad.service;

import br.com.triad.dto.MessagesDTO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DefaultMessageImpl {

    @Autowired
    private SendMessage sendMessage;



    @HystrixCommand(fallbackMethod = "sentDefaultMessage")
    public void sentMessageApi(String param1,String param2,String param3)
    {
        MessagesDTO messagesDTO = new MessagesDTO();
        messagesDTO.setText(param1);
        messagesDTO.setTo(param2);
        messagesDTO.setFrom(param3);
        sendMessage.sendMessage(messagesDTO);

    }


    public void  sentDefaultMessage(String param1,String param2,String param3)
    {

        log.info("Api is out, your message  ", param1 , " will sent after");

    }

}
