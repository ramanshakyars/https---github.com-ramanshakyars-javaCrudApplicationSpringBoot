package com.example.CustumerApplication;


import  com.example.CustumerApplication repository.Custumarepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*" , maxAge = 3500)
public class CustumarController {

    @Autowired
    private Custumarepository custumarepository;
    @GetMapping("/get-custumer/{id}")
    public Custumar getCustumar(@PathVariable("id")Long id)
    {
       return (Custumar) this.custumarepository.findById(id).get();
    }
    @PostMapping("/create-custumar")
    public Long createCustumar(@RequestBody Custumar custumar) {
        this.custumarepository.save(custumar);
        System.out.println("user ID:" + custumar.getId());
        return custumar.getId();
    }

    @PutMapping("/update-custumer")
    public Long updateCustumar(@RequestBody Custumar custumar) {
        this.custumarepository.save(custumar);
        System.out.println("custumar ID:" + custumar.getId());
        return custumar.getId();
    }

    @DeleteMapping("/delete-custumar/{id}")
    public Boolean deleteCustumar(@PathVariable("id") Long id) {
        Custumar emp = this.custumarepository.findById(id).get();
        emp.setDeleted(true);
        System.out.println("Delete Custumar with ID:" + id);
        this.custumarepository.save(emp);
        return Boolean.TRUE;
    }
    @GetMapping("/get-custumar-by-name/{name}")
    public List<Custumar> getUserByName(@PathVariable("name") String name) {

        return this.custumarepository.findByName(name);
    }
    @GetMapping("/Custumar")
    public List<Custumar> getAll(){

        return custumarepository.findBydeleted(Boolean.FALSE);
    }



}
