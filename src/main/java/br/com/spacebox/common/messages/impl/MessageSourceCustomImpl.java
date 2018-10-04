package br.com.spacebox.common.messages.impl;

import br.com.spacebox.common.messages.EMessage;
import br.com.spacebox.common.messages.MessageSourceCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MessageSourceCustomImpl implements MessageSourceCustom {
    @Autowired
    private MessageSource messageSource;

    private Locale BRAZIL = new Locale("pt", "BR");

    @Override
    public String getMessage(EMessage eMessage) {
        return messageSource.getMessage(eMessage.getKey(), null, BRAZIL);
    }
}