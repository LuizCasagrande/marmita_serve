package com.marmitex.framework;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public abstract class CrudRestController<T, ID> {

    public abstract CrudService<T, ID> getService();

    @GetMapping
    public List<T> findAll() {
        return getService().findAll();
    }

    @GetMapping("{query}")
    public Optional<T> findById(@PathVariable("query") ID id) {
        return getService().findById(id);
    }

    @PostMapping
    public T save(@RequestBody T entity) {
        return getService().save(entity);
    }

    @DeleteMapping("{query}")
    public void delete(@PathVariable("query") ID id) {
        getService().delete(id);
    }

}
