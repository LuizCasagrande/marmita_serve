package com.marmitex.service.serviceImpl;

import com.marmitex.data.FavoritoData;
import com.marmitex.framework.CrudServiceImpl;
import com.marmitex.model.Favorito;
import com.marmitex.service.FavoritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class FavoritoServiceImpl extends CrudServiceImpl<Favorito, Long> implements FavoritoService {

    @Autowired private FavoritoData favoritoData;

    @Override
    public JpaRepository<Favorito, Long> getRepository() {
        return favoritoData;
    }
}
