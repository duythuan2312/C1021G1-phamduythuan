package model.employee;

public class Employee {
   private int employeeId;
   private String employeeName;
   private String employeeBirthday;
   private String employeeIdCard;
   private double salary;
   private String phone;
   private String email;
   private String address;

   private int positioId;
   private String positionName;
   private int educationDegreeId;
   private String educationDegreeName;
   private int divisionId;
   private String divisionName;
   private String userName;

   public Employee(String employeeName, String employeeBirthday, String employeeIdCard, double salary, String phone, String email, String address, int positioId, int educationDegreeId, int divisionId) {
      this.employeeName = employeeName;
      this.employeeBirthday = employeeBirthday;
      this.employeeIdCard = employeeIdCard;
      this.salary = salary;
      this.phone = phone;
      this.email = email;
      this.address = address;
      this.positioId = positioId;
      this.educationDegreeId = educationDegreeId;
      this.divisionId = divisionId;
   }

   public Employee(int employeeId, String employeeName, String employeeBirthday, String employeeIdCard, double salary, String phone, String email, String address, int positioId, String positionName, int educationDegreeId, String educationDegreeName, int divisionId, String divisionName) {
      this.employeeId = employeeId;
      this.employeeName = employeeName;
      this.employeeBirthday = employeeBirthday;
      this.employeeIdCard = employeeIdCard;
      this.salary = salary;
      this.phone = phone;
      this.email = email;
      this.address = address;
      this.positioId = positioId;
      this.positionName = positionName;
      this.educationDegreeId = educationDegreeId;
      this.educationDegreeName = educationDegreeName;
      this.divisionId = divisionId;
      this.divisionName = divisionName;
   }

   public Employee(int employeeId, String employeeName, String employeeBirthday, String employeeIdCard, double salary, String phone, String email, String address, int positioId, int educationDegreeId, int divisionId) {
      this.employeeId = employeeId;
      this.employeeName = employeeName;
      this.employeeBirthday = employeeBirthday;
      this.employeeIdCard = employeeIdCard;
      this.salary = salary;
      this.phone = phone;
      this.email = email;
      this.address = address;
      this.positioId = positioId;
      this.educationDegreeId = educationDegreeId;
      this.divisionId = divisionId;
   }

   public Employee(int employeeId, String employeeName, String employeeBirthday, String employeeIdCard, double salary, String phone, String email, String address, int positioId, String positionName, int educationDegreeId, int divisionId, String educationDegreeName, String divisionName) {
      this.employeeId = employeeId;
      this.employeeName = employeeName;
      this.employeeBirthday = employeeBirthday;
      this.employeeIdCard = employeeIdCard;
      this.salary = salary;
      this.phone = phone;
      this.email = email;
      this.address = address;
      this.positioId = positioId;
      this.positionName = positionName;
      this.educationDegreeId = educationDegreeId;
      this.divisionId = divisionId;
      this.educationDegreeName = educationDegreeName;
      this.divisionName = divisionName;
   }

   public Employee(int employeeId, String employeeName, String employeeBirthday, String employeeIdCard, double salary, String phone, String email, String address, int positioId, String positionName, int educationDegreeId, int divisionId, String educationDegreeName, String divisionName, String userName) {
      this.employeeId = employeeId;
      this.employeeName = employeeName;
      this.employeeBirthday = employeeBirthday;
      this.employeeIdCard = employeeIdCard;
      this.salary = salary;
      this.phone = phone;
      this.email = email;
      this.address = address;
      this.positioId = positioId;
      this.positionName = positionName;
      this.educationDegreeId = educationDegreeId;
      this.divisionId = divisionId;
      this.educationDegreeName = educationDegreeName;
      this.divisionName = divisionName;
      this.userName = userName;
   }

   public String getPositionName() {
      return positionName;
   }

   public void setPositionName(String positionName) {
      this.positionName = positionName;
   }

   public String getEducationDegreeName() {
      return educationDegreeName;
   }

   public void setEducationDegreeName(String educationDegreeName) {
      this.educationDegreeName = educationDegreeName;
   }

   public String getDivisionName() {
      return divisionName;
   }

   public void setDivisionName(String divisionName) {
      this.divisionName = divisionName;
   }

   public Employee() {
   }

   public Employee(int employeeId, String employeeName, String employeeBirthday, String employeeIdCard, double salary, String phone, String email, String address, int positioId, int educationDegreeId, int divisionId, String userName) {
      this.employeeId = employeeId;
      this.employeeName = employeeName;
      this.employeeBirthday = employeeBirthday;
      this.employeeIdCard = employeeIdCard;
      this.salary = salary;
      this.phone = phone;
      this.email = email;
      this.address = address;
      this.positioId = positioId;
      this.educationDegreeId = educationDegreeId;
      this.divisionId = divisionId;
      this.userName = userName;
   }

   public int getEmployeeId() {
      return employeeId;
   }

   public void setEmployeeId(int employeeId) {
      this.employeeId = employeeId;
   }

   public String getEmployeeName() {
      return employeeName;
   }

   public void setEmployeeName(String employeeName) {
      this.employeeName = employeeName;
   }

   public String getEmployeeBirthday() {
      return employeeBirthday;
   }

   public void setEmployeeBirthday(String employeeBirthday) {
      this.employeeBirthday = employeeBirthday;
   }

   public String getEmployeeIdCard() {
      return employeeIdCard;
   }

   public void setEmployeeIdCard(String employeeIdCard) {
      this.employeeIdCard = employeeIdCard;
   }

   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public int getPositioId() {
      return positioId;
   }

   public void setPositioId(int positioId) {
      this.positioId = positioId;
   }

   public int getEducationDegreeId() {
      return educationDegreeId;
   }

   public void setEducationDegreeId(int educationDegreeId) {
      this.educationDegreeId = educationDegreeId;
   }

   public int getDivisionId() {
      return divisionId;
   }

   public void setDivisionId(int divisionId) {
      this.divisionId = divisionId;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }
}
