module com.taydev.libram {
    requires javafx.controls;
    requires javafx.fxml;
    
    exports com.taydev.libram;
    opens com.taydev.libram to javafx.graphics, javafx.fxml;
}