package controllers;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class MainContoller implements Initializable {
    @FXML
    private Button btnFees;

    @FXML
    private Button btnSettings;

    @FXML
    private Button btnStudents;

    @FXML
    private Button btnTeachers;

    @FXML
    private Button btnUsers;

    @FXML
    private Label lblStatus;

    @FXML
    private Pane pniStatus;

    @FXML
    private FontAwesomeIcon btnClose;

    @FXML
    private GridPane pnFees;

    @FXML
    private GridPane pnSettings;

    @FXML
    private GridPane pnStudents;

    @FXML
    private GridPane pnTeachers;

    @FXML
    private GridPane pnUsers;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void handleClicks(ActionEvent event){
        if(event.getSource()== btnStudents){
            lblStatus.setText("Students");
            pniStatus.setBackground(new Background(new BackgroundFill(Color.rgb(113,86,221), CornerRadii.EMPTY, Insets.EMPTY)));
            pnStudents.toFront();

        }else
        if(event.getSource()== btnTeachers){
            lblStatus.setText("Teachers");
            pniStatus.setBackground(new Background(new BackgroundFill(Color.rgb(43,63,99), CornerRadii.EMPTY, Insets.EMPTY)));
            pnTeachers.toFront();

        }else
        if(event.getSource()== btnFees){
            lblStatus.setText("Fees");
            pniStatus.setBackground(new Background(new BackgroundFill(Color.rgb(43,99,63), CornerRadii.EMPTY, Insets.EMPTY)));
            pnFees.toFront();

        }else
        if(event.getSource()== btnUsers){
            lblStatus.setText("Users");
            pniStatus.setBackground(new Background(new BackgroundFill(Color.rgb(99,43,63), CornerRadii.EMPTY, Insets.EMPTY)));
            pnUsers.toFront();


        }else
        if(event.getSource()== btnSettings){
            lblStatus.setText("Settings");
            pniStatus.setBackground(new Background(new BackgroundFill(Color.rgb(42,28,66), CornerRadii.EMPTY, Insets.EMPTY)));
            pnSettings.toFront();

        }
    }

    @FXML
    private void handleClose(MouseEvent event){
        if (event.getSource() == btnClose){
            System.exit(0);
        }
    }
}
