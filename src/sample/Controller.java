package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {


    @FXML
    private Button indlæsKnap;

    @FXML
    private TextField filnavnTextField;

    @FXML
    private ImageView fotoImageView;

    @FXML
    private ChoiceBox billederChoiceBox;

    @FXML
    void visBillede(ActionEvent event) {

        String billede = (String) billederChoiceBox.getValue();
        System.out.println("Viser " + billede);

        if (!billede.isEmpty() || !billede.isBlank()) {
            String filnavn = billede + ".jpg";
            filnavnTextField.setText(filnavn);
            Image image = new Image("billeder/" + filnavn);
            fotoImageView.setImage(image);

        }
    }

}
