package ATM;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class atm{
    Scene scene;
    Stage stage;
    with with;
    deposit depos;
    pass pass;

    int k=5;
public atm(Stage stage){
    this.stage=stage;


}
    public void design(){
        Button deposit=new Button("deposit");
        Button withdraw=new Button("withdraw");
        Button balance=new Button("show balance");
        Button next=new Button("next");
        Button prev=new Button("previous");
        Button txt=new Button("exit");
        Label info=new Label();
        GridPane grid=new GridPane();
        grid.add(deposit,2,2);
        grid.add(withdraw,5,2);
        grid.add(balance,8,2);
        grid.add(next,5,5);
        grid.add(prev,8,5);
        grid.add(txt,6,7);
        grid.add(info,6,10);
         scene=new Scene(grid,400,200);
         withdraw.setOnAction(new EventHandler<ActionEvent>() {

             public void handle(ActionEvent event) {
                with=new with(stage);
              with.design();
              stage.setScene(with.getScene());
              stage.show();
             }
         });
       deposit.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               depos=new deposit(stage);
               depos.design();
               stage.setScene(depos.getScene());
               stage.show();

           }
       });

       balance.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               info.setText("balance: "+ ATM.balance.getCurrentbalance());

           }
       });
       txt.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               pass=new pass(stage);
               pass.design();
               stage.setScene(pass.getScene());
               stage.show();
           }
       });
       next.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
            k++;
            if(k<5){
                info.setText(history.type[k]+history.getHist()[k]);


            }else{

                k--;

            }

           }
       });
       prev.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
           k--;
           if (k<0){

               k=0;

           }
               if(history.type[k]==null && history.getHist()[k]==0) {
                   k++;


               }else if(k>=0) {
                   info.setText(history.type[k]+history.getHist()[k]);
               }else{

               k=0;
           }


           }
       });

    }

    public Scene getScene() {
        return this.scene;
    }
}
