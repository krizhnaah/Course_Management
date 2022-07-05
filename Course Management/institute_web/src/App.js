import "./App.css";
import "./component/header/header.css";
import "./component/layout/layout.css";

import { Routes, Route } from "react-router-dom";
import Layout from "./component/layout/Layout";
import Courses from "./component/header/courses/Courses";
import Placement from "./component/header/placement/Placement";
import AboutUs from "./component/header/aboutus/AboutUs";
import Contact from "./component/header/contact/Contact";
import Home from "./component/home/Home";

function App() {
  return (
    <div className="App">
      <Routes>
        <Route exact path={"/" || "/home"} element={<Layout />}>
          <Route path="/" element={<Home />} />
          <Route path="courses" element={<Courses />} />
          <Route path="placement-services" element={<Placement />} />
          <Route path="about-us" element={<AboutUs />} />
          <Route path="contact" element={<Contact />} />
        </Route>
      </Routes>
    </div>
  );
}

export default App;
