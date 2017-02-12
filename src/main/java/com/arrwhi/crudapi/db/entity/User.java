package com.arrwhi.crudapi.db.entity;

import javax.persistence.*;

/**
 * Created by arran on 12/02/17.
 */
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
