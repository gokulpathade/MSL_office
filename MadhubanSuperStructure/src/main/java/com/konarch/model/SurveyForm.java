package com.konarch.model;





import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;



@Entity
@Table(name = "surveys")
public class SurveyForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "project_title")
    private String projectTitle;

    @NotBlank
    @Column(name = "charge_point")
    private String chargePoint;

    @NotBlank
    @Column(name = "spec_no")
    private String specNo;

    @NotBlank
    @Column(name = "requested_by")
    private String requestedBy;

    @NotBlank
    @Column(name = "contractor_rep")
    private String contractorRep;

    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    @Column(name = "mark_utility_interferences")
    private boolean markUtilityInterferences;

    @Column(name = "mark_removals")
    private boolean markRemovals;

    @Column(name = "stake_utility")
    private boolean stakeUtility;

    @Column(name = "stake_for_grading")
    private boolean stakeForGrading;

    @Column(name = "layout_striping")
    private boolean layoutStriping;

    @Column(name = "layout_fence_line")
    private boolean layoutFenceLine;

    @Column(name = "as_built")
    private boolean asBuilt;

    @Column(name = "other")
    private String other;

    @Column(name = "drawing_no")
    private String drawingNo;

    @Column(name = "sheets")
    private String sheets;

    @Column(name = "rfi_no")
    private String rfiNo;

    @Column(name = "area_ready_by")
    private String areaReadyBy;

    @Column(name = "stakes_used_on")
    private String stakesUsedOn;

    @Column(name = "change_order_no")
    private String changeOrderNo;

    @Column(name = "stakes_to_be_set")
    private String stakesToBeSet;

    @Column(name = "offset")
    private boolean offset;

    @Column(name = "distance")
    private String distance;

    @Column(name = "direction")
    private String direction;

    @Column(name = "restake")
    private String restake;

    @Column(name = "deliverables_grade_sheet")
    private boolean deliverablesGradeSheet;

    @Column(name = "deliverables_xyz_file")
    private boolean deliverablesXyzFile;

    @Column(name = "deliverables_ascii_file")
    private boolean deliverablesAsciiFile;

    @Column(name = "comments")
    private String comments;

    

	public SurveyForm() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public SurveyForm(Long id, @NotBlank String projectTitle, @NotBlank String chargePoint, @NotBlank String specNo,
			@NotBlank String requestedBy, @NotBlank String contractorRep, Date date, boolean markUtilityInterferences,
			boolean markRemovals, boolean stakeUtility, boolean stakeForGrading, boolean layoutStriping,
			boolean layoutFenceLine, boolean asBuilt, String other, String drawingNo, String sheets, String rfiNo,
			String areaReadyBy, String stakesUsedOn, String changeOrderNo, String stakesToBeSet, boolean offset,
			String distance, String direction, String restake, boolean deliverablesGradeSheet,
			boolean deliverablesXyzFile, boolean deliverablesAsciiFile, String comments) {
		super();
		this.id = id;
		this.projectTitle = projectTitle;
		this.chargePoint = chargePoint;
		this.specNo = specNo;
		this.requestedBy = requestedBy;
		this.contractorRep = contractorRep;
		this.date = date;
		this.markUtilityInterferences = markUtilityInterferences;
		this.markRemovals = markRemovals;
		this.stakeUtility = stakeUtility;
		this.stakeForGrading = stakeForGrading;
		this.layoutStriping = layoutStriping;
		this.layoutFenceLine = layoutFenceLine;
		this.asBuilt = asBuilt;
		this.other = other;
		this.drawingNo = drawingNo;
		this.sheets = sheets;
		this.rfiNo = rfiNo;
		this.areaReadyBy = areaReadyBy;
		this.stakesUsedOn = stakesUsedOn;
		this.changeOrderNo = changeOrderNo;
		this.stakesToBeSet = stakesToBeSet;
		this.offset = offset;
		this.distance = distance;
		this.direction = direction;
		this.restake = restake;
		this.deliverablesGradeSheet = deliverablesGradeSheet;
		this.deliverablesXyzFile = deliverablesXyzFile;
		this.deliverablesAsciiFile = deliverablesAsciiFile;
		this.comments = comments;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getChargePoint() {
		return chargePoint;
	}

	public void setChargePoint(String chargePoint) {
		this.chargePoint = chargePoint;
	}

	public String getSpecNo() {
		return specNo;
	}

	public void setSpecNo(String specNo) {
		this.specNo = specNo;
	}

	public String getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}

	public String getContractorRep() {
		return contractorRep;
	}

	public void setContractorRep(String contractorRep) {
		this.contractorRep = contractorRep;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isMarkUtilityInterferences() {
		return markUtilityInterferences;
	}

	public void setMarkUtilityInterferences(boolean markUtilityInterferences) {
		this.markUtilityInterferences = markUtilityInterferences;
	}

	public boolean isMarkRemovals() {
		return markRemovals;
	}

	public void setMarkRemovals(boolean markRemovals) {
		this.markRemovals = markRemovals;
	}

	public boolean isStakeUtility() {
		return stakeUtility;
	}

	public void setStakeUtility(boolean stakeUtility) {
		this.stakeUtility = stakeUtility;
	}

	public boolean isStakeForGrading() {
		return stakeForGrading;
	}

	public void setStakeForGrading(boolean stakeForGrading) {
		this.stakeForGrading = stakeForGrading;
	}

	public boolean isLayoutStriping() {
		return layoutStriping;
	}

	public void setLayoutStriping(boolean layoutStriping) {
		this.layoutStriping = layoutStriping;
	}

	public boolean isLayoutFenceLine() {
		return layoutFenceLine;
	}

	public void setLayoutFenceLine(boolean layoutFenceLine) {
		this.layoutFenceLine = layoutFenceLine;
	}

	public boolean isAsBuilt() {
		return asBuilt;
	}

	public void setAsBuilt(boolean asBuilt) {
		this.asBuilt = asBuilt;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getDrawingNo() {
		return drawingNo;
	}

	public void setDrawingNo(String drawingNo) {
		this.drawingNo = drawingNo;
	}

	public String getSheets() {
		return sheets;
	}

	public void setSheets(String sheets) {
		this.sheets = sheets;
	}

	public String getRfiNo() {
		return rfiNo;
	}

	public void setRfiNo(String rfiNo) {
		this.rfiNo = rfiNo;
	}

	public String getAreaReadyBy() {
		return areaReadyBy;
	}

	public void setAreaReadyBy(String areaReadyBy) {
		this.areaReadyBy = areaReadyBy;
	}

	public String getStakesUsedOn() {
		return stakesUsedOn;
	}

	public void setStakesUsedOn(String stakesUsedOn) {
		this.stakesUsedOn = stakesUsedOn;
	}

	public String getChangeOrderNo() {
		return changeOrderNo;
	}

	public void setChangeOrderNo(String changeOrderNo) {
		this.changeOrderNo = changeOrderNo;
	}

	public String getStakesToBeSet() {
		return stakesToBeSet;
	}

	public void setStakesToBeSet(String stakesToBeSet) {
		this.stakesToBeSet = stakesToBeSet;
	}

	public boolean isOffset() {
		return offset;
	}

	public void setOffset(boolean offset) {
		this.offset = offset;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getRestake() {
		return restake;
	}

	public void setRestake(String restake) {
		this.restake = restake;
	}

	public boolean isDeliverablesGradeSheet() {
		return deliverablesGradeSheet;
	}

	public void setDeliverablesGradeSheet(boolean deliverablesGradeSheet) {
		this.deliverablesGradeSheet = deliverablesGradeSheet;
	}

	public boolean isDeliverablesXyzFile() {
		return deliverablesXyzFile;
	}

	public void setDeliverablesXyzFile(boolean deliverablesXyzFile) {
		this.deliverablesXyzFile = deliverablesXyzFile;
	}

	public boolean isDeliverablesAsciiFile() {
		return deliverablesAsciiFile;
	}

	public void setDeliverablesAsciiFile(boolean deliverablesAsciiFile) {
		this.deliverablesAsciiFile = deliverablesAsciiFile;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "SurveyForm [id=" + id + ", projectTitle=" + projectTitle + ", chargePoint=" + chargePoint + ", specNo="
				+ specNo + ", requestedBy=" + requestedBy + ", contractorRep=" + contractorRep + ", date=" + date
				+ ", markUtilityInterferences=" + markUtilityInterferences + ", markRemovals=" + markRemovals
				+ ", stakeUtility=" + stakeUtility + ", stakeForGrading=" + stakeForGrading + ", layoutStriping="
				+ layoutStriping + ", layoutFenceLine=" + layoutFenceLine + ", asBuilt=" + asBuilt + ", other=" + other
				+ ", drawingNo=" + drawingNo + ", sheets=" + sheets + ", rfiNo=" + rfiNo + ", areaReadyBy="
				+ areaReadyBy + ", stakesUsedOn=" + stakesUsedOn + ", changeOrderNo=" + changeOrderNo
				+ ", stakesToBeSet=" + stakesToBeSet + ", offset=" + offset + ", distance=" + distance + ", direction="
				+ direction + ", restake=" + restake + ", deliverablesGradeSheet=" + deliverablesGradeSheet
				+ ", deliverablesXyzFile=" + deliverablesXyzFile + ", deliverablesAsciiFile=" + deliverablesAsciiFile
				+ ", comments=" + comments + "]";
	}


    
    
    
}
