package com.konarch.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.konarch.model.Hoto;
import com.konarch.repository.HotoRepository;

@Service
public class HotoService {

    @Autowired
    private HotoRepository hotoRepository;

    public Hoto saveHoto(Hoto hoto) {
        return hotoRepository.save(hoto);
    }

    public List<Hoto> getAllHotos() {
        return hotoRepository.findAll();
    }

    public Optional<Hoto> getHotoById(int id) {
        return hotoRepository.findById(id);
    }

    public Hoto updateHoto(int id, Hoto hotoDetails) {
        Hoto hoto = hotoRepository.findById(id).orElseThrow(() -> new RuntimeException("Hoto not found for this id :: " + id));
        hoto.setName(hotoDetails.getName());
        hoto.setData(hotoDetails.getData());
        hoto.setHoto1(hotoDetails.getHoto1());
        hoto.setHoto2(hotoDetails.getHoto2());
        hoto.setHoto3(hotoDetails.getHoto3());
        hoto.setHoto4(hotoDetails.getHoto4());
        hoto.setDate(hotoDetails.getDate());
        return hotoRepository.save(hoto);
    }

    public void deleteHoto(int id) {
        Hoto hoto = hotoRepository.findById(id).orElseThrow(() -> new RuntimeException("Hoto not found for this id :: " + id));
        hotoRepository.delete(hoto);
    }
}