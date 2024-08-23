import React from "react";
import { useState } from "react";
// node.js library that concatenates classes (strings)
import classnames from "classnames";
// javascipt plugin for creating charts
import Chart from "chart.js";
// react plugin used to create charts
import { Line, Bar } from "react-chartjs-2";
// reactstrap components
import {
  Button,
  Card,
  CardHeader,
  CardBody,
  NavItem,
  NavLink,
  Nav,
  Progress,
  Table,
  Container,
  Row,
  Col,
} from "reactstrap";

// core components
import {
  chartOptions,
  parseOptions,
  chartExample1,
  chartExample2,
} from "variables/charts.js";

import Header from "components/Headers/Header.js";


// calender code

import dayjs from 'dayjs';
import { LocalizationProvider } from '@mui/x-date-pickers/LocalizationProvider';
import { AdapterDayjs } from '@mui/x-date-pickers/AdapterDayjs';
import { DateCalendar } from '@mui/x-date-pickers/DateCalendar';
import { Box, Typography } from '@mui/material';







const Index = (props) => {
  const [activeNav, setActiveNav] = useState(1);
  const [chartExample1Data, setChartExample1Data] = useState("data1");

  if (window.Chart) {
    parseOptions(Chart, chartOptions());
  }

  const toggleNavs = (e, index) => {
    e.preventDefault();
    setActiveNav(index);
    setChartExample1Data("data" + index);
  };





//   calender code

const [value, setValue] = React.useState(dayjs());

  React.useEffect(() => {
    const updateDate = () => {
      setValue(dayjs());
    };

    // Calculate the milliseconds until midnight
    const now = dayjs();
    const midnight = now.endOf('day').add(1, 'second');
    const msUntilMidnight = midnight.diff(now);

    // Update date at midnight
    const timeoutId = setTimeout(() => {
      updateDate();
      setInterval(updateDate, 24 * 60 * 60 * 1000); // 24 hours
    }, msUntilMidnight);

    return () => {
      clearTimeout(timeoutId);
    };
  }, []);

















  return (
    <>
      <Header />
      {/* Page content */}
      <Container className="mt--7" fluid>
        <Row>
          <Col className="mb-5 mb-xl-0" xl="8">
          <Card className="shadow">
              <CardHeader className="border-0">
                <Row className="align-items-center">
                  <div className="col">
                    <h3 className="mb-0">HOTO DETAILS</h3>
                  </div>
                  <div className="col text-right">
                    <Button
                      color="primary"
                      href="#pablo"
                      onClick={(e) => e.preventDefault()}
                      size="sm"
                    >
                      See all
                    </Button>
                  </div>
                </Row>
              </CardHeader>
              <Table className="align-items-center table-flush" responsive>
                <thead className="thead-light">
                  <tr>
                    <th scope="col">SCHOOL UDISE</th>
                    <th scope="col">USER</th>
                    <th scope="col">STAUS</th>
                    <th scope="col">HOTO IMAGE</th>
                  </tr>
                </thead>
                <tbody>
                 
                  <tr>
                    <th scope="row">/argon/profile.html</th>
                    <td>1,795</td>
                    <td>190</td>
                    <td>
                      <i className="fas fa-arrow-down text-danger mr-3" />{" "}
                      46,53%
                    </td>
                  </tr>
                </tbody>
              </Table>
            </Card>
          </Col>
          <Col xl="4">
          <Card  className="shadow5" sx={{ width: '100%', height: '100%' }}>
      <CardHeader className="bg-transparent">
        <Row className="align-items-center" style={{ width: '100%', height: '100%' }}>
          <LocalizationProvider dateAdapter={AdapterDayjs}>
            <Box variant="h3" sx={{ width: '100%', height: '100%', display: 'flex', flexDirection: 'column', alignItems: 'center', justifyContent: 'center' }}>
              <Typography variant="h3" gutterBottom>
                Calendar
              </Typography>
              <DateCalendar sx={{ width: '100%', height: '100%' }} value={value} onChange={(newValue) => setValue(newValue)} />
              <Typography sx={{ mt: 2 }} variant="h5">
               Date: {value.format('YYYY-MM-DD')}
              </Typography>
            </Box>
          </LocalizationProvider>
        </Row>
      </CardHeader>
      <CardBody style={{ width: '100%', height: '100%' }}>
        {/* Chart */}
        {/* <div className="chart">
          <Bar
            data={chartExample2.data}
            options={chartExample2.options}
          />
        </div> */}
      </CardBody>
    </Card>
          </Col>
        </Row>
       
      </Container>
    </>
  );
};

export default Index;
