package edu.unam.tablajavafx.Controllers;

import edu.unam.tablajavafx.Models.Libro;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class TablaController implements Initializable {

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

    // Declaración e inicialización de listaLibros
    private ObservableList<Libro> listaLibros = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Agregar libros de ejemplo a la lista
        listaLibros.add(new Libro("El Principito", "$1000"));

        // Asignar la lista a la tabla
        tblvTabla.setItems(listaLibros);

        // Configurar las celdas de la tabla
        tblcolNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        tblcolPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));

        // Escucha los cambios en el elemento seleccionado de la tabla
        tblvTabla.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSelection, newSelection) -> {
                    if (newSelection!= null) { // Verifica si hay un libro seleccionado
                        // Actualiza los campos de texto con los datos del libro seleccionado
                        txtfNombreLibro.setText(((Libro) newSelection).getNombre());
                        txtfPrecio.setText(((Libro) newSelection).getPrecio());
                    } else {
                        // Limpia los campos de texto si no hay un libro seleccionado
                        txtfNombreLibro.clear();
                        txtfPrecio.clear();
                    }
                });
    }

    public void eliminarLibro(ActionEvent event) {
        eliminarElemento();
    }

    public void editarLibro(ActionEvent event) {
        editarElemento();
    }

    public void agregarLibro(ActionEvent event) {
        agregarElemento();
        // Limpiar los TextField
        limpiarCampos();
    }

    private void eliminarElemento() {
        // Obtiene el índice del elemento seleccionado
        int selectedIndex = tblvTabla.getSelectionModel().getSelectedIndex();

        // Verifica si hay un elemento seleccionado
        if (selectedIndex >= 0) {
            // Elimina el elemento seleccionado de la lista
            listaLibros.remove(selectedIndex);

            // Actualiza la tabla para reflejar la eliminación
            tblvTabla.setItems(listaLibros);
        } else {
            // Muestra un mensaje indicando que no hay nada seleccionado
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Advertencia!");
            alert.setHeaderText(null);
            alert.setContentText("No hay ningún elemento seleccionado.");
            alert.showAndWait();
        }
    }

    private void editarElemento() {
        // Obtiene el índice del elemento seleccionado
        int selectedIndex = tblvTabla.getSelectionModel().getSelectedIndex();

        // Verifica si hay un elemento seleccionado
        if (selectedIndex >= 0) {
            // Obtiene el libro seleccionado
            Libro libroSeleccionado = listaLibros.get(selectedIndex);

            // Obtiene los nuevos valores de los TextField
            String nuevoNombre = txtfNombreLibro.getText();
            String nuevoPrecio = "$"+txtfPrecio.getText();

            // Crea un nuevo objeto Libro con los nuevos valores
            Libro libroEditado = new Libro(nuevoNombre, nuevoPrecio);

            // Reemplaza el libro seleccionado en la lista con el libro editado
            listaLibros.set(selectedIndex, libroEditado);

            // Actualiza la tabla para reflejar la edición
            tblvTabla.setItems(listaLibros);
        } else {
            // Muestra un mensaje indicando que no hay nada seleccionado
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Advertencia!");
            alert.setHeaderText(null);
            alert.setContentText("No hay ningún elemento seleccionado.");
            alert.showAndWait();
        }
    }

    private void agregarElemento() {
        // Obtener los valores de los TextField
        String nombreLibro = txtfNombreLibro.getText();
        String precioLibro = "$"+txtfPrecio.getText();

        // Crear un nuevo objeto Libro con los valores obtenidos
        Libro nuevoLibro = new Libro(nombreLibro, precioLibro);

        // Agregar el nuevo libro a la lista de libros
        listaLibros.add(nuevoLibro);
    }

    private void limpiarCampos() {
        txtfNombreLibro.setText("");
        txtfPrecio.setText("");
    }
}