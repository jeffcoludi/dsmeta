import Header from "./components/Header";
import NotificationButton from "./components/NotificationButton";
import SalesCard from "./components/Salescard";
function App() {
  return (
    <>
      <Header />
      <main>
        <section id="sales">
          <div className="dsmeta-container"></div>
          <SalesCard/>

          
        </section>
      </main>
    </>
  );
}

export default App;
