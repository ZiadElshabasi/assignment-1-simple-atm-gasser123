package ATM;

import javafx.application.Application;
import javafx.stage.Stage;

public class mainatm extends Application {
pass pass;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        pass= new pass(primaryStage);
        pass.design();
        primaryStage.setScene(pass.getScene());
        primaryStage.show();


    }
}
