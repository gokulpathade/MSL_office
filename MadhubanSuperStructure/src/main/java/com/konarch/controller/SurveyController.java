package com.konarch.controller;



import com.konarch.model.SurveyForm;
import com.konarch.service.SurveyService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/surveys")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @PostMapping
    public ResponseEntity<SurveyForm> createSurvey(@Valid @RequestBody SurveyForm survey) {
    	SurveyForm savedSurvey = surveyService.saveSurvey(survey);
        return ResponseEntity.ok(savedSurvey);
    }

    @GetMapping
    public ResponseEntity<List<SurveyForm>> getAllSurveys() {
        List<SurveyForm> surveys = surveyService.getAllSurveys();
        return ResponseEntity.ok(surveys);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SurveyForm> getSurveyById(@PathVariable Long id) {
        Optional<SurveyForm> survey = surveyService.getSurveyById(id);
        return survey.map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<SurveyForm> updateSurvey(@PathVariable Long id, @Valid @RequestBody SurveyForm surveyDetails) {
    	SurveyForm updatedSurvey = surveyService.updateSurvey(id, surveyDetails);
        return ResponseEntity.ok(updatedSurvey);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSurvey(@PathVariable Long id) {
        surveyService.deleteSurvey(id);
        return ResponseEntity.noContent().build();
    }
}
