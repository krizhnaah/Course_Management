import { BiSearch } from "react-icons/bi";
import { IoIosNotifications } from "react-icons/io";
import { GoSignIn } from "react-icons/go";
import { GrClose } from "react-icons/gr";
import { GiHamburgerMenu } from "react-icons/gi";
import { MenuBarData } from "./menubar-data/MenuBarData";
import { Link } from "react-router-dom";
import { useState } from "react";

const Header = () => {
  const [menuBar, SetMenuBar] = useState(false);

  function handleMenuBar() {
    SetMenuBar(!menuBar);
  }

  return (
    <>
      <div className="header">
        <div className="header-list-option">
          <div>
            <GiHamburgerMenu
              className="icons"
              title="menu"
              onClick={handleMenuBar}
            />
          </div>
          <nav className={menuBar ? "menubar active" : "menubar"}>
            <ul onClick={handleMenuBar}>
              <li>
                <GrClose className="icons" />
              </li>
              {MenuBarData.map((option) => {
                return (
                  <>
                    <li className={option.cName}>
                      <Link to={option.path}>
                        {option.icon}
                        <span>{option.title}</span>
                      </Link>
                    </li>
                  </>
                );
              })}
            </ul>
          </nav>
        </div>
        <div className="header-list-logo">
          <ul>
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
        <div className="header-list-login">
          <ul>
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
    </>
  );
};

export default Header;
