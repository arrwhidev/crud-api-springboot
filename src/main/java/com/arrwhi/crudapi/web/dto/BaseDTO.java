package com.arrwhi.crudapi.web.dto;

/**
 * Created by arran on 16/09/2017.
 */
public abstract class BaseDTO {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
