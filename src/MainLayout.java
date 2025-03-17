import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
public class MainLayout {
    // MainLayout.java
        private BorderPane layout;

        public MainLayout() {
            layout = new BorderPane();

            // Create tabs for different functionalities
            TabPane tabPane = new TabPane();
            Tab studentTab = new Tab("Student Management", new StudentManagementUI().getLayout());
            Tab courseTab = new Tab("Course Enrollment", new CourseEnrollmentUI().getLayout());
            Tab gradeTab = new Tab("Grade Management", new GradeManagementUI().getLayout());

            tabPane.getTabs().addAll(studentTab, courseTab, gradeTab);
            layout.setCenter(tabPane);
        }

        public BorderPane getLayout() {
            return layout;
        }
    }
