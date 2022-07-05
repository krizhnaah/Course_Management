import { FaBookReader } from "react-icons/fa";
import { GrWorkshop, GrContact } from "react-icons/gr";
import { AiOutlineExclamationCircle } from "react-icons/ai";
import { IoIosPaper } from "react-icons/io";
import { FiHome } from "react-icons/fi";
export const MenuBarData = [
  {
    title: "HOME",
    icon: <FiHome className="icons" />,
    cName: "menubar-text",
    path: "/",
  },
  {
    title: "COURSE",
    icon: <FaBookReader className="icons" />,
    cName: "menubar-text",
    path: "/course",
  },
  {
    title: "PLACEMENT",
    icon: <GrWorkshop className="icons" />,
    cName: "menubar-text",
    path: "/placement-services",
  },
  {
    title: "REPORT",
    icon: <IoIosPaper className="icons" />,
    cName: "menubar-text",
    path: "/report",
  },
  {
    title: "CONTACT",
    icon: <GrContact className="icons" />,
    cName: "menubar-text",
    path: "/contact",
  },
  {
    title: "ABOUT US",
    icon: <AiOutlineExclamationCircle className="icons" />,
    cName: "menubar-text",
    path: "/about-us",
  },
];
