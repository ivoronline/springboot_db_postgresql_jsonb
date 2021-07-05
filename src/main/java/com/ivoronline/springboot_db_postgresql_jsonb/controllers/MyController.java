package com.ivoronline.springboot_db_postgresql_jsonb.controllers;

import com.ivoronline.springboot_db_postgresql_jsonb.entities.Address;
import com.ivoronline.springboot_db_postgresql_jsonb.entities.PersonEntity;
import com.ivoronline.springboot_db_postgresql_jsonb.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  @Autowired PersonRepository personRepository;

  @ResponseBody
  @RequestMapping("/AddPerson")
  public String addPerson() {

    //CREATE ADDRESS
    Address       address              = new Address();
                  address.city         = "London";
                  address.street       = "Baker Street";
                  address.streetNumber = 5;

    //CREATE PERSON
    PersonEntity  personEntity         = new PersonEntity();
                  personEntity.name    = "John";
                  personEntity.age     = 20;
                  personEntity.address = address;

    //STORE PERSON ENTITY
    personRepository.save(personEntity);

    //RETURN SOMETHING TO BROWSER
    return "Person added to DB";

  }

}
