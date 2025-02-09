import java.math.BigDecimal;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsInJava {

    public static class Item {

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        private String name;
        private int qty;
        private BigDecimal price;

        public Item(String name, int qty, BigDecimal price) {
            this.name = name;
            this.qty = qty;
            this.price = price;
        }
//constructors, getter/setters
    }

    public static void main(String[] arg) {
        List<Integer> list = Arrays.asList(1,2,5,3,10,9,10,1,3);
        // avg of list of integer
        double avg = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println("Avg of the list  "+avg);
        // to format 2 decimal points
        String formattedAverage = String.format("%.2f", avg);
        System.out.println(formattedAverage);

        List<String> strings = Arrays.asList("yash","SAXENaa","hello","WoEDSD");
        strings = strings.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(strings);

        // sum of number in list
        int sum = list.stream().filter(c->c%2==0).reduce(0, Integer::sum);
        System.out.println("sum : "+sum);

        // remove duplicate elements
        System.out.println("removed duplicate elements:"+
                list.stream().distinct().collect(Collectors.toList()));

        // count no of strings that start with specific letter
        long count = strings.stream().filter(s-> s.startsWith("A")).count();

        // sort a list of string
        // asc order
        System.out.println( strings.stream().sorted().collect(Collectors.toList()));
       // desc order
        System.out.println( strings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
     // alphabetical order order
        System.out.println( strings.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()));
        // max min from the list of number
        System.out.println(list.stream().max(Integer::compare).orElse(null));
        // second max
        System.out.println(list.stream().distinct().sorted().skip(1).collect(Collectors.toList()));

        // group by
        //3 apple, 2 banana, others 1
        List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );
        // Items counts based on name
       Map<String,Long> countMap =  items.stream().collect(Collectors.groupingBy(Item::getName,Collectors.counting()));
        System.out.println(countMap);
        // items group by name
        Map<String,List<Item>> mapofItem =  items.stream().collect(Collectors.groupingBy(Item::getName, Collectors.toList()));

        System.out.println(mapofItem);
        // sort object Employee by firstName;
        Employee employee1 = new Employee("Yash","Saxena",24);
        Employee employee2 = new Employee("Vaibhav","Singh",26);
        Employee employee3 = new Employee("Anshita","Gupta",19);
        Employee employee4 = new Employee("Aman","Goel",35);
        Employee employee5 = new Employee("Abhishek","Saxena",29);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        employees = employees.stream().sorted(Comparator.comparing(Employee::getFirstname)).collect(Collectors.toList());
        System.out.println("Sorted employees: ");
        for (Employee emp: employees){
            System.out.println(emp.toString());
        }

        // Longest String
        List<String> listOfStrings = Arrays.asList("abc","11313","131232dw","1231232");
        System.out.println("Longest String:- "+ listOfStrings.stream().max(Comparator.comparingInt(String::length)).get());

        // Avg age of list of Employees
        System.out.println("Avg Age of List OF employees:- "+employees.stream().mapToInt(employee -> employee.age).average());

        // list of Integers containg prime number;
        list.stream().filter(f->{
            for(int i=2;i<f/2;i++){
                if(i != f && f %i ==0){
                    return false;
                }
            }
            return true;
        }).forEach(System.out::println);

        // two sorted list merged into single sorted list
        List<Integer> list1 = Arrays.asList(1,2,5,6,23,29,30);
        List<Integer> list2 = Arrays.asList(31,2,5,6,26,29,32);
        List<Integer> mergedList = Stream.concat(list1.stream(),list2.stream()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(mergedList);

        // remove dublicates
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        System.out.println(numbersWithDuplicates.stream().distinct().collect(Collectors.toList()));
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );
        System.out.println("transaction amount as per each day:- "+transactions.stream().collect(Collectors.groupingBy(t->t.date, Collectors.summingInt(Transaction::getAmount))));

        // find kth samelest element
        System.out.println("Kth smallest element in the array:- "+ list.stream().sorted().skip(3).findFirst().orElse(-1));

    }


    public static class Employee{
        private String firstname;
        private String lastname;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        private int age;
        public Employee(String firstname,String lastname,int age){
            this.firstname=firstname;
            this.lastname=lastname;
            this.age = age;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        @Override
        public boolean equals(Object o) {
            if(o == null || this.getClass() != o.getClass())
                return false;
            Employee employee = (Employee)o;
            if(employee.firstname.equals(this.firstname) && employee.getLastname().equals(this.lastname)){
                return true;
            }
            return false;}

        @Override
        public int hashCode() {
            return Objects.hash(firstname, lastname);
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    '}';
        }
    }

    private static class Transaction {
        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        private String date;
        private int amount;
        public Transaction(String date, int i) {
            this.date= date;
            this.amount = i;
        }
    }
}
