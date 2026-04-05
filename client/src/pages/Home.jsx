import { useNavigate } from "react-router-dom";

function Home() {
  const navigate = useNavigate();

  return (
    <div style={{ textAlign: "center", marginTop: "100px" }}>
      <h1>Welcome to Student Registration System</h1>
      <button onClick={() => navigate("/register")}>
        Go to Registration
      </button>
    </div>
  );
}

export default Home;