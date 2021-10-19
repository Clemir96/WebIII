package br.com.clemirsergio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.clemirsergio.model.Car;

@Repository
public interface CarRepository extends 
CrudRepository<Car, Integer> {

}
