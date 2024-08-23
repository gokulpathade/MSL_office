package com.konarch.repository;

import com.konarch.model.SurveyForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends JpaRepository<SurveyForm, Long> {
}
