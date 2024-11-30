import java.util.HashSet;

public class Main {

    public static int gcd(int a, int b) {
        if (a % b <= 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 4, 4, 9, 9, 10};

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        for (int k = i + 1; k < nums.length; k++) {
            nums[k] = -1; // Using -1 as a placeholder for null
        }
        //   System.out.println(Arrays.toString(nums));
//        int i = arr.length-1;
//        while (index-- > 0)
//            arr[i--] =-1;
        //   System.out.println(Arrays.toString(arr));

        HashSet<Student> studentList = new HashSet<>();
        Student st1 = new Student("Nimit", 1);
        Student st2 = new Student("Rahul", 3);
        Student st3 = new Student("Nimit", 2);
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        System.out.println(studentList.size());

       // studentList.add(st1);
        System.out.println(studentList.size());
        System.out.println(studentList);
        System.out.println(studentList);

    }


    private static class Student {
        public int id;
        public String name;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public int hashCode() {
            return this.id;
        }

        public String toString() {
            return "Student: " + this.name + "@" + Integer.toHexString(this.id);
        }

        public boolean equals(Object o) {
            if (o instanceof Student) {
                Student s = (Student) o;
                return s.id == this.id ;
            }
            return false;
        }
    }


}