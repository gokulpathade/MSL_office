package com.konarch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.konarch.model.Hoto;
import com.konarch.model.User;
import com.konarch.service.HotoService;
import com.konarch.service.UserService;

//@RestController
//@RequestMapping("/api")

@RestController
@RequestMapping("/api")

public class HotoController {

    @Autowired
    private HotoService hotoService;

    @Autowired
    private UserService userService;

    @PostMapping("/save/{userId}")
    public Hoto createHoto(@PathVariable(value = "userId") int userId, @Validated @RequestBody Hoto hoto) {
        User user = userService.getUserById(userId).orElseThrow(() -> new RuntimeException("User not found for this id :: " + userId));
        hoto.setUser(user);
        return hotoService.saveHoto(hoto);
    }

    @GetMapping
    public List<Hoto> getAllHotos(@PathVariable(value = "userId") int userId) {
        User user = userService.getUserById(userId).orElseThrow(() -> new RuntimeException("User not found for this id :: " + userId));
        return user.getHotos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hoto> getHotoById(@PathVariable(value = "userId") int userId, @PathVariable(value = "id") int id) {
        userService.getUserById(userId).orElseThrow(() -> new RuntimeException("User not found for this id :: " + userId));
        Hoto hoto = hotoService.getHotoById(id).orElseThrow(() -> new RuntimeException("Hoto not found for this id :: " + id));
        if (hoto.getUser().getId() != userId) {
            throw new RuntimeException("Hoto does not belong to the user");
        }
        return ResponseEntity.ok().body(hoto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Hoto> updateHoto(@PathVariable(value = "userId") int userId, @PathVariable(value = "id") int id, @Validated @RequestBody Hoto hotoDetails) {
        userService.getUserById(userId).orElseThrow(() -> new RuntimeException("User not found for this id :: " + userId));
        Hoto hoto = hotoService.getHotoById(id).orElseThrow(() -> new RuntimeException("Hoto not found for this id :: " + id));
        if (hoto.getUser().getId() != userId) {
            throw new RuntimeException("Hoto does not belong to the user");
        }
        hoto.setName(hotoDetails.getName());
        hoto.setData(hotoDetails.getData());
        hoto.setHoto1(hotoDetails.getHoto1());
        hoto.setHoto2(hotoDetails.getHoto2());
        hoto.setHoto3(hotoDetails.getHoto3());
        hoto.setHoto4(hotoDetails.getHoto4());
        hoto.setDate(hotoDetails.getDate());
        Hoto updatedHoto = hotoService.saveHoto(hoto);
        return ResponseEntity.ok(updatedHoto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHoto(@PathVariable(value = "userId") int userId, @PathVariable(value = "id") int id) {
        userService.getUserById(userId).orElseThrow(() -> new RuntimeException("User not found for this id :: " + userId));
        Hoto hoto = hotoService.getHotoById(id).orElseThrow(() -> new RuntimeException("Hoto not found for this id :: " + id));
        if (hoto.getUser().getId() != userId) {
            throw new RuntimeException("Hoto does not belong to the user");
        }
        hotoService.deleteHoto(id);
        return ResponseEntity.noContent().build();
    }
}