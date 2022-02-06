import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


import java.lang.String;



public class App extends Application {
    static Double num;
    static Double num2;
    static String choice;
    public static void main(String[] args) {
        
        launch(args);
        
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");

        Rectangle rect = new Rectangle();
        Rectangle rect2 = new Rectangle();
        rect.setWidth(150);
        rect.setHeight(200);
        rect.setFill(Color.LIGHTBLUE);
        rect2.setX(25);
        rect2.setY(25);
        rect2.setWidth(150);
        rect2.setHeight(200);
        rect2.setFill(Color.LIGHTGREY);
        
        

        Button btn0 = new Button();
        Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        Button btn4 = new Button();
        Button btn5 = new Button();
        Button btn6 = new Button();
        Button btn7 = new Button();
        Button btn8 = new Button();
        Button btn9 = new Button();
        Button btnadd = new Button();
        Button btnsub = new Button();
        Button btnmult = new Button();
        Button btndiv = new Button();
        Button btnequal = new Button();
        btn0.setText("0");
        btn1.setText("1");
        btn2.setText("2");
        btn3.setText("3");
        btn4.setText("4");
        btn5.setText("5");
        btn6.setText("6");
        btn7.setText("7");
        btn8.setText("8");
        btn9.setText("9");
        btnequal.setText("=");
        btnadd.setText("+");
        btnsub.setText("-");
        btnmult.setText("X");
        btndiv.setText("/");
        
        
        btnadd.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                
                choice = "add";
                   
            }

        });

        btnsub.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {

                choice = "sub";;
            }

           
        });
        btndiv.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                choice = "div";
            }

           
        });
        btnmult.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                choice = "mult";
            }

           
        });

        btnequal.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent event) {
               
                operate();
            }
               
            
            

        
        });

        btn0.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                if(num != null){
                    num = 0.0;
                } else{
                    num2 = 0.0;
                }
                
                
            }
        
        });
        btn1.setOnAction(new EventHandler<ActionEvent>() {
 
            public void handle(ActionEvent event) {
                if (num != null){
                    num2 = 1.0;
                } else{
                    num = 1.0;
                }
                
            }

        });
       
        btn2.setOnAction(new EventHandler<ActionEvent>() {
 
            
            public void handle(ActionEvent event) {
                if (num != null){
                    num2 = 2.0;
                } else{
                    num = 2.0;
                }
                
                
            }

        
        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {
 
            public void handle(ActionEvent event) {
                if (num != null){
                    num2 = 3.0;
                } else{
                    num = 3.0;
                }
                
                
            }
        
        });
        btn4.setOnAction(new EventHandler<ActionEvent>() {
 
            public void handle(ActionEvent event) {
                if (num != null){
                    num2 = 4.0;
                } else{
                    num = 4.0;
                }
                
                
            }

        
        });
        btn5.setOnAction(new EventHandler<ActionEvent>() {
 
            public void handle(ActionEvent event) {
                if (num != null){
                    num2 = 5.0;
                } else{
                    num = 5.0;
                }
                
                
            }

        
        });
        btn6.setOnAction(new EventHandler<ActionEvent>() {
 
            public void handle(ActionEvent event) {
                if (num != null){
                    num2 = 6.0;
                } else{
                    num = 6.0;
                }
                
                
            }

        
        });
        btn7.setOnAction(new EventHandler<ActionEvent>() {
 
            public void handle(ActionEvent event) {
                if (num != null){
                    num2 =  7.0;
                } else{
                    num =  7.0;
                }
                
                
            }
        
        });
        btn8.setOnAction(new EventHandler<ActionEvent>() {
 
            public void handle(ActionEvent event) {
                if (num != null){
                    num2 = 8.0;
                } else{
                    num = 8.0;
                }
                
                
            }

        
        });
        btn9.setOnAction(new EventHandler<ActionEvent>() {
 
            public void handle(ActionEvent event) {
                if (num != null){
                    num2 = 9.0;
                } else{
                    num = 9.0;
                }
                
                
            }

        
        });


        StackPane root = new StackPane();

        root.getChildren().addAll(rect2);
        root.getChildren().addAll(rect);
        root.getChildren().add(btnadd);
        root.getChildren().add(btn0);
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        root.getChildren().add(btn5);
        root.getChildren().add(btn6);
        root.getChildren().add(btn7);
        root.getChildren().add(btn8);
        root.getChildren().add(btn9);
        root.getChildren().add(btnsub);
        root.getChildren().add(btndiv);
        root.getChildren().add(btnmult);
        root.getChildren().add(btnequal);
       
        
        btnsub.setTranslateX(50);
        btnsub.setTranslateY(25);
        btnadd.setTranslateX(50);
        btnadd.setTranslateY(50);
        btn0.setTranslateX(-25);
        btn0.setTranslateY(75);
        btn1.setTranslateX(-50);
        btn1.setTranslateY(50);
        btn2.setTranslateX(-25);
        btn2.setTranslateY(50);
        btn3.setTranslateX(0);
        btn3.setTranslateY(50);
        btn4.setTranslateX(-50);
        btn4.setTranslateY(25);
        btn5.setTranslateX(-25);
        btn5.setTranslateY(25);
        btn6.setTranslateX(0);
        btn6.setTranslateY(25);
        btn7.setTranslateX(-50);
        btn7.setTranslateY(0);
        btn8.setTranslateX(-25);
        btn8.setTranslateY(0);
        btn9.setTranslateX(0);
        btn9.setTranslateY(0);
        btnmult.setTranslateX(50);
        btnmult.setTranslateY(0);
        btndiv.setTranslateX(25);
        btndiv.setTranslateY(0);
        btnequal.setTranslateX(25);
        btnequal.setTranslateY(50);
        btnequal.setMaxHeight(75);

        
        primaryStage.setScene(new Scene(root, 1280, 720));
        

        primaryStage.show();

    }

    public void operate() {
        
        switch (choice) {
            case "add":
                num += num2;
                System.out.println(num);
                break;
            case "div":
                num /= num2;
                System.out.println(num);
                break;
            case "mult":
                num *= num2;
                System.out.println(num);
                break;
            case "sub":
                num -= num2;
                System.out.println(num);
                break;
        }

    }
    

}