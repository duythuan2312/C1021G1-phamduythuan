package ss100_CaseStudy.Servise.ImpServise;

import ss100_CaseStudy.Model.Persson.Customer;
import ss100_CaseStudy.Model.Persson.Employee;
import ss100_CaseStudy.Servise.mainService.PerssonService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CustomerServiceImpl implements PerssonService {
    public static final String CUSTOMER_CSV = "D:\\codegym1\\module2\\src\\ss100_CaseStudy\\data\\customer.csv";
    Scanner scanner = new Scanner(System.in);
    public static List<Customer> customerList = new ArrayList<>();
    static {
//        List<Customer> arrayList  = new ArrayList<>();
//        arrayList = readFile();
//        if (arrayList.size() == 0){
            Customer customer = new Customer(randomCode(),"Đặng Thị Linh",
                    "1/1/2006","nu","2145301789","0905981751",
                    "đăngthilinh@gmail.com","vip","Quảng Nam");
               customerList.add(customer);
    }

    public static int random() {
        int id = 0;
        Random rd = new Random();
        id = rd.nextInt(10);
        return id;
    }

    public static String randomCode() {
        String result = "";
        for (int i = 0; i < 5; i++) {
           result+= random() + "";
        }
        return result;
    }

    public void CustomerServiceImpl(){
        customerList = readFile();
    }

    @Override
    public void edit() {
        System.out.println("Nhập mã nhân viên cần sửa :");
        String id = scanner.nextLine();
        boolean check = false;
        for (int i = 0 ; i < customerList.size() ; i++){
            check = false;
            if (customerList.get(i).getId().equals(id)){
                String idCustomer = customerList.get(i).getId();
                Customer customer = creatCustomer();
                customer.setId(idCustomer);
                customerList.set(i,customer);
                writerFile();
                check = true;
                break;
            }
        }if (!check){
            System.out.println("Sai thông tin id ......");
        }

    }


    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }

    }


    public void addNew() {
        customerList.add(creatCustomer());
        writerFile();


    }

    public Customer creatCustomer() {
        String regexEmail = "[2-zA-Z][a-zA-Z0-9]+@gmail.com";
        String regexPhone = "0[397][0378][0-9]{7}";
        String regexDayOfBirth ="[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}";
        String regexCardNumber = "2[0-9]{11}";
        String inputEmail;
        String dayOfBirth;
        String sex;
        String identityCardNo;
        String inputNumberPhone;
        String inputCustomerType;
        String address;
        boolean check;

        System.out.println("Nhập họ và tên. ");
        String fullName = scanner.nextLine();
        do {
            check = false;
            System.out.println("Nhập ngày tháng năm sinh (mm/dd/yy): ");
            dayOfBirth = scanner.nextLine();

            if (!dayOfBirth.matches(regexDayOfBirth)) {
                check = true;
                System.out.println("Sai định dạng vui lòng nhập lại: ");
                continue;
            }
            String[] temp = dayOfBirth.split("/");
            if (Integer.parseInt(temp[1]) < 0 || Integer.parseInt(temp[1]) > 12) {
                check = true;
                System.out.println("Sai định dạng vui lòng nhập lại: ");
                continue;
            }
            if (Integer.parseInt(temp[1]) == 1 || Integer.parseInt(temp[1]) == 3 || Integer.parseInt(temp[1]) == 5 || Integer.parseInt(temp[1]) == 7 ||
                    Integer.parseInt(temp[1]) == 8 || Integer.parseInt(temp[1]) == 10 || Integer.parseInt(temp[1]) == 12) {
                if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 31) {
                    check = true;
                    System.out.println("Sai định dạng vui lòng nhập lại ");
                    continue;
                }
            } else if (Integer.parseInt(temp[1]) == 2) {
                if ((Integer.parseInt(temp[2]) % 4 == 0 && Integer.parseInt(temp[2]) % 100 != 0) || Integer.parseInt(temp[2]) % 400 == 0) {
                    if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 29) {
                        check = true;
                        System.out.println("Sai định dạng vui lòng nhập lại ");
                        continue;
                    }
                } else {
                    if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 28) {
                        check = true;
                        System.out.println("Sai định dạng vui lòng nhập lại ");
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

        do {
            check = true;
            System.out.println("Nhập giới tính");
            sex = scanner.nextLine();
            if (sex.toLowerCase().equals("nam") || sex.toLowerCase().equals("nu")) {
                break;
            }
        } while (check);

        do {
            check = false;
            System.out.println("Nhập số CMND: ");
            identityCardNo = scanner.nextLine();
            if (!identityCardNo.matches(regexCardNumber)) {
                check = true;
                System.out.println("Sai định dạng vui lòng nhập lại  ");
                continue;
            }

        } while (check);


        do {
            check = false;
            System.out.println("Nhập số điện thoại");
            inputNumberPhone = scanner.nextLine();
            if (!inputNumberPhone.matches(regexPhone)) {
                check = true;
                System.out.println("Sai định dạng vui lòng nhập lại ");
                continue;
            }
        } while (check);

        do {
            check = false;
            System.out.println("Nhập tìa khoản email ");
            inputEmail = scanner.nextLine();
            if (!inputEmail.matches(regexEmail)) {
                check = true;
                System.out.println("Sai định dạng vui lòng nhập lại ");
                continue;
            }
        } while (check);

        do {
            check = true;
            System.out.println("Nhập loại khách hàng");
            inputCustomerType = scanner.nextLine();
            if (inputCustomerType.toLowerCase().equals("vip") || inputCustomerType.toLowerCase().equals("thượng lưu") ||
                    inputCustomerType.toLowerCase().equals("thường") || inputCustomerType.toLowerCase().equals("siêu vip")) {
                break;
            }
        } while (check);

        System.out.println("Nhập địa chỉ.... ");
        address = scanner.nextLine();

        Customer customer = new Customer(randomCode(), fullName, dayOfBirth, sex, identityCardNo,
                inputNumberPhone, inputEmail, inputCustomerType, address);
        return customer;
    }

    public void writerFile() {
        try {
            FileWriter fileWriter = new FileWriter(CUSTOMER_CSV);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : customerList) {
                bufferedWriter.write(customer.getId()+","+ customer.getFullName()+","
                        + customer.getDayOfBirth() + "," + customer.getSex() + ","
                        + customer.getIdentityCardNo()
                        + "," + customer.getPhoneNo() + "," + customer.getEmail() + ","
                        + customer.getTypeOfGuest() + "," + customer.getAddress());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> readFile() {
        List<Customer> dataList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(CUSTOMER_CSV);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                String[] dataA = data.split(",");
                Customer customer = new Customer(dataA[0], dataA[1], dataA[2], dataA[3],
                        dataA[4], dataA[5], dataA[6], dataA[7], dataA[8]);
                dataList.add(customer);
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



