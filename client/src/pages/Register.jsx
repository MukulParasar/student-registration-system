import { useState } from "react";
import { registerStudent } from "../services/api";

function Register() {
  const [student, setStudent] = useState({
    rollNo: "",
    name: "",
    fatherName: "",
    emailId: "",
    department: "",
    course: "",
    mobileNo: "",
  });

  const handleChange = (e) => {
    setStudent({
      ...student,
      [e.target.name]: e.target.value,
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await registerStudent(student);
      alert("Student Registered Successfully!");
      setStudent({
        rollNo: "",
        name: "",
        fatherName: "",
        emailId: "",
        department: "",
        course: "",
        mobileNo: "",
      });
    } catch (error) {
      alert("Error registering student");
      console.error(error);
    }
  };

  return (
    <div style={{ maxWidth: "400px", margin: "50px auto" }}>
      <h2>Student Registration</h2>

      <form onSubmit={handleSubmit}>
        <input name="rollNo" placeholder="Roll No" value={student.rollNo} onChange={handleChange} required />
        <br /><br />

        <input name="name" placeholder="Name" value={student.name} onChange={handleChange} required />
        <br /><br />

        <input name="fatherName" placeholder="Father Name" value={student.fatherName} onChange={handleChange} required />
        <br /><br />

        <input name="emailId" placeholder="Email" value={student.emailId} onChange={handleChange} required />
        <br /><br />

        <input name="department" placeholder="Department" value={student.department} onChange={handleChange} required />
        <br /><br />

        <input name="course" placeholder="Course" value={student.course} onChange={handleChange} required />
        <br /><br />

        <input name="mobileNo" placeholder="Mobile No" value={student.mobileNo} onChange={handleChange} required />
        <br /><br />

        <button type="submit">Register</button>
      </form>
    </div>
  );
}

export default Register;