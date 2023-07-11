module com.example.pharmacymangementproject {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.pharmacymangementproject to javafx.fxml;
    exports com.example.pharmacymangementproject;
    exports com.example.pharmacymangementproject.controller;
    opens com.example.pharmacymangementproject.controller to javafx.fxml;
}