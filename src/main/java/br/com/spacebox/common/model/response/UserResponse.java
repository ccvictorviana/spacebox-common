package br.com.spacebox.common.model.response;

import io.swagger.annotations.ApiModelProperty;

public class UserResponse {
    @ApiModelProperty(position = 0)
    private Long id;

    @ApiModelProperty(position = 1)
    private String username;

    @ApiModelProperty(position = 1)
    private String name;

    @ApiModelProperty(position = 2)
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
