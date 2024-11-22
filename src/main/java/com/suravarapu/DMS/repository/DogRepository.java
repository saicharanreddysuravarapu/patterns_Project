package com.suravarapu.DMS.repository;

/*
 * @author Sai Charan Reddy Suravarapu S572142
 */

import org.springframework.data.repository.CrudRepository;

import com.suravarapu.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {

}
