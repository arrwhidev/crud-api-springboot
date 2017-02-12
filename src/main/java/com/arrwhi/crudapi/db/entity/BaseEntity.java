package com.arrwhi.crudapi.db.entity;

import javax.persistence.*;

/**
 * Created by arran on 12/02/17.
 */
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private long version;

    public Long getId() {
        return id;
    }

    public long getVersion() {
        return version;
    }
}
