// CourseEnrollmentUI.java
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class CourseEnrollmentUI {
    private final VBox layout;

    public CourseEnrollmentUI() {
        layout = new VBox(10);

        // Dropdown for course selection
        ComboBox<String> courseDropdown = new ComboBox<>();
        courseDropdown.getItems().addAll("Math", "Science", "History");

        // List for eligible students
        ListView<String> studentList = new ListView<>();
        studentList.getItems().addAll("Student A", "Student B", "Student C");

        Button enrollButton = new Button("Enroll Student");

        // Add components to layout
        layout.getChildren().addAll(courseDropdown, studentList, enrollButton);

        // Event handler
        enrollButton.setOnAction(e -> {
            String selectedCourse = courseDropdown.getValue();
            String selectedStudent = studentList.getSelectionModel().getSelectedItem();
            // Enroll student logic here
        });
    }

    public VBox getLayout() {
        return layout;
    }
}

