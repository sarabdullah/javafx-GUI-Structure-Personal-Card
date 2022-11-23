/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication2;


import javafx.application.Application;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 *
 * @author almso
 */
public class JavaFXApplication2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
          
        
        
        
                Text Name = new Text();
        Name.setText("sara abdullah almsoudi ");
       Name.setX(100);
      Name.setY(140);
        Name.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
       Name.setFill(Color.ALICEBLUE);
        
        
          Text major = new Text ();
        major.setText("a computer science student ");
        major.setX(50);
        major.setY(200);
        major.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        major.setFill(Color.AQUAMARINE);
        
      
    Group root = new Group(Name,major);
        Scene scene = new Scene(root,800,300);
        scene.setFill(Color.PINK);
        
        
        
        primaryStage.setTitle("Lab1_personal_Card");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
