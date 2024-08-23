package com.konarch.service;



import com.konarch.model.SurveyForm;
import com.konarch.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    public SurveyForm saveSurvey(SurveyForm survey) {
        return surveyRepository.save(survey);
    }

    
    
    public List<SurveyForm> getAllSurveys() {
        return surveyRepository.findAll();
    }

    
    
    
    public Optional<SurveyForm> getSurveyById(Long id) {
        return surveyRepository.findById(id);
    }

 
    
    
    public SurveyForm updateSurvey(Long id, SurveyForm surveyDetails) {
    	SurveyForm survey = surveyRepository.findById(id).get();
//            .orElseThrow(() -> new ResourceNotFoundException("Survey not found with id " + id));
        
        survey.setProjectTitle(surveyDetails.getProjectTitle());
        survey.setChargePoint(surveyDetails.getChargePoint());
        survey.setSpecNo(surveyDetails.getSpecNo());
        survey.setRequestedBy(surveyDetails.getRequestedBy());
        survey.setContractorRep(surveyDetails.getContractorRep());
        survey.setDate(surveyDetails.getDate());
        survey.setMarkUtilityInterferences(surveyDetails.isMarkUtilityInterferences());
        survey.setMarkRemovals(surveyDetails.isMarkRemovals());
        survey.setStakeUtility(surveyDetails.isStakeUtility());
        survey.setStakeForGrading(surveyDetails.isStakeForGrading());
        survey.setLayoutStriping(surveyDetails.isLayoutStriping());
        survey.setLayoutFenceLine(surveyDetails.isLayoutFenceLine());
        survey.setAsBuilt(surveyDetails.isAsBuilt());
        survey.setOther(surveyDetails.getOther());
        survey.setDrawingNo(surveyDetails.getDrawingNo());
        survey.setSheets(surveyDetails.getSheets());
        survey.setRfiNo(surveyDetails.getRfiNo());
        survey.setAreaReadyBy(surveyDetails.getAreaReadyBy());
        survey.setStakesUsedOn(surveyDetails.getStakesUsedOn());
        survey.setChangeOrderNo(surveyDetails.getChangeOrderNo());
        survey.setStakesToBeSet(surveyDetails.getStakesToBeSet());
        survey.setOffset(surveyDetails.isOffset());
        survey.setDistance(surveyDetails.getDistance());
        survey.setDirection(surveyDetails.getDirection());
        survey.setRestake(surveyDetails.getRestake());
        survey.setDeliverablesGradeSheet(surveyDetails.isDeliverablesGradeSheet());
        survey.setDeliverablesXyzFile(surveyDetails.isDeliverablesXyzFile());
        survey.setDeliverablesAsciiFile(surveyDetails.isDeliverablesAsciiFile());
        survey.setComments(surveyDetails.getComments());
        
        return surveyRepository.save(survey);
    }

   
    public void deleteSurvey(Long id) {
    
        surveyRepository.deleteById(id);
    }
}
