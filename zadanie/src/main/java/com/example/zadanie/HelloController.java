package com.example.zadanie;
import java.util.regex.*;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label result;
    @FXML
    private TextArea text;
    @FXML
    private TextField regex;


    @FXML
    protected void onCheck() {
        boolean isCorrect = Pattern.matches(regex.getText(), text.getText());
        String correct = isCorrect ? "OK" : "NG";

        result.setText(correct);
    }
}