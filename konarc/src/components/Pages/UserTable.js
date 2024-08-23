import React, { useEffect, useState } from 'react';

import axios from 'axios';

import Header from '../Headers/Header';

import {
  Badge,
  Card,
  CardHeader,
  CardFooter,
  DropdownMenu,
  DropdownItem,
  UncontrolledDropdown,
  DropdownToggle,
  Media,
  Pagination,
  PaginationItem,
  PaginationLink,
  Progress,
  Table,
  Container,
  Row,
  UncontrolledTooltip,
  Button
} from "reactstrap";
import UserForm from './UserForm';
import Config from '../Configration/Config';


const Tables = () => {
  const [users, setUsers] = useState([]);
  const [selectedUser, setSelectedUser] = useState(null);
  const [openForm, setOpenForm] = useState(false);

  useEffect(() => {
    fetchUsers();
  }, []);

  const fetchUsers = async () => {
    try {
      const response = await axios.get(`${Config.apiBaseUrl}/all`);
      setUsers(response.data);
    } catch (error) {
      console.error("There was an error fetching the users!", error);
    }
  };

  const handleEdit = (user) => {
    setSelectedUser(user);
    setOpenForm(true);
  };

  const handleDelete = async (id) => {
    try {
      await axios.delete(`${Config.apiBaseUrl}/delete/${id}`);
      fetchUsers();
    } catch (error) {
      console.error("There was an error deleting the user!", error);
    }
  };

  const handleUpdate = async (updatedUser) => {
    try {
      await axios.put(`${Config.apiBaseUrl}/update/${updatedUser.id}`, updatedUser);
      fetchUsers();
      setOpenForm(false);
    } catch (error) {
      console.error("There was an error updating the user!", error);
    }
  };

  const handleFormClose = () => {
    setOpenForm(false);
    setSelectedUser(null);
    fetchUsers();
  };

  return (
    <>
<Header/>
      <Container className="mt--7" fluid>
        <Row>
          <div className="col">
            <Card className="shadow">
              <CardHeader className="border-0">
                <h3 className="mb-0">User Management</h3>
              </CardHeader>
              <Table className="align-items-center table-flush" responsive>
                <thead className="thead-light">
                  <tr>
                    <th scope="col">Name</th>
                    <th scope="col">Age</th>
                    <th scope="col">Contact</th>
                    <th scope="col">Address</th>
                    <th scope="col">Email</th>
                    {/* <th scope="col">Role</th> */}
                    <th scope="col">Actions</th>
                  </tr>
                </thead>
                <tbody>
                  {users.map((user) => (
                    <tr key={user.id}>
                      <td>{user.name}</td>
                      <td>{user.age}</td>
                      <td>{user.contact}</td>
                      <td>{user.address}</td>
                      <td>{user.email}</td>
                      {/* <td>{user.role}</td> */}
                      <td>
                        <Button onClick={() => handleEdit(user)}>Edit</Button>
                        <Button onClick={() => handleDelete(user.id)}>Delete</Button>
                      </td>
                    </tr>
                  ))}
                </tbody>
              </Table>
              <CardFooter className="py-4">
                <nav aria-label="...">
                  <Pagination
                    className="pagination justify-content-end mb-0"
                    listClassName="justify-content-end mb-0"
                  >
                    <PaginationItem className="disabled">
                      <PaginationLink
                        href="#pablo"
                        onClick={(e) => e.preventDefault()}
                        tabIndex="-1"
                      >
                        <i className="fas fa-angle-left" />
                        <span className="sr-only">Previous</span>
                      </PaginationLink>
                    </PaginationItem>
                    <PaginationItem className="active">
                      <PaginationLink
                        href="#pablo"
                        onClick={(e) => e.preventDefault()}
                      >
                        1
                      </PaginationLink>
                    </PaginationItem>
                    <PaginationItem>
                      <PaginationLink
                        href="#pablo"
                        onClick={(e) => e.preventDefault()}
                      >
                        2 <span className="sr-only">(current)</span>
                      </PaginationLink>
                    </PaginationItem>
                    <PaginationItem>
                      <PaginationLink
                        href="#pablo"
                        onClick={(e) => e.preventDefault()}
                      >
                        3
                      </PaginationLink>
                    </PaginationItem>
                    <PaginationItem>
                      <PaginationLink
                        href="#pablo"
                        onClick={(e) => e.preventDefault()}
                      >
                        <i className="fas fa-angle-right" />
                        <span className="sr-only">Next</span>
                      </PaginationLink>
                    </PaginationItem>
                  </Pagination>
                </nav>
              </CardFooter>
            </Card>
          </div>
        </Row>
        {openForm && (
          <UserForm
            user={selectedUser}
            handleFormSubmit={handleUpdate}
            handleFormClose={handleFormClose}
          />
        )}
      </Container>
    </>
  );
};

export default Tables;
