module com.tarea.tarea2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.tarea.tarea2 to javafx.fxml;
    exports com.tarea.tarea2;
}
