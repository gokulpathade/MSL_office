

// reactstrap components
import { Card, CardBody, CardTitle, Container, Row, Col } from "reactstrap";

const Header = () => {
  return (
    <>

{/*  //  bg-gradient-info  */}
      <div className="header bg-blue
 pb-8 pt-5 pt-md-8">
       
        <Container fluid>
          <div className="header-body">
            {/* Card stats */}
            <Row>
              <Col lg="6" xl="3">
                <Card className="card-stats mb-4 mb-xl-0">
                  <CardBody>
                    <Row>
                      <div className="col">
                        <CardTitle
                          tag="h5"
                          className="text-uppercase text-muted mb-0"
                        >
                          <h3 style={{fontFamily:"'Poppins', sans-serif"}}>      Total   </h3> 
                        </CardTitle>
                        <span className="h2 font-weight-bold mb-0">
                          350,897
                        </span>
                      </div>
                      <Col className="col-auto">
                        <div className="icon icon-shape bg-danger text-white rounded-circle shadow">
                          <i className="ni ni-archive-2" />
                        </div>
                      </Col>
                    </Row>
                    <p className="mt-3 mb-0 text-muted text-sm">
                      <span className="text-success mr-2">
                        {/* <i className="fa fa-arrow-up" /> 3.48% */}
                      </span>{" "}
                      {/* <span className="text-nowrap">Since last month</span> */}
                    </p>
                  </CardBody>
                </Card>
              </Col>
              <Col lg="6" xl="3">
                <Card className="card-stats mb-4 mb-xl-0">
                  <CardBody>
                    <Row>
                      <div className="col">
                        <CardTitle
                          tag="h5"
                          className="text-uppercase text-muted mb-0"
                        >
                           <h3 style={{fontFamily:"'Poppins', sans-serif"}}>    Pending   </h3> 
                        </CardTitle>
                        <span className="h2 font-weight-bold mb-0">2,356</span>
                      </div>
                      <Col className="col-auto">
                        <div className="icon icon-shape bg-yellow text-white rounded-circle shadow">
                          <i className="fas fa-chart-pie" />
                        </div>
                      </Col>
                    </Row>
                    <p className="mt-3 mb-0 text-muted text-sm">
                      <span className="text-danger mr-2">
                        {/* <i className="fas fa-arrow-down" /> 3.48% */}
                      </span>{" "}
                      {/* <span className="text-nowrap">Since last week</span> */}
                    </p>
                  </CardBody>
                </Card>
              </Col>
              <Col lg="6" xl="3">
                <Card className="card-stats mb-4 mb-xl-0">
                  <CardBody>
                    <Row>
                      <div className="col">
                        <CardTitle
                          tag="h5"
                          className="text-uppercase text-muted mb-0"
                        >
                          
                          <h3 style={{fontFamily:"'Poppins', sans-serif"}}>   Delivered</h3> 
                        </CardTitle>
                        <span className="h2 font-weight-bold mb-0">924</span>
                      </div>
                      <Col className="col-auto">
                      {/* <AiOutlineDeliveredProcedure style={{fontSize:"50px"}} size={50} color="red" /> */}
                        <div className="icon icon-shape bg-green text-white rounded-circle shadow">
                       
                          <i className="ni ni-delivery-fast" />
                        </div>
                      </Col>
                    </Row>
                    <p className="mt-3 mb-0 text-muted text-sm">
                      <span className="text-warning mr-2">
                        {/* <i className="fas fa-arrow-down" /> 1.10% */}
                      </span>{" "}
                      {/* <span className="text-nowrap">Since yesterday</span> */}
                    </p>
                  </CardBody>
                </Card>
              </Col>
              <Col lg="6" xl="3">
                <Card className="card-stats mb-4 mb-xl-0">
                  <CardBody>
                    <Row>
                      <div className="col">
                        <CardTitle
                          tag="h5"
                          className="text-uppercase text-muted mb-0"
                        >
                      <h3 style={{fontFamily:"'Poppins', sans-serif"}}>   Accepted</h3> 
                        </CardTitle>
                        <span className="h2 font-weight-bold mb-0">492</span>
                      </div>
                      <Col className="col-auto">
                        <div className="icon icon-shape bg-info text-white rounded-circle shadow">
                          <i className="ni ni-cart" />
                        </div>
                      </Col>
                    </Row>
                    <p className="mt-3 mb-0 text-muted text-sm">
                      <span className="text-success mr-2">
                        {/* <i className="fas fa-arrow-up" /> 12% */}
                      </span>{" "}
                      {/* <span className="text-nowrap">Since last month</span> */}
                    </p>
                  </CardBody>
                </Card>
              </Col>
            </Row>
          </div>
        </Container>
      </div>
    </>
  );
};

export default Header;
