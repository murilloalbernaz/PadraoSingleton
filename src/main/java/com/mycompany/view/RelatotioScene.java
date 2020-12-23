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
import javafx.scene.layout.TilePane;

public class RelatotioScene extends AbstractScene {
    private final Config config = Config.getInstance();
    public RelatotioScene(App app) {
        super(app);
        var label = new Label("Formato de Relatorios= "+ config.getFormatRelatorios());
        var btnvoltar = new Button("Voltar");
        setRoot(new TilePane(label, btnvoltar));
        btnvoltar.setOnAction(event -> app.setScene(new MainScene(app)));
    }

}
