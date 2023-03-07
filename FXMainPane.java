


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	private Button helloBt;
	private Button howdyBt;
	private Button chineseBt;
	private Button clearBt;
	private Button exitBt;
	
	private Label feedback;
	private TextField feedbackInput;
	private HBox hbox1;
	private HBox hbox2;
	
	//student Task #4:
	//  declare an instance of DataManager
	DataManager dataManager;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	public FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		helloBt = new Button("Hello");
		howdyBt = new Button("Howdy");
		chineseBt = new Button("Chinese");
		clearBt = new Button("Clear");
		exitBt = new Button("Exit");
		
		feedback = new Label("Feedback:");
		feedbackInput = new TextField();
		
		hbox1 = new HBox();
		hbox2 = new HBox();
		
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
//		dataManager = new DataManager();
//		Insets inset = new Insets(10);
//		HBox.setMargin(helloBt, inset);
//		HBox.setMargin(howdyBt, inset);
//		HBox.setMargin(chineseBt, inset);
//		HBox.setMargin(clearBt, inset);
//		HBox.setMargin(exitBt, inset);
//		hbox1.setAlignment(Pos.CENTER);
//		HBox.setMargin(feedback, inset);
//		HBox.setMargin(feedbackInput, inset);
//		hbox2.setAlignment(Pos.CENTER);
//		
//		helloBt.setOnAction(new ButtonHandler());
//		howdyBt.setOnAction(new ButtonHandler());
//		chineseBt.setOnAction(new ButtonHandler());
//		clearBt.setOnAction(new ButtonHandler());
//		exitBt.setOnAction(new ButtonHandler());
//		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		hbox1.getChildren().addAll(helloBt,howdyBt,chineseBt,clearBt,exitBt);
		hbox2.getChildren().addAll(feedback, feedbackInput);
		getChildren().addAll(hbox1, hbox2);
		
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
//	class ButtonHandler implements EventHandler<ActionEvent>{
//		@Override
//		public void handle(ActionEvent event) {
//			
//			Object input = event.getTarget();
//			if (input == helloBt) {
//				feedbackInput.setText(dataManager.getHello());
//			}
//			else if (input == howdyBt) {
//				feedbackInput.setText(dataManager.getHowdy());
//			}
//			else if (input == chineseBt) {
//				feedbackInput.setText(dataManager.getChinese());
//			}
//			else if (input == clearBt) {
//				feedbackInput.setText("");
//			}
//			else if (input == exitBt) {
//				Platform.exit();
//				System.exit(0);
//			}
//			
//		}
//		
//	}
//	
}
	
