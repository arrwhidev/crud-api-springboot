package com.arrwhi.crudapi.web.controller;

import com.arrwhi.crudapi.db.entity.BaseEntity;
import com.arrwhi.crudapi.web.service.CrudService;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.arrwhi.crudapi.web.response.ResponseHelper.*;

/**
 * Created by arran on 12/02/17.
 */
public interface CrudController<T extends BaseEntity> {

    CrudService<T> service();

    @RequestMapping(method = RequestMethod.POST)
    default HttpEntity<T> create(@RequestBody T entity) {
        return OK(service().create(entity));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    default HttpEntity<T> read(@PathVariable Long id) {
        T fetchedEntity = service().read(id);
        if (fetchedEntity == null) {
            return NOT_FOUND();
        }
        return OK(fetchedEntity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    default HttpEntity<T> update(@PathVariable Long id, @RequestBody T entity) {
        T updatedEntity = service().update(id, entity);
        if (updatedEntity == null) {
            return NOT_FOUND();
        }
        return OK(updatedEntity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    default HttpEntity delete(@PathVariable Long id) {
        boolean didDelete = service().delete(id);
        if (didDelete) {
            return NO_CONTENT();
        }
        return BAD_REQUEST();
    }
}

