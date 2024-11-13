/**
 * @author Aland Adili
 * @version 11/13/2024
 * Main Class Homework_3
 */
import java.util.Scanner;
public class Homework_3 
    //employee contains  2
    //salary has 4  extend to Employee use super
    //hourly has 4 extend to Employee use super
    //static method to keep track of the employees
    //counter for each salaried and hourly to keep track of how many each
    //main method is the client class
    //input methods to ask hourly or salary 
    //different question for salary and hourly
{
/**
 * @author Aland Adili
 * @version 11/13/2024
 * Employee Class that stores the id and name of the employee
 */
    class Employee
    {
        private int id;
        private String name;
        //total++;    //counter for total employees (FIX LATER)

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
    class Salaried extends Employee
    {
        String title;
        int salary;

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
    class Hourly extends Employee
    {
        String position;
        double hourlyRate;

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
    class Client
    {
        public static void main(String[] args) 
        {
            int[] List = new int[10];
            System.out.print("Enter hourly or salary ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
        }
    }
}
   
