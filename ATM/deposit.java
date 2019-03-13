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

import java.math.BigInteger;

public class deposit{
    private int dep=0;
    int entered[]=new int [100];
    int i=0;
    int count=0;
    balance balance=new balance();
    atm home;
    Scene scene;
    Stage stage;
    public deposit(Stage stage){
        this.stage=stage;


    }
    public void design(){
        Label amount=new Label("enter the amount to deposit ");
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
        Button back= new Button("back");
        GridPane grid = new GridPane();
        Alert info=new Alert(Alert.AlertType.INFORMATION);
        grid.add(amount, 5, 0);
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
        grid.add(back,9,15);
        scene = new Scene(grid, 600, 400);
        no0.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                if(i==99){
                    i=0;

                }

                entered[i]=0;
                count++;
                i++;
            }
        });
        no1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(i==99){
                    i=0;

                }
                entered[i]=1;
                count++;
                i++;

            }
        });
        no2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(i==99){
                    i=0;

                }
                entered[i]=2;
                count++;
                i++;

            }
        });
        no3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(i==99){
                    i=0;

                }
                entered[i]=3;
                count++;
                i++;

            }
        });
        no4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(i==99){
                    i=0;

                }
                entered[i]=4;
                count++;
                i++;

            }
        });
        no5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(i==99){
                    i=0;

                }
                entered[i]=5;
                count++;
                i++;

            }
        });
        no6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(i==99){
                    i=0;

                }
                entered[i]=6;
                count++;
                i++;

            }
        });
        no7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(i==99){
                    i=0;

                }
                entered[i]=7;
                count++;
                i++;
            }
        });
        no8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(i==99){
                    i=0;

                }
                entered[i]=8;
                count++;
                i++;
            }
        });
        no9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(i==99){
                    i=0;

                }
                entered[i]=9;
                count++;
                i++;

            }
        });
        enter.setOnAction(new EventHandler<ActionEvent>() {
            int j;
            public void handle(ActionEvent event) {
                i=i-1;
                for(j=0;j<count;j++){

                    dep=(int)(dep+entered[j]*(Math.pow(10.0,i)));
                    i--;


                }
                int k;
                int l;
                for (k=0;k<4;k++){

                   history.sethist(k,history.getHist()[k+1]);



                   }
                for (l=0;l<4;l++){

                    history.type[l]=history.type[l+1];



                }

                    history.sethist(4,dep);
                history.type[4]="deposited:";


                    ATM.balance.setCurrentbalance(1,dep);
                    info.setContentText(dep+" deposited succefully");
                    info.showAndWait();
                    home=new atm(stage);
                    home.design();
                    stage.setScene(home.getScene());
                    stage.show();



                }


            });


        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                home=new atm(stage);
                home.design();
                stage.setScene(home.getScene());
                stage.show();


            }
        });



    }


    public int getDep() {
        return this.dep;
    }

    public Scene getScene() {
        return this.scene;
    }
}