module com.nht.quizzapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires lombok;
    requires java.sql;

    opens com.nht.quizzapp to javafx.fxml;
    exports com.nht.quizzapp;
}
