module com.example.snakegamefinalproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.snakegamefinalproject to javafx.fxml;
    exports com.example.snakegamefinalproject;
}