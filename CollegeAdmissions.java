import java.util.*;

class College {
    String name;
    int seats;
    double cutoff;
    List<Student> admittedStudents;

    public College(String name, int seats) {
        this.name = name;
        this.seats = seats;
        this.cutoff = 0.0;
        this.admittedStudents = new ArrayList<>();
    }
}

class Student {
    String id;
    double percentage;
    List<String> preferences;

    public Student(String id, double percentage, List<String> preferences) {
        this.id = id;
        this.percentage = percentage;
        this.preferences = preferences;
    }
}

public class CollegeAdmissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();  // Number of colleges
        int N = scanner.nextInt();  // Number of students

        int[] seats = new int[C];
        for (int i = 0; i < C; i++) {
            seats[i] = scanner.nextInt();
        }

        List<College> colleges = new ArrayList<>();
        for (int i = 0; i < C; i++) {
            colleges.add(new College("C-" + (i + 1), seats[i]));
        }

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String studentId = scanner.next();
            double percentage = Double.parseDouble(scanner.next());
            List<String> preferences = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                preferences.add(scanner.next());
            }
            students.add(new Student(studentId, percentage, preferences));
        }

        allocateSeats(colleges, students);

        List<College> sortedColleges = new ArrayList<>(colleges);
        Collections.sort(sortedColleges, (c1, c2) -> Double.compare(c2.cutoff, c1.cutoff));

        for (College college : sortedColleges) {
            if (college.admittedStudents.size() > 0) {
                System.out.printf("%s %.2f\n", college.name, college.cutoff);
            } else {
                System.out.printf("%s n/a\n", college.name);
            }
        }
    }

    private static void allocateSeats(List<College> colleges, List<Student> students) {
        for (Student student : students) {
            for (String preference : student.preferences) {
                for (College college : colleges) {
                    if (preference.equals(college.name) && college.seats > 0) {
                        college.admittedStudents.add(student);
                        college.cutoff = Math.max(college.cutoff, student.percentage);
                        college.seats--;
                        break;
                    }
                }
            }
        }

        for (Student student : students) {
            if (student.preferences.size() == 0) {
                for (College college : colleges) {
                    if (college.seats > 0) {
                        college.admittedStudents.add(student);
                        college.cutoff = Math.max(college.cutoff, student.percentage);
                        college.seats--;
                        break;
                    }
                }
            }
        }
    }
}
import java.util.*;

class College {
    String name;
    int seats;
    double cutoff;
    List<Student> admittedStudents;

    public College(String name, int seats) {
        this.name = name;
        this.seats = seats;
        this.cutoff = 0.0;
        this.admittedStudents = new ArrayList<>();
    }
}

class Student {
    String id;
    double percentage;
    List<String> preferences;

    public Student(String id, double percentage, List<String> preferences) {
        this.id = id;
        this.percentage = percentage;
        this.preferences = preferences;
    }
}

public class CollegeAdmissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();  // Number of colleges
        int N = scanner.nextInt();  // Number of students

        int[] seats = new int[C];
        for (int i = 0; i < C; i++) {
            seats[i] = scanner.nextInt();
        }

        List<College> colleges = new ArrayList<>();
        for (int i = 0; i < C; i++) {
            colleges.add(new College("C-" + (i + 1), seats[i]));
        }

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String studentId = scanner.next();
            double percentage = Double.parseDouble(scanner.next());
            List<String> preferences = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                preferences.add(scanner.next());
            }
            students.add(new Student(studentId, percentage, preferences));
        }

        allocateSeats(colleges, students);

        List<College> sortedColleges = new ArrayList<>(colleges);
        Collections.sort(sortedColleges, (c1, c2) -> Double.compare(c2.cutoff, c1.cutoff));

        for (College college : sortedColleges) {
            if (college.admittedStudents.size() > 0) {
                System.out.printf("%s %.2f\n", college.name, college.cutoff);
            } else {
                System.out.printf("%s n/a\n", college.name);
            }
        }
    }

    private static void allocateSeats(List<College> colleges, List<Student> students) {
        for (Student student : students) {
            for (String preference : student.preferences) {
                for (College college : colleges) {
                    if (preference.equals(college.name) && college.seats > 0) {
                        college.admittedStudents.add(student);
                        college.cutoff = Math.max(college.cutoff, student.percentage);
                        college.seats--;
                        break;
                    }
                }
            }
        }

        for (Student student : students) {
            if (student.preferences.size() == 0) {
                for (College college : colleges) {
                    if (college.seats > 0) {
                        college.admittedStudents.add(student);
                        college.cutoff = Math.max(college.cutoff, student.percentage);
                        college.seats--;
                        break;
                    }
                }
            }
        }
    }
}
