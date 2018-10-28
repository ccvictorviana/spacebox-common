package br.com.spacebox.common.messages;

public enum EMessage {
    FOLDERPARENT_NOT_FOUND("validation.notfound.folderparent"),
    REQUIRED_PARENTFILEFOLDER("validation.invalid.parentfilefolder"),
    FILE_NOT_FOUND("validation.notfound.file"),
    USER_NOT_FOUND("validation.notfound.user"),
    REQUIRED_FIELD_ID("validation.required.field.id"),
    REQUIRED_FIELD_NAME("validation.required.field.name"),
    REQUIRED_FIELD_CONTENT("validation.required.field.content"),
    REQUIRED_FIELD_LOGIN("validation.required.field.username"),
    REQUIRED_FIELD_EMAIL("validation.required.field.email"),
    REQUIRED_FIELD_PASSWORD("validation.required.field.password"),
    ALREADYEXISTS_LOGIN("validation.alreadyexists.username"),
    ALREADYEXISTS_NAME("validation.alreadyexists.name"),
    ALREADYEXISTS_EMAIL("validation.alreadyexists.email"),
    INVALID_LOGIN("validation.invalid.username"),
    ERROR_AUTHSERVICEUNAVAILABLE("message.error.authserviceunavailable"),
    GENERIC_ERROR("message.error.generic");

    private String key;

    EMessage(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}