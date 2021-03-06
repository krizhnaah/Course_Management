import "./App.css";
import "./component/header/header.css";
import "./component/layout/layout.css";
import "./component/header/courses/courses.css";

import { Routes, Route } from "react-router-dom";
import Layout from "./component/layout/Layout";
import Courses from "./component/header/courses/Courses";
import Placement from "./component/header/placement/Placement";
import AboutUs from "./component/header/aboutus/AboutUs";
import Contact from "./component/header/contact/Contact";
import Home from "./component/home/Home";

function App() {
  return (
    <Routes>
      <Route exact path={"/" || "/home"} element={<Layout />}>
        <Route path="/" element={<Home />} />
        <Route path="course" element={<Courses />} />
        <Route path="placement-services" element={<Placement />} />
        <Route path="about-us" element={<AboutUs />} />
        <Route path="contact" element={<Contact />} />
      </Route>
    </Routes>
  );
}

export default App;
