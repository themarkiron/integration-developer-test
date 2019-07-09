package br.com.triad.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Wither;


@Data
@Wither
@NoArgsConstructor
@AllArgsConstructor
public class MessagesDTO {

    private String id;
    private String conversationId;
    private String from;
    private String to;
    private String text;


}
