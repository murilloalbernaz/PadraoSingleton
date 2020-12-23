package com.mycompany.view;

import com.mycompany.mavenproject9.App;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author murillo
 */
public abstract class AbstractScene extends Scene {
    
    public AbstractScene(App app) {
     super(new TilePane(), 640, 480);
    }
    
}
