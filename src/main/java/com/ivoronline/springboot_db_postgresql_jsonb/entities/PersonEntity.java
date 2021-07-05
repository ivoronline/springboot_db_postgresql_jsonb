package com.ivoronline.springboot_db_postgresql_jsonb.entities;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@TypeDefs({@TypeDef(name = "json", typeClass = JsonBinaryType.class)})
public class PersonEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long    id;

  public String  name;
  public Integer age;

  @Type(type = "json")
  @Column(columnDefinition = "jsonb")
  public Address address;

}
