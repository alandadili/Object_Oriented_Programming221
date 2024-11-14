/**
 * @author Aland Adili
 * @version 11/13/2024
 * Main class that creates a list of employees and gives them a 10% raise
 */
import java.util.Scanner;

public class Client
{
    public static void main(String[] args) 
    {
            Employee[] employeeList = new Employee[10];
            int currentIndex = 0;
            Scanner scanner = new Scanner(System.in);
    
            while (currentIndex < 6) 
            {
                System.out.print("Enter hourly or salaried, 3 minimum each. Enter quit to exit: ");
                String input = scanner.next();
    
                if (input.equals("salaried")) 
                {
                    System.out.print("Enter employee id: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter employee name: ");
                    String name = scanner.next();
                    System.out.print("Enter employee title: ");
                    String title = scanner.next();
                    System.out.print("Enter employee salary: ");
                    int salary = scanner.nextInt();
                    Salaried salaried = new Salaried(id, name, title, salary);
                    
                    if (currentIndex < employeeList.length) 
                    {
                        employeeList[currentIndex++] = salaried;
                    } 
                    else 
                    {
                        System.out.println("Employee list is full.");
                    }
                    System.out.println(salaried);
                } 
                
                else if (input.equals("hourly")) 
                {
                    System.out.print("Enter employee id: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter employee name: ");
                    String name = scanner.next();
                    System.out.print("Enter employee position: ");
                    String position = scanner.next();
                    System.out.print("Enter employee hourly rate: ");
                    double hourlyRate = scanner.nextDouble();
                    Hourly hourly = new Hourly(id, name, position, hourlyRate);

                    if (currentIndex < employeeList.length) 
                    {
                        employeeList[currentIndex++] = hourly;
                    } 
                    else 
                    {
                        System.out.println("Employee list is full.");
                    }
                    System.out.println(hourly);
                } 
                else if (input.equals("quit")) 
                {
                    break;
                } 
                else 
                {
                    System.out.println("Invalid input");
                }
            }
            //no raise
            scanner.close();
            System.out.println("List of Employees - pre raise. ");
            for (int i = 0; i < employeeList.length; i++) 
            {
                System.out.println(employeeList[i]);
            }

            //10% raise
            Employee[] raisedEmployeeList = new Employee[employeeList.length];
            for (int i = 0; i < employeeList.length; i++) 
            {
                if (employeeList[i] instanceof Salaried) 
                {
                    Salaried salaried = (Salaried) employeeList[i];
                    if (salaried != null) 
                    {
                        int newSalary = (int) (salaried.getSalary() * 1.1);
                        raisedEmployeeList[i] = new Salaried(salaried.getId(), salaried.getName(), salaried.getTitle(), newSalary);
                    }
                } 
                else if (employeeList[i] instanceof Hourly) 
                {
                    Hourly hourly = (Hourly) employeeList[i];
                    if (hourly != null) 
                    {
                        double newHourlyRate = hourly.gethourlyRate() * 1.1;
                        raisedEmployeeList[i] = new Hourly(hourly.getId(), hourly.getName(), hourly.getPosition(), newHourlyRate);
                    }
                }
            }
    
            System.out.println("List of Employees - post raise: ");
            for (int i = 0; i < raisedEmployeeList.length; i++) 
            {
                System.out.println(raisedEmployeeList[i]);
            }
            //cant figure out how to do equals method
        }

/**
 * @author Aland Adili
 * @version 11/13/2024
 * Employee Class that stores the id and name of the employee
 */
    static class Employee
    {
        private int id;
        private String name;

        //contructor here
        public Employee(int id, String name) 
        {
            this.id = id;
            this.name = name;
        }

        public int getId() 
        {
            return id;
        }

        public void setId(int id) 
        {
            this.id = id;
        }

        public String getName() 
        {
            return name;
        }

        public void setName(String name) 
        {
            this.name = name;
        }

        @Override
        public String toString() 
        {
        return "Employee{id:'" + id + "', name:" + name + "}";
        }

        public boolean equals(Object obj) 
        {
            if (this == obj) 
            {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) 
            {
                return false;
            }
            Employee employee = (Employee) obj;
            return id == employee.id && name.equals(employee.name);
        }
    }
    static class Salaried extends Employee
    {
        private String title;
        private int salary;
        private static int salariedEmployees = 0;

        //contructor here
        public Salaried(int id, String name, String title, int salary)
        {
            super(id, name);
            this.title = title;
            this.salary = salary;
        }
        
        public String getTitle() 
        {
            return title;
        }

        public void setTitle(String title) 
        {
            this.title = title;
        }

        public int getSalary() 
        {
            return salary;
        }

        public void setSalary(int salary) 
        {
            this.salary = salary;
        }

        @Override
        public String toString() 
        {
            return "Salaried{id:'" + getId() + "', name:'" + getName() + "', title:'" + title + "', salary:" + salary + "}";
        }

        @Override
        public boolean equals(Object obj) 
        {
            if (this == obj) 
            {
                return true;
            }

            if (obj == null || getClass() != obj.getClass()) 
            {
                return false;
            }

            Salaried salaried = (Salaried) obj;
            return getId() == salaried.getId() &&
            getName().equals(salaried.getName()) &&
            salary == salaried.salary &&
            title.equals(salaried.title);
        }
    }
/**
 * @author Aland Adili
 * @version 11/13/2024
 * Hourly Class that stores the position and hourly rate of the employee
 */
    static class Hourly extends Employee
    {
        String position;
        double hourlyRate;
        private static int hourlyEmployees = 0;
        
        //contructor here
        public Hourly(int id, String name, String position, double hourlyRate)
        {
            super(id, name);
            this.position = position;
            this.hourlyRate = hourlyRate;
        }

        public String getPosition() 
        {
            return position;
        }

        public void setPosition(String position) 
        {
            this.position = position;
        }

        public double gethourlyRate() 
        {
            return hourlyRate;
        }

        public void sethourlyRate(double hourlyRate) 
        {
            this.hourlyRate = hourlyRate;
        }

        @Override
        public String toString() 
        {
            return "Hourly{id:'" + getId() + "', name:'" + getName() + "', position:'" + position + "', hourlyRate:" + hourlyRate + "}";
        }

        public boolean equals(Object obj) 
        {
            if (this == obj) 
            {
                return true;
            }

            if (obj == null || getClass() != obj.getClass()) 
            {
                return false;
            }

            Hourly hourly = (Hourly) obj;
            return getId() == hourly.getId() &&
            getName().equals(hourly.getName()) &&
            hourlyRate == hourly.hourlyRate &&
            position.equals(hourly.position);
        }
    }
}