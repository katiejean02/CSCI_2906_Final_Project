import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.io.FilterInputStream;
import java.io.FileOutputStream;


public class battleshipPlayer2 extends Application{
   double startx;
   double starty;
   String point = "";
   //Double[] doubles;
   Double[] check = new Double[12];
   String doubles = "";
   
   TextArea tA = new TextArea();

    @Override
    public void start(Stage primaryStage){
     
 
      Polygon p1 = new Polygon();
         p1.getPoints().addAll(new Double[]{
            25.0, 25.0,
            50.0, 35.0,
            100.0, 35.0,
            125.0, 25.0,
            100.0, 15.0,
            50.0, 15.0,
         });
      
       Polygon p2 = new Polygon();
         p2.getPoints().addAll(new Double[]{
            200.0, 15.0,
            190.0, 35.0,
            190.0, 75.0,
            200.0, 95.0,
            210.0, 75.0,
            210.0, 35.0,
         });
         Polygon p3 = new Polygon();
         p3.getPoints().addAll(new Double[]{
            300.0, 50.0,
            350.0, 70.0,
            450.0, 70.0,
            500.0, 50.0,
            450.0, 30.0,
            350.0, 30.0,
         });
        
        Button sb = new Button("A1");
        Button sb1 = new Button("A2");
        Button sb2 = new Button("A3");
        Button sb3 = new Button("A4");
        Button sb4 = new Button("A5");
        Button sb5 = new Button("A6");
        Button sb6 = new Button("A7");
        Button sb7 = new Button("A8");
        Button sb8 = new Button("A9");
        Button sb9 = new Button("A10");
        Button sb10 = new Button("B1");
        Button sb11 = new Button("B2");
        Button sb12 = new Button("B3");
        Button sb13 = new Button("B4");
        Button sb14 = new Button("B5");
        Button sb15 = new Button("B6");
        Button sb16 = new Button("B7");
        Button sb17 = new Button("B8");
        Button sb18 = new Button("B9");
        Button sb19 = new Button("B10");
        Button sb20 = new Button("C1");
        Button sb21 = new Button("C2");
        Button sb22 = new Button("C3");
        Button sb23 = new Button("C4");
        Button sb24 = new Button("C5");
        Button sb25 = new Button("C6");
        Button sb26 = new Button("C7");
        Button sb27 = new Button("C8");
        Button sb28 = new Button("C9");
        Button sb29 = new Button("C10");
        Button sb30 = new Button("D1");
        Button sb31 = new Button("D2");
        Button sb32 = new Button("D3");
        Button sb33= new Button("D4");
        Button sb34 = new Button("D5");
        Button sb35 = new Button("D6");
        Button sb36 = new Button("D7");
        Button sb37 = new Button("D8");
        Button sb38 = new Button("D9");
        Button sb39 = new Button("D10");
        Button sb40 = new Button("E1");
        Button sb41 = new Button("E2");
        Button sb42 = new Button("E3");
        Button sb43 = new Button("E4");
        Button sb44 = new Button("E5");
        Button sb45 = new Button("E6");
        Button sb46 = new Button("E7");
        Button sb47 = new Button("E8");
        Button sb48 = new Button("E9");
        Button sb49 = new Button("E10");

        
        sb.setId("A1");
        sb1.setId("A2");
        sb2.setId("A3");
        sb3.setId("A4");
        sb4.setId("A5");
        sb5.setId("A6");
        sb6.setId("A8");
        sb7.setId("A9");
        sb8.setId("A10");
        sb9.setId("B1");
        sb10.setId("B2");
        sb11.setId("B3");
        sb12.setId("B4");
        sb13.setId("B5");
        sb14.setId("B6");
        sb15.setId("B7");
        sb16.setId("B8");
        sb17.setId("B9");
        sb18.setId("B10");
        sb19.setId("C1");
        sb20.setId("C2");
        sb21.setId("C3");
        sb22.setId("C4");
        sb23.setId("C5");
        sb24.setId("C6");
        sb25.setId("C7");
        sb26.setId("C8");
        sb27.setId("C9");
        sb28.setId("C10");
        sb29.setId("D1");
        sb30.setId("D2");
        sb31.setId("D3");
        sb32.setId("D4");
        sb33.setId("D5");
        sb34.setId("D6");
        sb35.setId("D7");
        sb36.setId("D8");
        sb37.setId("D9");
        sb38.setId("D10");
        sb39.setId("E1");
        sb40.setId("E2");
        sb41.setId("E3");
        sb42.setId("E4");
        sb43.setId("E5");
        sb44.setId("E6");
        sb45.setId("E7");
        sb46.setId("E8");
        sb47.setId("E9");
        sb48.setId("E10");

        GridPane gp = new GridPane();
        gp.setGridLinesVisible(true);
        gp.add(sb,0,0);
        gp.add(sb1,1,0);
        gp.add(sb2,2,0);
        gp.add(sb3,3,0);
        gp.add(sb4,4,0);
        gp.add(sb5,5,0);
        gp.add(sb6,6,0);
        gp.add(sb7,7,0);
        gp.add(sb8,8,0);
        gp.add(sb9,9,0);
        gp.add(sb10,0,1);
        gp.add(sb11,1,1);
        gp.add(sb12,2,1);
        gp.add(sb13,3,1);
        gp.add(sb14,4,1);
        gp.add(sb15,5,1);
        gp.add(sb16,6,1);
        gp.add(sb17,7,1);
        gp.add(sb18,8,1);
        gp.add(sb19,9,1);
        gp.add(sb20,0,2);
        gp.add(sb21,1,2);
        gp.add(sb22,2,2);
        gp.add(sb23,3,2);
        gp.add(sb24,4,2);
        gp.add(sb25,5,2);
        gp.add(sb26,6,2);
        gp.add(sb27,7,2);
        gp.add(sb28,8,2);
        gp.add(sb29,9,2);
        gp.add(sb30,0,3);
        gp.add(sb31,1,3);
        gp.add(sb32,2,3);
        gp.add(sb33,3,3);
        gp.add(sb34,4,3);
        gp.add(sb35,5,3);
        gp.add(sb36,6,3);
        gp.add(sb37,7,3);
        gp.add(sb38,8,3);
        gp.add(sb39,9,3);
        gp.add(sb40,0,4);
        gp.add(sb41,1,4);
        gp.add(sb42,2,4);
        gp.add(sb43,3,4);
        gp.add(sb44,4,4);
        gp.add(sb45,5,4);
        gp.add(sb46,6,4);
        gp.add(sb47,7,4);
        gp.add(sb48,8,4);
        gp.add(sb49,9,4);
      
       
        VBox root = new VBox();
        root.setSpacing(0);
        root.setPadding(new Insets(10));
        String[][] myArray = new String[5][10];
        for(int row = 0; row < 6; row++){
            HBox hbox = new HBox();
            hbox.setSpacing(0);
               for(int col = 1; col < 11; col++){
                  if(row == 0){
                  Label label = new Label("A" + col);
                  label.setPrefSize(60,40);
                  label.setStyle("-fx-border-color: black; -fx-alignment: center;");
                  label.setId("A" + col);
                  hbox.getChildren().add(label);
                  }
                  else if(row == 1){
                     Label label = new Label("B" + col);
                  label.setPrefSize(60,40);
                  label.setStyle("-fx-border-color: black; -fx-alignment: center;");
                  label.setId("B" + col);
                  hbox.getChildren().add(label);
                  }
                  else if(row == 3){
                     Label label = new Label("C" + col);
                  label.setPrefSize(60,40);
                  label.setStyle("-fx-border-color: black; -fx-alignment: center;");
                  label.setId("C" + col);
                  hbox.getChildren().add(label);
                  }
                  else if(row == 4){
                     Label label = new Label("D" + col);
                  label.setPrefSize(60,40);
                  label.setStyle("-fx-border-color: black; -fx-alignment: center;");
                  label.setId("D" + col);
                  hbox.getChildren().add(label);
                  }
                  else if(row == 5){
                     Label label = new Label("E" + col);
                  label.setPrefSize(60,40);
                  label.setStyle("-fx-border-color: black; -fx-alignment: center;");
                  label.setId("E" + col);
                  hbox.getChildren().add(label);
                  }
                  
        }
            root.getChildren().add(hbox);
        }
       
      Button start = new Button("Start");
      ToggleButton finish = new ToggleButton("Finish");
      
      File file = new File("battleshipPlayer1.txt");
      
      sb.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
            while(input1.hasNext()){
               doubles += input1.nextLine() + " ";
            }
             String[] points = doubles.split("\\s+");
             for(int i =0; i < check.length; i++){
               check[i] = Double.parseDouble(points[i]);
             } 
               if(check[0] >= 11.00 && check[1] >= 43.00 && check[2]<= 43.00 && check[3] <= 59.0 || check[4] >= 11.00 && check[5] >= 43.0 && check[6] <= 43.0 && check[7] <= 59.0 ||check[8] >= 11.00 && check[9] >= 43.0 && check[10] <= 43.0 && check[11] <= 59.0){
                  tA.setText("YOU GOT A HIT!");
               }else{
                  tA.setText("YOU MISSED ):" );
               }
         }
            catch(Exception ex){
               ex.printStackTrace();
      }
      sb.setDisable(true);
    });
      sb1.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
           
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  check[i] = Double.parseDouble(points[i]);
                }
                  
                  if(check[0] >= 46.0 && check[1] >= 43.0 && check[2]<= 78.0 && check[3] <= 60.0 || check[4] >= 46.0 && check[5] >= 43.0 && check[6] <= 78.0 && check[7] <= 60.0 ||check[8] >= 46.00 && check[9] >= 43.0 && check[10] <= 78.0 && check[11] <= 60.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb1.setDisable(true);
       });
         
      sb2.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  check[i] = Double.parseDouble(points[i]);
                }
                  
                  if(check[0] >= 80.0 && check[1] >= 43.0 && check[2]<= 113.0 && check[3] <= 61.0 || check[4] >= 80.0 && check[5] >= 43.0 && check[6] <= 113.0 && check[7] <= 61.0 ||check[8] >= 80.0 && check[9] >= 43.0 && check[10] <= 113.0 && check[11] <= 61.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb2.setDisable(true);
       });
         

      sb3.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  check[i] = Double.parseDouble(points[i]);
                }
                  
                  if(check[0] >= 115.0 && check[1] >= 43.0 && check[2]<= 145.0 && check[3] <= 60.0 || check[4] >= 115.0 && check[5] >= 43.0 && check[6] <= 145.0 && check[7] <= 60.0 ||check[8] >= 115.0 && check[9] >= 43.0 && check[10] <= 145.0 && check[11] <= 60.0 ){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb3.setDisable(true);
       });
      sb4.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  check[i] = Double.parseDouble(points[i]);
                }
                  
                  if(check[0] >= 150.0 && check[1] >= 43.0 && check[2]<= 180.0 && check[3] <= 60.0 || check[4] >= 150.0 && check[5] >= 43.0 && check[6] <= 180.0 && check[7] <= 60.0 ||check[8] >= 150.0 && check[9] >= 43.0 && check[10] <= 180.0 && check[11] <= 60.0 ){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb4.setDisable(true);
       });
         

      sb5.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 186.0 && check[1] >= 43.0 && check[2]<= 218.0 && check[3] <= 60.0 || check[4] >= 186.0 && check[5] >= 43.0 && check[6] <= 218.0 && check[7] <= 60.0 ||check[8] >= 186.0 && check[9] >= 43.0 && check[10] <= 218.0 && check[11] <= 60.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb5.setDisable(true);
       });
      sb6.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 221.0 && check[1] >= 43.0 && check[2]<= 253.0 && check[3] <= 60.0 || check[4] >= 221.0 && check[5] >= 43.0 && check[6] <= 253.0 && check[7] <= 60.0 ||check[8] >= 221.0 && check[9] >= 43.0 && check[10] <= 253.0 && check[11] <= 60.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb6.setDisable(true);
       });
      sb7.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 256.0 && check[1] >= 43.0 && check[2]<= 288.0 && check[3] <= 60.0 || check[4] >= 256.0 && check[5] >= 43.0 && check[6] <= 288.0 && check[7] <= 60.0 ||check[8] >= 256.0 && check[9] >= 43.0 && check[10] <= 288.0 && check[11] <= 60.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb7.setDisable(true);
       });
      sb8.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 290.0 && check[1] >= 43.0 && check[2]<= 324.0 && check[3] <= 60.0 || check[4] >= 290.0 && check[5] >= 43.0 && check[6] <= 324.0 && check[7] <= 60.0 ||check[8] >= 290.0 && check[9] >= 43.0 && check[10] <= 324.0 && check[11] <= 60.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb7.setDisable(true);
       });
      sb8.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 327.0 && check[1] >= 43.0 && check[2]<= 357.0 && check[3] <= 60.0 || check[4] >= 327.0 && check[5] >= 43.0 && check[6] <= 357.0 && check[7] <= 60.0 ||check[8] >= 327.0 && check[9] >= 43.0 && check[10] <= 357.0 && check[11] <= 60.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb8.setDisable(true);
       });
      sb9.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 12.0 && check[1] >= 62.0 && check[2]<= 43.0 && check[3] <= 78.0 || check[4] >= 12.0 && check[5] >= 62.0 && check[6] <= 43.0 && check[7] <= 78.0 ||check[8] >= 12.0 && check[9] >= 62.0 && check[10] <= 43.0 && check[11] <= 78.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb9.setDisable(true);
       });
      sb10.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  check[i] = Double.parseDouble(points[i]);
                }
                  
                  if(check[0] >= 46.0 && check[1] >= 62.0 && check[2]<= 78.0 && check[3] <= 78.0 || check[4] >= 46.0 && check[5] >= 62.0 && check[6] <= 78.0 && check[7] <= 78.0 ||check[8] >= 46.0 && check[9] >= 62.0 && check[10] <= 78.0 && check[11] <= 78.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb10.setDisable(true);
       });
      sb11.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  check[i] = Double.parseDouble(points[i]);
                }
                  
                  if(check[0] >= 81.0 && check[1] >= 62.0 && check[2]<= 114.0 && check[3] <= 82.0 || check[4] >= 81.0 && check[5] >= 62.0 && check[6] <= 114.0 && check[7] <= 82.0 ||check[8] >= 81.0 && check[9] >= 62.0 && check[10] <= 81.0 && check[11] <= 82.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb11.setDisable(true);
       });
      sb12.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  check[i] = Double.parseDouble(points[i]);
                }
                  
                  if(check[0] >= 116.0 && check[1] >= 62.0 && check[2]<= 149.0 && check[3] <= 82.0 || check[4] >= 116.0 && check[5] >= 62.0 && check[6] <= 149.0 && check[7] <= 82.0 ||check[8] >= 116.0 && check[9] >= 62.0 && check[10] <= 149.0 && check[11] <= 82.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb12.setDisable(true);
       });
      sb13.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  check[i] = Double.parseDouble(points[i]);
                }
                  
                  if(check[0] >= 151.0 && check[1] >= 62.0 && check[2]<= 183.0 && check[3] <= 82.0 || check[4] >= 151.0 && check[5] >= 62.0 && check[6] <= 183.0 && check[7] <= 82.0 ||check[8] >= 151.0 && check[9] >= 62.0 && check[10] <= 183.0 && check[11] <= 82.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb13.setDisable(true);
       });
      sb14.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  check[i] = Double.parseDouble(points[i]);
                }
                  
                  if(check[0] >= 186.0 && check[1] >= 62.0 && check[2]<= 219.0 && check[3] <= 82.0 || check[4] >= 186.0 && check[5] >= 62.0 && check[6] <= 219.0 && check[7] <= 82.0 ||check[8] >= 186.0 && check[9] >= 62.0 && check[10] <= 219.0 && check[11] <= 82.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb14.setDisable(true);
       });
      sb15.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  check[i] = Double.parseDouble(points[i]);
                }
                  
                  if(check[0] >= 222.0 && check[1] >= 62.0 && check[2]<= 254.0 && check[3] <= 84.0 || check[4] >= 222.0 && check[5] >= 62.0 && check[6] <= 254.0 && check[7] <= 84.0 ||check[8] >= 222.0 && check[9] >= 62.0 && check[10] <= 254.0 && check[11] <= 84.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb15.setDisable(true);
       });
      sb16.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  check[i] = Double.parseDouble(points[i]);
                }
                  
                  if(check[0] >= 256.0 && check[1] >= 62.0 && check[2]<= 289.0 && check[3] <= 84.0 || check[4] >= 256.0 && check[5] >= 62.0 && check[6] <= 289.0 && check[7] <= 84.0 ||check[8] >= 256.0 && check[9] >= 62.0 && check[10] <= 289.0 && check[11] <= 84.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb16.setDisable(true);
       });
      sb17.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 291.0 && check[1] >= 62.0 && check[2]<= 323.0 && check[3] <= 82.0 || check[4] >= 291.0 && check[5] >= 62.0 && check[6] <= 323.0 && check[7] <= 82.0 ||check[8] >= 291.0 && check[9] >= 62.0 && check[10] <= 323.0 && check[11] <= 82.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb17.setDisable(true);
       });
      sb18.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                } 
                  if(check[0] >= 326.0 && check[1] >= 62.0 && check[2]<= 358.0 && check[3] <= 82.0 || check[4] >= 326.0 && check[5] >= 62.0 && check[6] <= 358.0 && check[7] <= 82.0 ||check[8] >= 326.0 && check[9] >= 62.0 && check[10] <= 358.0 && check[11] <= 82.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb18.setDisable(true);
       });
      sb19.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  check[i] = Double.parseDouble(points[i]);
                }
                  
                  if(check[0] >= 11.0 && check[1] >= 81.0 && check[2]<= 43.0 && check[3] <= 99.0 || check[4] >= 11.0 && check[5] >= 81.0 && check[6] <= 43.0 && check[7] <= 99.0 ||check[8] >= 11.0 && check[9] >= 81.0 && check[10] <= 43.0 && check[11] <= 99.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb19.setDisable(true);
       });
      sb20.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 46.0 && check[1] >= 81.0 && check[2]<= 79.0 && check[3] <= 99.0 || check[4] >= 46.0 && check[5] >= 81.0 && check[6] <= 79.0 && check[7] <= 99.0 ||check[8] >= 46.0 && check[9] >= 81.0 && check[10] <= 79.0 && check[11] <= 99.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb20.setDisable(true);
       });
      sb21.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 81.0 && check[1] >= 85.0 && check[2]<= 113.0 && check[3] <= 102.0 || check[4] >= 81.0 && check[5] >= 85.0 && check[6] <= 113.0 && check[7] <= 102.0 ||check[8] >= 81.0 && check[9] >= 85.0 && check[10] <= 113.0 && check[11] <= 102.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb21.setDisable(true);
       });
      sb22.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 116.0 && check[1] >= 86.0 && check[2]<= 148.0 && check[3] <= 103.0 || check[4] >= 116.0 && check[5] >= 86.0 && check[6] <= 148.0 && check[7] <= 103.0 ||check[8] >= 116.0 && check[9] >= 86.0 && check[10] <= 148.0 && check[11] <= 103.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb22.setDisable(true);
       });
      sb23.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 151.0 && check[1] >= 85.0 && check[2]<= 183.0 && check[3] <= 104.0 || check[4] >= 151.0 && check[5] >= 85.0 && check[6] <= 183.0 && check[7] <= 104.0 ||check[8] >= 151.0 && check[9] >= 85.0 && check[10] <= 183.0 && check[11] <= 104.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb23.setDisable(true);
       });
      sb24.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 186.0 && check[1] >= 85.0 && check[2]<= 218.0 && check[3] <= 103.0 || check[4] >= 186.0 && check[5] >= 85.0 && check[6] <= 218.0 && check[7] <= 103.0 ||check[8] >= 186.0 && check[9] >= 85.0 && check[10] <= 218.0 && check[11] <= 103.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb24.setDisable(true);
       });
      sb25.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 222.0 && check[1] >= 85.0 && check[2]<= 253.0 && check[3] <= 103.0 || check[4] >= 222.0 && check[5] >= 85.0 && check[6] <= 253.0 && check[7] <= 103.0 ||check[8] >= 222.0 && check[9] >= 85.0 && check[10] <= 253.0 && check[11] <= 103.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb25.setDisable(true);
       });
      sb26.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 256.0 && check[1] >= 86.0 && check[2]<= 288.0 && check[3] <= 103.0 || check[4] >= 256.0 && check[5] >= 86.0 && check[6] <= 288.0 && check[7] <= 103.0 ||check[8] >= 256.0 && check[9] >= 86.0 && check[10] <= 288.0 && check[11] <= 103.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb26.setDisable(true);
       });
      sb27.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 291.0 && check[1] >= 85.0 && check[2]<= 323.0 && check[3] <= 102.0 || check[4] >= 291.0 && check[5] >= 85.0 && check[6] <= 323.0 && check[7] <= 102.0 ||check[8] >= 291.0 && check[9] >= 85.0 && check[10] <= 323.0 && check[11] <= 102.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb27.setDisable(true);
       });
      sb28.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 326.0 && check[1] >= 85.0 && check[2]<= 358.0 && check[3] <= 102.0 || check[4] >= 326.0 && check[5] >= 85.0 && check[6] <= 358.0 && check[7] <= 102.0 ||check[8] >= 326.0 && check[9] >= 85.0 && check[10] <= 358.0 && check[11] <= 102.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb28.setDisable(true);
       });
      sb29.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 12.0 && check[1] >= 100.0 && check[2]<= 44.0 && check[3] <= 118.0 || check[4] >= 12.0 && check[5] >= 100.0 && check[6] <= 44.0 && check[7] <= 118.0 ||check[8] >= 12.0 && check[9] >= 100.0 && check[10] <= 44.0 && check[11] <= 118.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb29.setDisable(true);
       });
      sb30.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 47.0 && check[1] >= 100.0 && check[2]<= 78.0 && check[3] <= 117.0 || check[4] >= 47.0 && check[5] >= 100.0 && check[6] <= 78.0 && check[7] <= 117.0 ||check[8] >= 47.0 && check[9] >= 100.0 && check[10] <= 78.0 && check[11] <= 117.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb30.setDisable(true);
       });
      sb31.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 82.0 && check[1] >= 107.0 && check[2]<= 113.0 && check[3] <= 125.0 || check[4] >= 82.0 && check[5] >= 107.0 && check[6] <= 113.0 && check[7] <= 125.0 ||check[8] >= 82.0 && check[9] >= 107.0 && check[10] <= 113.0 && check[11] <= 125.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb31.setDisable(true);
       });
      sb32.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 116.0 && check[1] >= 107.0 && check[2]<= 148.0 && check[3] <= 124.0 || check[4] >= 116.0 && check[5] >= 107.0 && check[6] <= 148.0 && check[7] <= 124.0 ||check[8] >= 116.0 && check[9] >= 107.0 && check[10] <= 148.0 && check[11] <= 124.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb32.setDisable(true);
       });
      sb33.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 152.0 && check[1] >= 107.0 && check[2]<= 182.0 && check[3] <= 124.0 || check[4] >= 152.0 && check[5] >= 107.0 && check[6] <= 182.0 && check[7] <= 124.0 ||check[8] >= 152.0 && check[9] >= 107.0 && check[10] <= 182.0 && check[11] <= 124.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb33.setDisable(true);
       });
      sb34.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 186.0 && check[1] >= 107.0 && check[2]<= 217.0 && check[3] <= 124.0 || check[4] >= 186.0 && check[5] >= 107.0 && check[6] <= 217.0 && check[7] <= 124.0 ||check[8] >= 186.0 && check[9] >= 107.0 && check[10] <= 217.0 && check[11] <= 124.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb34.setDisable(true);
       });
      sb35.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 222.0 && check[1] >= 107.0 && check[2]<= 252.0 && check[3] <= 124.0 || check[4] >= 222.0 && check[5] >= 107.0 && check[6] <= 252.0 && check[7] <= 124.0 ||check[8] >= 222.0 && check[9] >= 107.0 && check[10] <= 252.0 && check[11] <= 124.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb35.setDisable(true);
       });
      sb36.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 256.0 && check[1] >= 107.0 && check[2]<= 287.0 && check[3] <= 124.0 || check[4] >= 256.0 && check[5] >= 107.0 && check[6] <= 287.0 && check[7] <= 124.0 ||check[8] >= 256.0 && check[9] >= 107.0 && check[10] <= 287.0 && check[11] <= 124.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb36.setDisable(true);
       });
      sb37.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 292.0 && check[1] >= 107.0 && check[2]<= 322.0 && check[3] <= 124.0 || check[4] >= 292.0 && check[5] >= 107.0 && check[6] <= 322.0 && check[7] <= 124.0 ||check[8] >= 292.0 && check[9] >= 107.0 && check[10] <= 322.0 && check[11] <= 124.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb37.setDisable(true);
       });
      sb38.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 326.0 && check[1] >= 107.0 && check[2]<= 358.0 && check[3] <= 124.0 || check[4] >= 326.0 && check[5] >= 107.0 && check[6] <= 358.0 && check[7] <= 124.0 ||check[8] >= 326.0 && check[9] >= 107.0 && check[10] <= 358.0 && check[11] <= 124.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb38.setDisable(true);
       });
      sb39.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 11.0 && check[1] >= 119.0 && check[2]<= 43.0 && check[3] <= 135.0 || check[4] >= 11.0 && check[5] >= 119.0 && check[6] <= 43.0 && check[7] <= 135.0 ||check[8] >= 11.0 && check[9] >= 119.0 && check[10] <= 43.0 && check[11] <= 135.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb39.setDisable(true);
       });
      sb40.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 46.0 && check[1] >= 119.0 && check[2]<= 78.0 && check[3] <= 135.0 || check[4] >= 46.0 && check[5] >= 119.0 && check[6] <= 78.0 && check[7] <= 135.0 ||check[8] >= 46.0 && check[9] >= 119.0 && check[10] <= 78.0 && check[11] <= 135.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb40.setDisable(true);
       });
      sb41.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 82.0 && check[1] >= 129.0 && check[2]<= 112.0 && check[3] <= 146.0 || check[4] >= 82.0 && check[5] >= 129.0 && check[6] <= 112.0 && check[7] <= 146.0 ||check[8] >= 82.0 && check[9] >= 129.0 && check[10] <= 112.0 && check[11] <= 146.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb41.setDisable(true);
       });
      sb42.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 117.0 && check[1] >= 129.0 && check[2]<= 147.0 && check[3] <= 147.0 || check[4] >= 117.0 && check[5] >= 129.0 && check[6] <= 147.0 && check[7] <= 147.0 ||check[8] >= 117.0 && check[9] >= 129.0 && check[10] <= 147.0 && check[11] <= 147.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb42.setDisable(true);
       });
      sb43.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 157.0 && check[1] >= 129.0 && check[2]<= 182.0 && check[3] <= 147.0 || check[4] >= 157.0 && check[5] >= 129.0 && check[6] <= 182.0 && check[7] <= 147.0 ||check[8] >= 157.0 && check[9] >= 129.0 && check[10] <= 182.0 && check[11] <= 147.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb43.setDisable(true);
       });
      sb44.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 187.0 && check[1] >= 128.0 && check[2]<= 218.0 && check[3] <= 147.0 || check[4] >= 187.0 && check[5] >= 128.0 && check[6] <= 218.0 && check[7] <= 147.0 ||check[8] >= 187.0 && check[9] >= 128.0 && check[10] <= 218.0 && check[11] <= 147.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb44.setDisable(true);
       });
      sb45.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 222.0 && check[1] >= 128.0 && check[2]<= 253.0 && check[3] <= 146.0 || check[4] >= 222.0 && check[5] >= 128.0 && check[6] <= 253.0 && check[7] <= 146.0 ||check[8] >= 222.0 && check[9] >= 128.0 && check[10] <= 253.0 && check[11] <= 146.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb45.setDisable(true);
       });
      sb46.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 256.0 && check[1] >= 129.0 && check[2]<= 287.0 && check[3] <= 146.0 || check[4] >= 256.0 && check[5] >= 129.0 && check[6] <= 287.0 && check[7] <= 146.0 ||check[8] >= 256.0 && check[9] >= 129.0 && check[10] <= 287.0 && check[11] <= 146.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb46.setDisable(true);
       });
      sb47.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 291.0 && check[1] >= 129.0 && check[2]<= 323.0 && check[3] <= 147.0 || check[4] >= 291.0 && check[5] >= 129.0 && check[6] <= 323.0 && check[7] <= 147.0 ||check[8] >= 291.0 && check[9] >= 129.0 && check[10] <= 323.0 && check[11] <= 147.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb47.setDisable(true);
       });
      sb48.setOnAction(e ->{
         try (Scanner input1 = new Scanner(file)){
               while(input1.hasNext()){
                  doubles += input1.nextLine() + " ";
               }
                String[] points = doubles.split("\\s+");
                for(int i =0; i < check.length; i++){
                  System.out.println(points[i]);
                  check[i] = Double.parseDouble(points[i]);
                  System.out.println(check[i] + " ");
                }
                  
                  if(check[0] >= 327.0 && check[1] >= 129.0 && check[2]<= 358.0 && check[3] <= 146.0 || check[4] >= 327.0 && check[5] >= 129.0 && check[6] <= 358.0 && check[7] <= 146.0 ||check[8] >= 327.0 && check[9] >= 129.0 && check[10] <= 358.0 && check[11] <= 146.0){
                     tA.setText("YOU GOT A HIT!");
                  }else{
                     tA.setText("YOU MISSED ):" );
                  }
            }
               catch(Exception ex){
                  ex.printStackTrace();
         }
         sb48.setDisable(true);
       });
      
      start.setOnAction(e -> {
         MakeDrag(p1);
         MakeDrag(p2);
         MakeDrag(p3);
         start.setDisable(true);
    });
      finish.setOnAction(e ->{
         MakeLock(p1);
         MakeLock(p2);
         MakeLock(p3);
         finish.setDisable(true);
         Bounds boundsP1 = p1.localToScene(p1.getBoundsInLocal());
         Bounds boundsP2 = p2.localToScene(p2.getBoundsInLocal());
         Bounds boundsP3 = p3.localToScene(p2.getBoundsInLocal());
         String P1Data = new String(boundsP1.getMinX()+" "+ boundsP1.getMinY()+" "+boundsP1.getMaxX()+" "+boundsP1.getMaxY()+" ");
         String P2Data = new String(boundsP2.getMinX()+" "+ boundsP2.getMinY()+" "+boundsP2.getMaxX()+" "+boundsP2.getMaxY()+" ");
         String P3Data = new String(boundsP3.getMinX()+" "+boundsP3.getMinY()+" "+boundsP3.getMaxX()+" "+boundsP3.getMaxY()+" ");
     
         try{
            DataOutputStream output1 = new DataOutputStream(new FileOutputStream("battleshipPlayer2.txt"));
            output1.writeUTF(P1Data);
            output1.writeUTF(P2Data);
            output1.writeUTF(P3Data);
        }catch(IOException ex){
           ex.printStackTrace();
        }
      });
     
            
        TextArea tA = new TextArea();
        tA.setEditable(false);
        tA.setWrapText(true);
        VBox root1 = new VBox();
        root1.getChildren().addAll(gp,tA);
        root.getChildren().addAll(p1,p2,p3,start,finish);
        
        TabPane tp = new TabPane();
        Tab tab1 = new Tab("Opponents Board");
        Tab tab2 = new Tab("Your Board");
        tab1.setContent(root1);
        tab2.setContent(root);
        tp.getTabs().addAll(tab1,tab2);
        

        Scene scene = new Scene(tp,370,350);
        primaryStage.setTitle("Battleship Player2");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
   }
     
       private double startX;
       private double startY;
       private void MakeDrag(Polygon polygon){
           polygon.setOnMousePressed(e ->{
               startX = e.getSceneX() - polygon.getTranslateX();
               startY = e.getSceneY() - polygon.getTranslateY();
           });
           polygon.setOnMouseDragged(e ->{
                polygon.setTranslateX(e.getSceneX() - startX);
                polygon.setTranslateY(e.getSceneY() - startY);
                startx = e.getSceneX();
                starty = e.getSceneY();
           });
       }
       private void MakeLock(Polygon polygon){
         polygon.setOnMousePressed(e ->{
            startX = e.getSceneX() - polygon.getTranslateX();
            startY = e.getSceneY() - polygon.getTranslateY();
         });
         polygon.setOnMouseDragged(e ->{
            // This turns off the dragging of the ships
         });
      }
 
    public static void main(String[] args){
        launch(args);
    }
}
