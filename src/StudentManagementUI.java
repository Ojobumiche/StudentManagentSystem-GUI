// StudentManagementUI.java
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class StudentManagementUI {
    private final VBox layout;

    public StudentManagementUI() {
        layout = new VBox(10);

        // Form for adding/updating students
        GridPane form = new GridPane();
        form.setHgap(10);
        form.setVgap(10);

        TextField nameField = new TextField();
        TextField idField = new TextField();
        Button addButton = new Button("Add Student");
        Button updateButton = new Button("Update Student");

        form.add(new Label("Name:"), 0, 0);
        form.add(nameField, 1, 0);
        form.add(new Label("ID:"), 0, 1);
        form.add(idField, 1, 1);
        form.add(addButton, 0, 2);
        form.add(updateButton, 1, 2);

        // Table to display student details
        TableView<String> studentTable = new TableView<>();
        TableColumn<String, String> nameColumn = new TableColumn<>("Name");
        TableColumn<String, String> idColumn = new TableColumn<>("ID");
        studentTable.getColumns().addAll(nameColumn, idColumn);

        // Add components to layout
        layout.getChildren().addAll(form, studentTable);

        // Event handlers
        addButton.setOnAction(e -> {
            String name = nameField.getText();
            String id = idField.getText();
            // Add student logic here
            studentTable.getItems().add(name + " - " + id);
        });

        updateButton.setOnAction(e -> {
            String name = nameField.getText();
            String id = idField.getText();
            // Update student logic here
        });
    }

    public VBox getLayout() {
        return layout;
    }
}


