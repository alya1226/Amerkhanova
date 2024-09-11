package com.example.kalkulator;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.DoubleToIntFunction;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HelloController {
double x,y,c;
    final KeyCombination keyComb = new KeyCodeCombination(KeyCode.N,
            KeyCombination.CONTROL_DOWN);

    @FXML
    private AnchorPane olo;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label otvet;

    @FXML
    private TextField vvod1;

    @FXML
    private TextField vvod2;

    @FXML
    void onU(ActionEvent event) {
        x = Double.parseDouble(vvod1.getText());
        y = Double.parseDouble(vvod2.getText());
        c = x*y;
        otvet.setText(String.valueOf((int)c));
    }
    @FXML
    void onInstr(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Инструкция");
        alert.setHeaderText("Как пользоваться калькулятором");
        alert.setContentText("Для того чтобы вычислить значения, нужно ввести в нужные строчки\n" +
                "значения и выбрать нужный знак вычисления в Menubar или на кнопки");
        alert.showAndWait();
    }

    @FXML
    void onInfo(ActionEvent event) {
        FXMLLoader fxmlLoader2 = new FXMLLoader(info.class.getResource("info.fxml"));
        Scene scene2 = null;
        try {
            scene2 = new Scene(fxmlLoader2.load(), 600, 400);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        Stage stage2 = new Stage();
        stage2.setTitle("Информация");
        stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.setOpacity(1);
        stage2.setScene(scene2);
        stage2.show();
    }

    @FXML
    void onP(ActionEvent event) {
        x = Double.parseDouble(vvod1.getText());
        y = Double.parseDouble(vvod2.getText());
        c = x + y;
        otvet.setText(String.valueOf((int) c));
    }

    @FXML
    void onM(ActionEvent event) {
        x = Double.parseDouble(vvod1.getText());
        y = Double.parseDouble(vvod2.getText());
        c = x-y;
        otvet.setText(String.valueOf((int)c));
    }

    @FXML
    void onR(ActionEvent event) {
        x = Double.parseDouble(vvod1.getText());
        y = Double.parseDouble(vvod2.getText());
        c = x/y;
        otvet.setText(String.valueOf(c));
    }

    @FXML
    void onVihod(ActionEvent event) {
        System.exit(1);
    }

    @FXML
    void onExit(ActionEvent event) {
System.exit(1);
    }

    @FXML
    void onKEY(KeyEvent event) {

    }
    public class Launcher {
        private static Launcher MainGUI;

        public static void main(String[] args) {
            MainGUI.main(args);
        }
    }

    @FXML
    void onMn(ActionEvent event) {
        x = Double.parseDouble(vvod1.getText());
        y = Double.parseDouble(vvod2.getText());
        c = x-y;
        otvet.setText(String.valueOf((int)c));
    }

    @FXML
    void onMult(ActionEvent event) {
        x = Double.parseDouble(vvod1.getText());
        y = Double.parseDouble(vvod2.getText());
        c = x*y;
        otvet.setText(String.valueOf((int)c));
    }

    @FXML
    void onPlus(ActionEvent event) {
        x = Double.parseDouble(vvod1.getText());
        y = Double.parseDouble(vvod2.getText());
        c = x + y;
        otvet.setText(String.valueOf((int) c));
    }

public void onKEY() {
        olo.setOnKeyPressed(e -> {
            if ((e.getCode() == KeyCode.P)) {
                x = Double.parseDouble(vvod1.getText());
                y = Double.parseDouble(vvod2.getText());
                c = x + y;
                otvet.setText(String.valueOf((int) c));
            }
            if ((e.getCode() == KeyCode.M)) {
                x = Double.parseDouble(vvod1.getText());
                y = Double.parseDouble(vvod2.getText());
                c = x - y;
                otvet.setText(String.valueOf((int) c));
            }
            if ((e.getCode() == KeyCode.U)) {
                x = Double.parseDouble(vvod1.getText());
                y = Double.parseDouble(vvod2.getText());
                c = x * y;
                otvet.setText(String.valueOf((int) c));
            }
            if ((e.getCode() == KeyCode.R)) {
                x = Double.parseDouble(vvod1.getText());
                y = Double.parseDouble(vvod2.getText());
                c = x / y;
                otvet.setText(String.valueOf(c));
            }
            if (keyComb.match(e)) {
FXMLLoader fxmlLoader2 = new FXMLLoader(info.class.getResource("info.fxml"));
                Scene scene2 = null;
                try {
                    scene2 = new Scene(fxmlLoader2.load(), 600, 400);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                Stage stage2 = new Stage();
stage2.setTitle("Информация");
stage2.initModality(Modality.APPLICATION_MODAL);
                stage2.setOpacity(1);
                stage2.setScene(scene2);
                stage2.show();
            }
        });
}
    @FXML
    void onRd(ActionEvent event) {
        x = Double.parseDouble(vvod1.getText());
        y = Double.parseDouble(vvod2.getText());
        c = x/y;
        otvet.setText(String.valueOf(c));
    }

    @FXML
    void initialize() {
        assert otvet != null : "fx:id=\"otvet\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert vvod1 != null : "fx:id=\"vvod1\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert vvod2 != null : "fx:id=\"vvod2\" was not injected: check your FXML file 'hello-view.fxml'.";
onKEY();
    }

}
