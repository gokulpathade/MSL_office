
import Index from "views/Index.js";

import Profile from "views/examples/Profile.js";
import Maps from "views/examples/Maps.js";
import Register from "views/examples/Register.js";
import Login from "views/examples/Login.js";
import Tables from "views/examples/Tables.js";
import Icons from "views/examples/Icons.js";
import UserTable from "./components/Pages/UserTable";


// import SurveyForm from "views/examples/SurveyForm.js";
import SurveyForm from "./components/Pages/SurveyForm"
var UserRoutes = [
  {
    path: "/index",
    name: "Dashboard",
    icon: "ni ni-world-2", // Use the icon as a JSX element
    component: <Index />,
    layout: "/user",
  },

  {
    path: "/SurveyForm",
    name: "Survey User",
    icon: "ni ni-tv-2 text-primary",
    component: <SurveyForm />,
    layout: "/user",
  },

  {
    path: "/Matrial",
    name: "Matrial Kit",
    icon: "ni ni-tv-2 text-primary",
    component: <Index />,
    layout: "/user",
  },




  {
    path: "/MatrialInvoice",
    name: "Matrial Invoice",
    icon: "ni ni-tv-2 text-primary",
    component: <Index />,
    layout: "/user",
  },




  {
    path: "/Hoto",
    name: "HOTO",
    icon: "ni ni-tv-2 text-primary",
    component: <Index />,
    layout: "/user",
  },




  {
    path: "/School",
    name: "SCHOOL",
    icon: "ni ni-tv-2 text-primary",
    component: <Index />,
    layout: "/user",
  },



  

  {
    path: "/Report",
    name: "Report",
    icon: "ni ni-tv-2 text-primary",
    component: <Index />,
    layout: "/user",
  },




  

  {
    path: "/StockIn",
    name: "Stock In",
    icon: "ni ni-tv-2 text-primary",
    component: <Index />,
    layout: "/user",
  },





  

  {
    path: "/StockOut",
    name: "Stock Out",
    icon: "ni ni-tv-2 text-primary",
    component: <Index />,
    layout: "/user",
  },




  

  {
    path: "/Import",
    name: "Import",
    icon: "ni ni-tv-2 text-primary",
    component: <Index />,
    layout: "/user",
  },



  
  {
    path: "/Drive",
    name: "Drive",
    icon: "ni ni-tv-2 text-primary",
    component: <Index />,
    layout: "/user",
  },



  {
    path: "/icons",
    name: "Icons",
    icon: "ni ni-planet text-blue",
    component: <Icons />,
    layout: "/user",
  },
  {
    path: "/maps",
    name: "Maps",
    icon: "ni ni-pin-3 text-orange",
    component: <Maps />,
    layout: "/user",
  },
  {
    path: "/user-profile",
    name: "User Profile",
    icon: "ni ni-single-02 text-yellow",
    component: <Profile />,
    layout: "/user",
  },

  {
    path: "/UserTable",
    name: "User",
    icon: "ni ni-single-02 text-yellow",
    component: <UserTable />,
    layout: "/user",
  },
  {
    path: "/tables",
    name: "Tables",
    icon: "ni ni-bullet-list-67 text-red",
    component: <Tables />,
    layout: "/user",
  },
  {
    path: "/login",
    name: "Login",
    icon: "ni ni-key-25 text-info",
    component: <Login />,
    layout: "/auth",
  },
  {
    path: "/register",
    name: "Register",
    icon: "ni ni-circle-08 text-pink",
    component: <Register />,
    layout: "/auth",
  },
];
export default UserRoutes;
