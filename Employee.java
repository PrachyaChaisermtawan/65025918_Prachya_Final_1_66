import java.util.ArrayList;
public class Employee implements Person,Job{ 
   public static void main(String[] args) {
      Employee dev1 = new Employee("Tom", 20, "UX/UI", "0001");
      dev1.showDetail();

      Employee dev2 = new Employee("Tim", 20, "FontEnd", "0002");
      dev2.showDetail();
   } 
   public String Name;
   public double Age;
   public String Position;
   public String EmpID;
   private ArrayList<Project> myproject;


   public Employee(String Name, double Age, String Position, String EmpID){
      this.Name = Name;
      this.Age = Age;
      this.Position = Position;
      this.EmpID = EmpID;
      myproject = new ArrayList<Project>();
   }

   public void addProject(Project project) {
      myproject.add(project);
  }

   public ArrayList<Project> getMyproject() {
        return myproject;
    }

    // เมทอดเพื่อกำหนดค่า myproject
    public void setMyproject(ArrayList<Project> myproject) {
        this.myproject = myproject;
    }
    public ArrayList<Project> getMyproject() {
      return myproject;
   }

  // เมทอดเพื่อกำหนดค่า myproject
   public void setMyproject(ArrayList<Project> myproject) {
      this.myproject = myproject;
   }



   public void showDetail(){
      System.out.println("Name : "+ Name);
      System.out.println("Position : "+ Position);
      System.out.println("EmpID : "+ EmpID);
      System.out.println("Projects");
      System.out.println("********************************************************************************************************************");
   }

   @Override
   public String getPosition() {
      return Position;
      
   }

   @Override
   public void setPosition(String Position) {
      this.Position = Position;
   }

   @Override
   public String getEmpID() {
     return EmpID;
   }

   @Override
   public void setEmpID(String EmpID) {
      this.EmpID =EmpID;
   }

   @Override
   public String getName() {
      return Name;
   }

   @Override
   public void setName(String Name) {
      this.Name = Name;
   }

   @Override
   public int getAge() {
      return (int) Age;
   }

   @Override
   public void setAge(int Age) {
      this.Age = Age;
   }

}

   interface Person{
      public String getName();
      public void setName(String Age);
      public int getAge();
      public void setAge(int Age);
}

   interface Job{
      public String getPosition();
      public void setPosition(String Age);
      public String getEmpID();
      public void setEmpID(String Age);
}