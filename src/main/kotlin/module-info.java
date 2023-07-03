module com.uzdev.endoscopy {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.desktop;

    exports com.uzdev.endoscopy.esophagus;
    opens com.uzdev.endoscopy to javafx.fxml;
    opens com.uzdev.endoscopy.esophagus to javafx.fxml;
    opens com.uzdev.endoscopy.stomach to javafx.fxml;
    opens com.uzdev.endoscopy.op_stomach to javafx.fxml;
    opens com.uzdev.endoscopy.duodenum to javafx.fxml;

    exports com.uzdev.endoscopy;
}