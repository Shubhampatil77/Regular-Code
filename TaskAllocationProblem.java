import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Task {
    String taskName;
    String taskType;
    int completionTime;

    public Task(String taskName, String taskType, int completionTime) {
        this.taskName = taskName;
        this.taskType = taskType;
        this.completionTime = completionTime;
    }
}

class TaskAllocation {
    String worker;
    String taskName;
    int completionTime;

    public TaskAllocation(String worker, String taskName, int completionTime) {
        this.worker = worker;
        this.taskName = taskName;
        this.completionTime = completionTime;
    }
}

public class TaskAllocationProblem {
    public static List<TaskAllocation> allocateTasks(int N, int M, List<Task> tasks) {
        List<TaskAllocation> taskAllocations = new ArrayList<>();
        List<String> workers = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            workers.add("W" + i);
        }
        int currentTime = 0;

        for (Task task : tasks) {
            String taskName = task.taskName;
            String taskType = task.taskType;
            int completionTime = taskType.equals("Machine") ? 0 : task.completionTime;

            String worker = workers.remove(0);
            taskAllocations.add(new TaskAllocation(worker, taskName, currentTime));
            currentTime += completionTime;
        }

        Collections.sort(taskAllocations, (a, b) -> {
            if (a.completionTime != b.completionTime) {
                return Integer.compare(a.completionTime, b.completionTime);
            } else {
                return a.taskName.compareTo(b.taskName);
            }
        });

        return taskAllocations;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Number of workers
        int M = scanner.nextInt(); // Number of tasks

        List<Task> tasks = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String taskName = scanner.next();
            String taskType = scanner.next();
            int completionTime = taskType.equals("Machine") ? 0 : scanner.nextInt();
            tasks.add(new Task(taskName, taskType, completionTime));
        }

        List<TaskAllocation> allocations = allocateTasks(N, M, tasks);

        for (TaskAllocation allocation : allocations) {
            System.out.println(allocation.worker + " " + allocation.taskName + " " + allocation.completionTime);
        }
    }
}
