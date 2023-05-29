module com.example.week4strings {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week4strings to javafx.fxml;
    exports com.example.week4strings;
}