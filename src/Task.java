import java.time.LocalDate;

public class Task {
    private static int idCounter = 1;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    private final String name;
    private final LocalDate dueDate;
    private final String priority;
    private String status;

    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public Task(String name, LocalDate dueDate, String priority) {
        this.id = idCounter++;
        this.name = name;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = "Pending";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Due Date: %s | Priority: %s | Status: %s", id, name, dueDate, priority, status);
    }
}
