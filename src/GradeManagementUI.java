// GradeManagementUI.java
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class GradeManagementUI {
    private VBox layout;

    public GradeManagementUI() {
        layout = new VBox(10);

        // Dropdown for student selection
        ComboBox<String> studentDropdown = new ComboBox<>();
        studentDropdown.getItems().addAll("Student A", "Student B", "Student C");

        // List for enrolled courses and grades
        ListView<String> courseList = new ListView<>();
        courseList.getItems().addAll("Math - A", "Science - B");

        TextField gradeField = new TextField();
        Button assignGradeButton = new Button("Assign Grade");

        // Add components to layout
        layout.getChildren().addAll(studentDropdown, courseList, gradeField, assignGradeButton);

        // Event handler
        assignGradeButton.setOnAction(e -> {
            String selectedStudent = studentDropdown.getValue();
            String grade = gradeField.getText();
            // Assign grade logic here
        });
    }

    public VBox getLayout() {
        return layout;
    }
}
