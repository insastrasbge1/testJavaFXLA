/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.beuvron.testjavafxla;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author francois
 */
public class BoiteACoucou extends BorderPane {
    
    private TextField jtfNom;
    private Button jbCoucou;
    private Button jbSalut;
    private TextArea jtaMessage;
    
    public BoiteACoucou() {
        this.jtfNom = new TextField();
        this.jtfNom.setMinWidth(50);
        this.setTop(this.jtfNom);
    }
    
}
