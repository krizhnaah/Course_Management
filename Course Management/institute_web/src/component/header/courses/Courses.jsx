import CourseMain, { CourseSide } from "../../content/course-main/CourseMain";

const Courses = () => {
  return (
    <div className="course-content-container">
      <div className="course-side-container">
        <CourseSide className="course-side" />
      </div>
      <div className="course-main-container">
        <CourseMain className="course-main" />
      </div>
    </div>
  );
};

export default Courses;
