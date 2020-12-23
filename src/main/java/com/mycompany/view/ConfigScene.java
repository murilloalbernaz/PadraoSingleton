/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view;

import com.mycompany.mavenproject9.App;
import com.mycompany.model.Config;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

public class ConfigScene extends AbstractScene {
    private final Config config =  Config.getInstance();
    public ConfigScene(App app) {
        super(app);
        var label = new Label("Formato de Relatorios");
        var fieldformatorelatorio = new TextField(config.getFormatRelatorios());
        var label1 = new Label("Tipo de Graficos");
        var fieldTipoGraficos = new TextField(config.getTipo());
        var btnOk = new Button("ok");
        setRoot(new VBox(label, fieldformatorelatorio, label1, fieldTipoGraficos, btnOk));
        btnOk.setOnAction(event -> {
            config.setFormatRelatorios(fieldformatorelatorio.getText());
            config.setTipo(fieldTipoGraficos.getText());
            app.setScene(new MainScene(app));
        });
    }

}
