module com.example.findthenprimenumbers {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.findthenprimenumbers to javafx.fxml;
    exports com.example.findthenprimenumbers;
}