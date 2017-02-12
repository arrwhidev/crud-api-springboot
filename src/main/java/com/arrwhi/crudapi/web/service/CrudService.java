package com.arrwhi.crudapi.web.service;

import com.arrwhi.crudapi.db.entity.BaseEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by arran on 12/02/17.
 */
public interface CrudService<T extends BaseEntity> {

    CrudRepository<T, Long> repository();

    default T create(T entity) {
        return repository().save(entity);
    }

    default T read(Long id) {
        return repository().findOne(id);
    }

    default T update(Long id, T entity) {
        if (!repository().exists(id)) {
            return null;
        }
        return repository().save(entity);
    }

    default boolean delete(Long id) {
        if (!repository().exists(id)) {
            return false;
        }
        repository().delete(id);
        return true;
    }
}
