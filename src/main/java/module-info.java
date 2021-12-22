module com.example.new_sl {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.new_sl to javafx.fxml;
    exports com.example.new_sl;
}