/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investigacioncomplementaria;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author sanch
 */
public class SumaJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Bienvenidos a JavaFX");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Text scenetitle = new Text("Suma de dos numeros");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        
        Label primerValor = new Label("1er Valor:");
        grid.add(primerValor, 0, 1);
        final TextField primerValorTextField = new TextField();
        grid.add(primerValorTextField, 1, 1);
        
        Label segundoValor = new Label("2do Valor:");
        grid.add(segundoValor, 0, 2);
        
        final TextField segundoValorTextField = new TextField();
        grid.add(segundoValorTextField, 1, 2);
        
        Button btn = new Button("Sumar");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 0, 6);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                double suma = Double.parseDouble(primerValorTextField.getText()) + Double.parseDouble(segundoValorTextField.getText());
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("La suma de " + primerValorTextField.getText() + " y "
                 + segundoValorTextField.getText() + " es: " + suma);
            }
        });
        Scene scene = new Scene(grid, 300, 275);
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
