package ss100_CaseStudy.Servise.ImpServise;

import ss100_CaseStudy.Model.Persson.Employee;
import ss100_CaseStudy.Servise.mainService.PerssonService;

import java.io.*;
import java.util.*;

public class EmployeeServiceImpl implements PerssonService {
    public static final String EX_CSV = "D:\\codegym1\\module2\\src\\ss100_CaseStudy\\data\\employee.csv";
    Scanner scanner = new Scanner(System.in);

    public static List<Employee> employeeList = new ArrayList<>();

    static {
        List<Employee> arrayList = new ArrayList();
        arrayList = readFile();
        if (arrayList.size() == 0){
            Employee employee = new Employee(randumId(),"Phạm Duy Thuận","23/12/2003",
                    "nam","206400646123","0702509243",
                    "phamduythuan87@gmail.com","đại học",
                    "Giám Đốc",15000);
            employeeList.add(employee);
            writeFile();

        }
    }

    public void EmployeeServiceImpl(){
         employeeList = readFile();
    }

    public static int ranDom() {
        Random random = new Random();
        int id = 0;
        id = random.nextInt(10);
        return id;
    }

    public static String randumId() {
        String result = "";
        for (int i = 0; i < 5; i++) {
            result += ranDom() + "";
        }
        return result;
    }

    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public void addNew() {
        employeeList.add(creatEmployees());
        writeFile();
    }

    public Employee creatEmployees() {

        boolean check;
        String regexEmail = "[2-zA-Z][a-zA-Z0-9]+@gmail.com";
        String regexPhone = "^0[97][0378][0-9]{7}$";
        String regexDayofBirth = "[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}";
        String regexidentityCardNo = "2[0-9]{11}";

        System.out.println("Nhập họ và tên:");
        String fullName = scanner.nextLine();

        String dayOfBirth;
        do {
            check = false;
            System.out.println("Nhập ngày tháng năm sinh.");
            dayOfBirth = scanner.nextLine();
            if (!dayOfBirth.matches(regexDayofBirth)) {
                check = true;
                System.out.println("Sai định dạng vui lòng nhập lại");
                continue;
            }
            String[] temp = dayOfBirth.split("/");
            if (Integer.parseInt(temp[1]) < 0 || Integer.parseInt(temp[1]) > 12) {
                check = true;
                continue;
            }
            if (Integer.parseInt(temp[1]) == 1 || Integer.parseInt(temp[1]) == 3 ||
                    Integer.parseInt(temp[1]) == 5 || Integer.parseInt(temp[1]) == 7 || Integer.parseInt(temp[1]) == 8 ||
                    Integer.parseInt(temp[1]) == 10 || Integer.parseInt(temp[1]) == 12) {
                if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 31) {
                    check = true;
                    continue;
                }
            } else if (Integer.parseInt(temp[1]) == 2) {
                if (Integer.parseInt(temp[2]) % 4 == 0 && Integer.parseInt(temp[2]) % 100 != 0 || Integer.parseInt(temp[2]) % 4 == 0) {
                    if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 29) {
                        check = true;
                        continue;
                    }
                } else {
                    if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 28) {
                        check = true;
                        continue;
                    }
                }

            } else if (Integer.parseInt(temp[1]) > 0 || Integer.parseInt(temp[1]) < 13) {
                if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 30) {
                    check = true;
                    continue;
                }
            } else {
                check = true;
            }

        } while (check);

        String sex;
        do {
            check = true;
            System.out.println("Nhập vào giới tính ");
            sex = scanner.nextLine();
            if (sex.toLowerCase().contains("nam") || sex.toLowerCase().contains("nu")) {
                break;
            }
        } while (check);

        String CardNo;
        do {
            check = false;
            System.out.println("Nhập số CMND");
            CardNo = scanner.nextLine();
            if (!CardNo.matches(regexidentityCardNo)) {
                check = true;
                System.out.println("Sai định dạng vui lòng nhập lại.");
            }
        } while (check);

        String phone;
        do {
            check = false;
            System.out.println("Nhập vào số điện thoại.");
            phone = scanner.nextLine();
            if (!phone.matches(regexPhone)) {
                check = true;
                System.out.println("Sai định dạng vui lòng nhập lại");
            }
        } while (check);

        String email;
        do {
            check = false;
            System.out.println("Nhập vào email");
            email = scanner.nextLine();
            if (!email.matches(regexEmail)) {
                check = true;
                System.out.println("Sai định dạng vui lòng nhập lại ....");
            }

        } while (check);
        String education;
        do {
            check = true;
            System.out.println("Nhập trình độ cấp học");
            education = scanner.nextLine();
            if (education.toLowerCase().equals("đại học") ||
                    education.toLowerCase().equals("cao đẳng") ||
                    education.toLowerCase().equals("trung cấp") ||
                    education.toLowerCase().equals("thạc sĩ") ||
                    education.toLowerCase().equals("Tiến xi")) {
                break;
            }
        } while (check);

        String position;
        do {
            check = true;
            System.out.println("Enter a position");
            position = scanner.nextLine();
            if (position.toLowerCase().equals("lễ tân") ||
                    position.toLowerCase().equals("phục vụ") ||
                    position.toLowerCase().equals("chuyên viên") ||
                    position.toLowerCase().equals("giám sát") ||
                    position.toLowerCase().equals("quản lý") ||
                    position.toLowerCase().equals("giám đốc")) {
                break;
            }
        } while (check);


        double salary = 0;
        do {
            check = false;
            try {
                System.out.println("Nhập lương..");
                salary = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập sai rồi");
                check = true;
            }
        } while (check);


        Employee employee = new Employee(randumId(), fullName, dayOfBirth, sex, CardNo, phone, email, education, position, salary);
        return employee;

    }

    @Override
    public void edit() {
        System.out.println("Nhập mã nhân viên cần sửa... ");
        String id = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < employeeList.size(); i++) {
            check = false;
             if (employeeList.get(i).getId().equals(id)){
                 String idEmployee = employeeList.get(i).getId();
                 Employee employee = creatEmployees();
                 employee.setId(idEmployee);
                 employeeList.set(i,employee);
                 writeFile();
                 check = true;
                 break;
             }
        }
        if (!check ){
            System.out.println("Không tìm thấy id cần tìm");
        }

    }

    public static  void writeFile()  {

        try {
            FileWriter fileWriter = new FileWriter(EX_CSV);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employeeList) {
                bufferedWriter.write(employee.getId() + "," + employee.getFullName() + "," + employee.getDayOfBirth() + ","
                        +employee.getSex()+","
                        + employee.getIdentityCardNo() + "," + employee.getPhoneNo() + "," +
                        employee.getEmail() + "," + employee.getEducation() + "," + employee.getPosition()
                        + "," + employee.getSalary());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> readFile() {
        List<Employee> dataList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(EX_CSV);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;

            while ((data = bufferedReader.readLine()) != null ){
                String[] dataA = data.split(",");
                Employee employee = new Employee(dataA[0], dataA[1], dataA[2], dataA[3],
                        dataA[4], dataA[5], dataA[6], dataA[7], dataA[8], Double.parseDouble(dataA[9]));
                dataList.add(employee);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataList;

}

}
