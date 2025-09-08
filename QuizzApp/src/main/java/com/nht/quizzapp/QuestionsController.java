/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.nht.quizzapp;

import com.nht.pojo.Category;
import com.nht.pojo.Level;
import com.nht.services.CategoryServices;
import com.nht.services.LevelServices;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class QuestionsController implements Initializable {

    @FXML
    private ComboBox<Category> cbCates;
    @FXML
    private ComboBox<Level> cbLevels;

    private final static CategoryServices cateServices = new CategoryServices();
    private final static LevelServices levelServices = new LevelServices();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            cbCates.setItems(FXCollections.observableList(cateServices.getCates()));
            cbLevels.setItems(FXCollections.observableList(levelServices.getLevels()));
        } catch (SQLException ex) {
        }
    }
}
