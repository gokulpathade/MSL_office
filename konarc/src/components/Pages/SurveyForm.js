import React, { useState } from 'react';
import {
  Button,
  Card,
  CardHeader,
  CardBody,
  FormGroup,
  Form,
  Input,
  InputGroupAddon,
  InputGroupText,
  InputGroup,
  Row,
  Col,
} from 'reactstrap';
import axios from 'axios';
import AllHeader from 'components/Headers/AllHeader';

const SurveyForm = () => {
  const [formData, setFormData] = useState({
    projectTitle: '',
    chargePoint: '',
    specNo: '',
    requestedBy: '',
    contractorRep: '',
    date: '',
    markUtilityInterferences: false,
    markRemovals: false,
    stakeUtility: false,
    stakeForGrading: false,
    layoutStriping: false,
    layoutFenceLine: false,
    asBuilt: false,
    other: '',
    drawingNo: '',
    sheets: '',
    rfiNo: '',
    areaReadyBy: '',
    stakesUsedOn: '',
    changeOrderNo: '',
    stakesToBeSet: '',
    offset: '',
    distance: '',
    direction: '',
    restake: '',
    deliverables: {
      gradeSheet: false,
      xyzFile: false,
      asciiFile: false,
    },
    comments: ''
  });

  const handleChange = (e) => {
    const { name, value, type, checked } = e.target;
    if (type === 'checkbox') {
      setFormData({ ...formData, [name]: checked });
    } else {
      setFormData({ ...formData, [name]: value });
    }
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    axios.post('http://localhost:8080/api/surveys', formData)
      .then(response => {
        console.log(response.data);
        // Handle success (e.g., display a success message or redirect)
      })
      .catch(error => {
        console.error('There was an error!', error);
        // Handle error (e.g., display an error message)
      });
  };

  return (
    <>
    <AllHeader/>
      <Col lg="8" md="10">
        <Card className="bg-secondary shadow border-0">
          <CardHeader className="bg-transparent pb-5">
            <div className="text-muted text-center mt-2 mb-4">
              <h2>Fill Construction Survey Form</h2>
            </div>
          </CardHeader>
          <CardBody className="px-lg-5 py-lg-5">
            <Form role="form" onSubmit={handleSubmit}>
              <FormGroup>
                <InputGroup className="input-group-alternative mb-3">
                  <InputGroupAddon addonType="prepend">
                    <InputGroupText>
                      <i className="ni ni-building" />
                    </InputGroupText>
                  </InputGroupAddon>
                  <Input
                    placeholder="Project Title"
                    type="text"
                    name="projectTitle"
                    value={formData.projectTitle}
                    onChange={handleChange}
                  />
                </InputGroup>
              </FormGroup>
              <FormGroup>
                <InputGroup className="input-group-alternative mb-3">
                  <InputGroupAddon addonType="prepend">
                    <InputGroupText>
                      <i className="ni ni-money-coins" />
                    </InputGroupText>
                  </InputGroupAddon>
                  <Input
                    placeholder="Charge Point"
                    type="text"
                    name="chargePoint"
                    value={formData.chargePoint}
                    onChange={handleChange}
                  />
                </InputGroup>
              </FormGroup>
              <FormGroup>
                <InputGroup className="input-group-alternative mb-3">
                  <InputGroupAddon addonType="prepend">
                    <InputGroupText>
                      <i className="ni ni-paper-diploma" />
                    </InputGroupText>
                  </InputGroupAddon>
                  <Input
                    placeholder="Specification No."
                    type="text"
                    name="specNo"
                    value={formData.specNo}
                    onChange={handleChange}
                  />
                </InputGroup>
              </FormGroup>
              {/* Add other fields similarly */}
              <FormGroup>
                <InputGroup className="input-group-alternative mb-3">
                  <InputGroupAddon addonType="prepend">
                    <InputGroupText>
                      <i className="ni ni-check-bold" />
                    </InputGroupText>
                  </InputGroupAddon>
                  <Input
                    placeholder="Requested By"
                    type="text"
                    name="requestedBy"
                    value={formData.requestedBy}
                    onChange={handleChange}
                  />
                </InputGroup>
              </FormGroup>
              <FormGroup>
                <InputGroup className="input-group-alternative mb-3">
                  <InputGroupAddon addonType="prepend">
                    <InputGroupText>
                      <i className="ni ni-single-02" />
                    </InputGroupText>
                  </InputGroupAddon>
                  <Input
                    placeholder="Contractor's Representative"
                    type="text"
                    name="contractorRep"
                    value={formData.contractorRep}
                    onChange={handleChange}
                  />
                </InputGroup>
              </FormGroup>
              <FormGroup>
                <InputGroup className="input-group-alternative mb-3">
                  <InputGroupAddon addonType="prepend">
                    <InputGroupText>
                      <i className="ni ni-calendar-grid-58" />
                    </InputGroupText>
                  </InputGroupAddon>
                  <Input
                    placeholder="Date"
                    type="date"
                    name="date"
                    value={formData.date}
                    onChange={handleChange}
                  />
                </InputGroup>
              </FormGroup>
              {/* Add more fields as needed */}
              <Row className="my-4">
                <Col xs="12">
                  <div className="custom-control custom-control-alternative custom-checkbox">
                    <input
                      className="custom-control-input"
                      id="markUtilityInterferences"
                      type="checkbox"
                      name="markUtilityInterferences"
                      checked={formData.markUtilityInterferences}
                      onChange={handleChange}
                    />
                    <label
                      className="custom-control-label"
                      htmlFor="markUtilityInterferences"
                    >
                      <span className="text-muted">Mark Utility Interferences</span>
                    </label>
                  </div>
                  {/* Repeat similar blocks for other checkbox options */}
                </Col>
              </Row>
              <div className="text-center">
                <Button className="mt-4" color="primary" type="submit">
                  Submit Survey Request
                </Button>
              </div>
            </Form>
          </CardBody>
        </Card>
      </Col>
    </>
  );
};

export default SurveyForm;
