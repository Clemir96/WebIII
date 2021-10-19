package br.com.clemirsergio.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.clemirsergio.model.Car;
import br.com.clemirsergio.repository.CarRepository;

@Service
public class CarService {
	@Autowired
	private CarRepository carRepository;

	public Car insertOrUpdate(Car car) {
		return carRepository.save(car);
	}
	
	public List<Car> findAll(){
		List<Car> cars = new ArrayList<>();
		carRepository.findAll().forEach(cars::add);
		return cars;	
	}
	
	public Optional<Car> findOne(int id){
		return carRepository.findById(id);
	}
	
	public void remove(int id) {
		carRepository.deleteById(id);
	}
}
