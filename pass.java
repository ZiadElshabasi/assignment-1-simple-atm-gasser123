package ATM;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class pass{
    int [] pin={1,2,3,4};
    int[] entered=new int[5];
    int i= 0;
Scene scene;
  Stage stage;
  atm home;
public pass(Stage stage){

    this.stage=stage;

}
    public void design() {
    //password is 1234
        Label password = new Label("enter the password ");
        Button no1 = new Button("1");
        Button no2 = new Button("2");
        Button no3 = new Button("3");
        Button no4 = new Button("4");
        Button no5 = new Button("5");
        Button no6 = new Button("6");
        Button no7 = new Button("7");
        Button no8 = new Button("8");
        Button no9 = new Button("9");
        Button no0 = new Button("0");
        Button enter=new Button("enter");
        GridPane grid = new GridPane();
        Alert error = new Alert(Alert.AlertType.INFORMATION);
        grid.add(password, 5, 0);
        grid.add(no1, 7, 5);
        grid.add(no2, 8, 5);
        grid.add(no3, 9, 5);
        grid.add(no4, 7, 6);
        grid.add(no5, 8, 6);
        grid.add(no6, 9, 6);
        grid.add(no7, 7, 7);
        grid.add(no8, 8, 7);
        grid.add(no9, 9, 7);
        grid.add(no0, 8, 8);
        grid.add(enter,12,6);
        scene = new Scene(grid, 600, 400);
        no0.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                if(i>4){

                 i=0;




             }
             entered[i]=0;
                i++;
            }
        });
        no1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(i>4){

                    i=0;


                }
                entered[i]=1;
                i++;

            }
        });
        no2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(i>4){

                    i=0;

                }
                entered[i]=2;
                i++;

            }
        });
        no3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(i>4){

                    i=0;

                }
                entered[i]=3;
                i++;

            }
        });
        no4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(i>4){

                    i=0;

                }
                entered[i]=4;
i++;

            }
        });
        no5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(i>4){

                    i=0;


                }
                entered[i]=5;
                i++;

            }
        });
        no6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(i>4){

                    i=0;


                }
                entered[i]=6;
                i++;

            }
        });
        no7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(i>4){

                    i=0;



                }
                entered[i]=7;
                i++;
            }
        });
        no8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(i>4){

                    i=0;


                }
                entered[i]=8;
                i++;
            }
        });
        no9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(i>4){

                    i=0;


                }
                entered[i]=9;
                i++;

            }
        });
        enter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int j;
                int count=0;
                for(j=0;j<4;j++){

                    if (entered[j]==pin[j]){

                        count++;

                    }



                }
              if (i==4 && count==4){

              home=new atm(stage);
              home.design();
              stage.setScene(home.getScene());
              stage.show();

              }else if(i<4 || i>4){
                  error.setContentText("password contains 4 numbers pls re-enter");
                  error.showAndWait();
                  i=0;
                  count=0;


              }else{
                  error.setContentText("u entered a wrong password");
                  error.showAndWait();

              }



            }

        });


    }

    public Scene getScene() {
        return this.scene;
    }
}