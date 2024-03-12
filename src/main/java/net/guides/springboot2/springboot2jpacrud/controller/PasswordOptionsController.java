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

import net.guides.springboot2.springboot2jpacrud.model.PasswordOptions;
import net.guides.springboot2.springboot2jpacrud.repository.PasswordOptionsRepository;
import net.guides.springboot2.springboot2jpacrud.exception.ResourceNotFoundException;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class PasswordOptionsController {
    @Autowired
    private PasswordOptionsRepository passwordOptionsRepository;

    @GetMapping("/password")
    public List<PasswordOptions> getAllPasswordOptions() {
        return passwordOptionsRepository.findAll();
    }

    @PutMapping("/password/{id}")
    public ResponseEntity<PasswordOptions> updatePasswordOptions(@PathVariable(value = "id") Long passwordOptionsId, @Valid @RequestBody PasswordOptions passwordOptionsDetail) throws ResourceNotFoundException {
        PasswordOptions passwordOptions = passwordOptionsRepository.findById(passwordOptionsId)
         .orElseThrow(()-> new ResourceNotFoundException("Password options not found for this id : " + passwordOptionsId));

        passwordOptions.setNoRepeat(passwordOptionsDetail.getNoRepeat());
        passwordOptions.setLengthC(passwordOptionsDetail.getLengthC());
        passwordOptions.setUseDigit(passwordOptionsDetail.getUseDigit());
        passwordOptions.setUseSpecChars(passwordOptionsDetail.getUseSpecChars());
        passwordOptions.setOnlyDigits(passwordOptionsDetail.getOnlyDigits());
        passwordOptions.setOnlyHexa(passwordOptionsDetail.getOnlyHexa());
        final PasswordOptions updatePasswordOptions = passwordOptionsRepository.save(passwordOptions);
        return ResponseEntity.ok(updatePasswordOptions);
    }
}