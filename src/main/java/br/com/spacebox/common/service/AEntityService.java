package br.com.spacebox.common.service;

import br.com.spacebox.common.exceptions.BusinessException;
import br.com.spacebox.common.messages.EMessage;
import br.com.spacebox.common.messages.MessageSourceCustom;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public abstract class AEntityService<TEntity> {
    @Autowired
    protected MessageSourceCustom messageSource;

    protected String getMessage(EMessage eMessage) {
        return messageSource.getMessage(eMessage);
    }

    protected void validate(ValidationType validationType, TEntity entity) {
        List<String> errors = new ArrayList<>();
        onValidate(validationType, entity, errors);

        if (errors != null && !errors.isEmpty()) {
            throw new BusinessException(errors);
        }
    }

    protected abstract void onValidate(ValidationType validationType, TEntity entity, List<String> erros);
}
