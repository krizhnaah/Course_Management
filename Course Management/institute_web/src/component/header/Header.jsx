import { BiSearch } from "react-icons/bi";
import { IoIosNotifications } from "react-icons/io";
import { GoSignIn } from "react-icons/go";
import { Link } from "react-router-dom";

const Header = () => {
  return (
    <>
      <div className="header">
        <div>
          <ul className="header-list-logo">
            <Link to="/">
              <li>
                <img
                  className="header-logo"
                  src={require("../../images/dummy-logo.webp")}
                  alt="logo"
                  title="logo"
                />
              </li>
              <li>LOGO</li>
            </Link>
          </ul>
        </div>
        <div className="header-list-option-login">
          <div>
            <ul className="header-list-option">
              <li>
                <Link to="/courses">COURSES</Link>
              </li>
              <li>
                <Link to="/placement-services">PLACEMENTPLACEMENT</Link>
              </li>
              <li>
                <Link to="/about-us">ABOUT US</Link>
              </li>
              <li>
                <Link to="/contact">CONTACT</Link>
              </li>
            </ul>
          </div>
          <div>
            <ul className="header-list-login">
              <li>
                <BiSearch className="icons" title="search" />
              </li>
              <li>
                <GoSignIn className="icons" title="signin/signup" />
              </li>
              <li>
                <IoIosNotifications className="icons" title="notification" />
              </li>
              <li>
                <img
                  className="profile"
                  src={require("../../images/profile-icon.png")}
                  alt="profile"
                  title="profile"
                />
              </li>
            </ul>
          </div>
        </div>
      </div>
    </>
  );
};

export default Header;
