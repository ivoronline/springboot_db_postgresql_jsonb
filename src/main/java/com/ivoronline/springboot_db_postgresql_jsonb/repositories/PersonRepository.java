package com.ivoronline.springboot_db_postgresql_jsonb.repositories;

import com.ivoronline.springboot_db_postgresql_jsonb.entities.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, Integer> { }
