package edu.unam.tablajavafx.Controllers;

import edu.unam.tablajavafx.Models.Libro;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.controlsfx.control.action.Action;

public class TablaController {

    @FXML
    private TableView<Libro> tblvTabla;
    @FXML
    private TableColumn<Libro, String> tblcolNombre;
    @FXML
    private TableColumn<Libro, String> tblcolPrecio;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnEditar;
    @FXML
    private Button btnAgregar;
    @FXML
    private TextField txtfNombreLibro;
    @FXML
    private TextField txtfPrecio;

    ObservableList<Libro> listaLibros = FXCollections.observableArrayList();

    @FXML
    private void initialize(){
        listaLibros.add(new Libro("El Principito", "1000"));

        tblcolNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        tblcolPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
        tblvTabla.setItems(listaLibros);
    }

    @FXML
    public void eliminarLibro(ActionEvent event){

    }

    @FXML
    public void editarLibro(ActionEvent event){

    }

    public void limpiarCampos(){
        txtfNombreLibro.setText("");
        txtfPrecio.setText("");
    }

    @FXML
    public void agregarLibro(ActionEvent event){
        String nombreLibro = txtfNombreLibro.getText();
        String precioLibro = txtfPrecio.getText();

        Libro nuevoLibro = new Libro(nombreLibro, precioLibro);
        listaLibros.add(nuevoLibro);

        limpiarCampos();
    }
}