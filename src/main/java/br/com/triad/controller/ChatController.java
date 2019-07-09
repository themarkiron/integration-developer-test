package br.com.triad.controller;

import br.com.triad.service.DefaultMessageImpl;
import br.com.triad.service.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ChatController {


    @Autowired
    private SendMessage sendMessage;

    @Autowired
    private DefaultMessageImpl defaultMessage;
    private static final String BOTS_ID = "36b9f842-ee97-11e8-9443-0242ac120002";
    private static final String ANONYMOUS_ID = "16edd3b3-3f75-40df-af07-2a3813a79ce9";


    @GetMapping
    public String chatView()
    {
        return "chat";
    }

    @PostMapping(value = "/message-bots")
    public String sendMessageBots(@RequestParam(value = "bots",required = false) String bots,
                                  @RequestParam(value = "to", required = false) String to                                )
    {

        defaultMessage.sentMessageApi(bots,to,BOTS_ID);

        return "redirect:/";
    }

    @PostMapping(value = "/message-anonymous")
    public String sendMessageAnonymous(@RequestParam(value = "anonymous",required = false) String anonymous,
                                       @RequestParam(value = "to2", required = false) String to2   )
    {
        defaultMessage.sentMessageApi(anonymous,to2,ANONYMOUS_ID);

        return "redirect:/";
    }
}
