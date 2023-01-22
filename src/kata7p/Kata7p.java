package kata7p;

import control.CreateTable;
import control.HistogramBuilder;
import control.InsertData;
import control.ObtainData;
import control.WebService;
import model.Flight;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Kata7p {

    public static void main(String[] args) throws SQLException, IOException {
        CreateTable.createNewTable();
        new InsertData().insert();

        ObtainData obtenerDatosTabla = new ObtainData();
        List<Flight> flights = obtenerDatosTabla.getAllFlights();

        HistogramBuilder histogramBuilder = new HistogramBuilder(flights);
        new WebService(histogramBuilder).start();
    }
}