import { Outlet } from "react-router-dom";
import Header from "../header/Header";

const Layout = () => {
  return (
    <>
      <div className="layout-container">
        <div className="header-container">
          <Header />
        </div>
        {/* <div className="header-below-container">
          <Outlet className="main-outlet" />
        </div> */}
      </div>
    </>
  );
};
export default Layout;
