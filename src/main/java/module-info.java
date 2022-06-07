module com.tarea.tarea2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tarea.tarea2 to javafx.fxml;
    exports com.tarea.tarea2;
}