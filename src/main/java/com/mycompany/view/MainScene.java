/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view;

import com.mycompany.mavenproject9.App;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;


public class MainScene extends AbstractScene {
    
    public MainScene(App app) {
        super(app);
        var btnRelatorios = new Button("Relatorios");
        var btnConfig = new Button("Configurações");
        setRoot(new TilePane(btnRelatorios,btnConfig));
        
        btnRelatorios.setOnAction(event -> app.setScene(new RelatotioScene(app)));
        btnConfig.setOnAction(event -> app.setScene(new ConfigScene(app)));
    }
    
}
