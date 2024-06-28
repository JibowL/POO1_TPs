module edu.unam.tablajavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires eu.hansolo.tilesfx;

    opens edu.unam.tablajavafx to javafx.fxml;
    opens edu.unam.tablajavafx.Models to javafx.base;
    exports edu.unam.tablajavafx;
    exports edu.unam.tablajavafx.Controllers;
    opens edu.unam.tablajavafx.Controllers to javafx.fxml;
}