package br.com.clemirsergio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.clemirsergio.model.Car;
import br.com.clemirsergio.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {
	@Autowired
	private CarService carService;
	
	@PostMapping
	public Car insert(@RequestBody Car car) {
		try {
		return carService.insertOrUpdate(car);
		}catch (Exception e) {
			return null;
		}
	}
	
	@PutMapping
	public Car update(@RequestBody Car car) {
		return carService.insertOrUpdate(car);
	}
	
	@GetMapping
	public List<Car> findAll(){
		return carService.findAll()
				;
	}
	
	@GetMapping("/{id}")
	public Optional<Car> findOne(@PathVariable int id){
		return carService.findOne(id);
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathVariable int id) {
		carService.remove(id);
	}
}
