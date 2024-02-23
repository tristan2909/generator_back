package net.guides.springboot2.springboot2jpacrud.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.springboot2jpacrud.model.NumberOptions;
import net.guides.springboot2.springboot2jpacrud.repository.NumberOptionsRepository;
import net.guides.springboot2.springboot2jpacrud.exception.ResourceNotFoundException;


@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class NumberOptionsController {
    @Autowired
    private NumberOptionsRepository numberOptionsRepository;

    @GetMapping("/number")
    public List<NumberOptions> getAllNumberOptions() {
        return numberOptionsRepository.findAll();
    }

    @PutMapping("/number/{id}")
    public ResponseEntity<NumberOptions> updateNumberOptions(@PathVariable(value = "id") Long numberOptionsId, @Valid @RequestBody NumberOptions numberOptionsDetail) throws ResourceNotFoundException {
        NumberOptions numberOptions = numberOptionsRepository.findById(numberOptionsId)
         .orElseThrow(()-> new ResourceNotFoundException("Number options not found for this id : " + numberOptionsId));

        numberOptions.setMin(numberOptionsDetail.getMin());
        numberOptions.setMax(numberOptionsDetail.getMax());
        numberOptions.setNb(numberOptionsDetail.getNb());
        numberOptions.setNoRepeat(numberOptionsDetail.getNoRepeat());
        numberOptions.setSort(numberOptionsDetail.getSort());
        final NumberOptions updateNumberOptions = numberOptionsRepository.save(numberOptions);
        return ResponseEntity.ok(updateNumberOptions);
    }
}