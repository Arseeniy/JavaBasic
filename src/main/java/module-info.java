module com.java_basic.javabasic_codingbat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.java_basic.javabasic_codingbat to javafx.fxml;
    exports com.java_basic.javabasic_codingbat;
}