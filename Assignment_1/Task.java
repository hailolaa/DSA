package Assignment_1;

public class Task {
    String title = "To Do List Application";
    String description ="";
    boolean completed;

    Task(String title, String description){
        this.title=title;
        this.description=description;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }
    public void  markCompleted(){
        this.completed=true;
    }
}
