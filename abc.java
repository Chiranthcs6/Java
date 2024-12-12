    import java.util.Scanner;

    class Employee{
        int ID, salary;
        String name;
        
        Employee(int ID, String name, int salary){
            this.ID=ID;
            this.name=name;
            this.salary=salary;
        }
        void raise(int percent){
            int incre=this.salary*percent/100;
            this.salary +=incre;
        }
    }
    class abc{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("ID");
            int ID=sc.nextInt();
            System.out.println("salary");
            int salary=sc.nextInt();
            System.out.println("Name");
            String name=sc.nextLine();
            Employee emp= new Employee(ID,name,salary);
            emp.raise(20);
            System.out.println("Rasied Salary:" +emp.salary);
        sc.close();
    }
    }