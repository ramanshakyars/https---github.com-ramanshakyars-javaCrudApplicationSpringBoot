package com.example.CustumerApplication.repository;

import com.example.CustumerApplication.Custumar;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Custumarepository  extends CrudRepository<Custumar,Long> {

    List<Custumar> findByName(String name);
    List<Custumar> findBydeleted(Boolean deleted);
}
