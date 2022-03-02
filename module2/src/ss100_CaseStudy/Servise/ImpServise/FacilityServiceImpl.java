package ss100_CaseStudy.Servise.ImpServise;

import ss100_CaseStudy.Model.facility.Facility;
import ss100_CaseStudy.Model.facility.House;
import ss100_CaseStudy.Model.facility.Room;
import ss100_CaseStudy.Model.facility.Villa;
import ss100_CaseStudy.Servise.FacilityService;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    public static final String VILLA_CSV = "D:\\codegym1\\module2\\src\\ss100_CaseStudy\\data\\villa.csv";
    public static final String HOUSE_CSV = "D:\\codegym1\\module2\\src\\ss100_CaseStudy\\data\\house.csv";
    public static final String ROOM_CSV = "D:\\codegym1\\module2\\src\\ss100_CaseStudy\\data\\room.csv";
    Scanner scanner = new Scanner(System.in);
    static Map<Facility,Integer> facilityList= new LinkedHashMap<>();
//    public FacilityServiceImpl(){
//        readFile();
//    }
//
//    public static void readFile(){
//        for (Map.Entry<Facility,Integer> facility : readFileVilla().entrySet()){
//            facilityList.put(facility.getKey(),1);
//        }
//        for (Map.Entry<Facility,Integer> facility : readFileHouse().entrySet()){
//            facilityList.put(facility.getKey(),1);
//        }
//        for (Map.Entry<Facility,Integer> facility : readFileRoom().entrySet()){
//            facilityList.put(facility.getKey(),1);
//        }
//    }
//
//    static {
//        readFile();
//        if (facilityList.size() == 0){
//
//            Villa villa = new Villa("SSVL5642","Villa",15.000,
//                    12000,12,"day","vip",12000,5);
//
//            Villa villa1 = new Villa("SSVL7614","Villa",14.000,32000,
//                    12,"day","vip",13000,7);
//
//            Villa villa2 = new Villa("SSVL3012","Villa",7.1,12000,
//                    12,"day","vip",1300,5);
//
//            House house = new House("SVHO6897", "House",12.003,12,
//                    12,"month","vip",6);
//
//            Room room = new Room("SVRO1203","Room",45.000,1230,
//
//                    12,"day","nước suối");
//            try {
//                writeFileVila();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                writerFileHouse();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                writerFileRoom();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }

//    }

    public static int ranDom() {
        Random random = new Random();
        int id = 0;
        id = random.nextInt(9);
        return id;
    }

    public static String randumId() {
        String result = "";
        for (int i = 0; i < 4; i++) {
            result += ranDom() + "";
        }
        return result;
    }

    public  static String inputIdService(String propert){
        String idService = null;
        boolean check = false;

        do {
            if (propert.equals("villa")){
                idService = "SVVL"+ randumId();
                break;
            }else if (propert.equals("house")){
                idService = "SVHO" + randumId();
                break;
            }else {
                idService = "SVRO" + randumId();
                break;
            }
        }while (check);
        return idService;
    }

    public String[] createFacility(){
        Scanner scanner = new Scanner(System.in);
        String[] facility = new String[5];
        boolean check = false;
        double usableArea = 0;
        int rentalCosts = 0;
        int MaximumNumberofPeople = 0;
        String pertiveType = null;


     do {
         check = false;
         try {
             System.out.println("Nhập vào diện tích phòng");
             usableArea = Double.parseDouble(scanner.nextLine());
         }catch (NumberFormatException e){
             System.out.println("Hãy là người dùng thông minh..");
         }if (usableArea < 30){
             System.out.println("Diện tích phải lớn hơn 30..");
             check = true;
             continue;
         }
     }while (check);


     do {
         check = false;
         try {
             System.out.println("Nhập vào chi phí thuê");
             rentalCosts = Integer.parseInt(scanner.nextLine());
         }catch (NumberFormatException e){
             System.out.println("Hãy là người dùng thông minh");
         }if (rentalCosts < 0){
             System.out.println("Hãy nhập đúng giá..");
             check = true;
             continue;

         }
     }while (check);


         do {
            check = false;
             try {
                 System.out.println("Nhập số lượng người tối đa.... ");
                 MaximumNumberofPeople = Integer.parseInt(scanner.nextLine());
             }catch (NumberFormatException e){
                 System.out.println("Số người phải lớn hơn 0 và nhỏ hơn 20...");
                 check = true;
                 continue;
             }if (MaximumNumberofPeople < 0 || MaximumNumberofPeople > 20){
                 System.out.println("Số lượng người tối đa phải lớn hơn 0 và nhỏ hơn 20..");
                 check = true;
                 continue;
             }
         }while (check);


       do {
           check = true;
               System.out.println("Nhập kiểu thuê .(year/month/day/hours)");
               pertiveType = scanner.nextLine();
               if (pertiveType.equals("year")||pertiveType.equals("month")||pertiveType.equals("day")||pertiveType.equals("hours")){
                   check = false;
                   break;
               }if (check){
               System.out.println("Hãy là người dung thông minh...");
                   continue;
           }

       }while (check);
        facility[0] = String.valueOf(usableArea);
        facility[1] = String.valueOf(rentalCosts);
        facility[2] = String.valueOf(MaximumNumberofPeople);
        facility[3] = pertiveType;
      return facility;

    }

    public void disPlayVilla(){
           for (Map.Entry<Facility,Integer> facilityIntegerEntry : facilityList.entrySet()){
               if (facilityIntegerEntry.getKey() instanceof Villa) {
                   System.out.println(facilityIntegerEntry.getKey());
                   System.out.println(facilityIntegerEntry.getValue());
               }


       }
   }
   public void disPlayHouse(){
           for (Map.Entry<Facility,Integer> facilityIntegerEntry : facilityList.entrySet()){
               if (facilityIntegerEntry.getKey() instanceof House){
                   System.out.println(facilityIntegerEntry.getKey());
                   System.out.println(facilityIntegerEntry.getValue());

           }
       }
   }
   public void disPlayRoom(){
           for (Map.Entry<Facility,Integer> facilityIntegerEntry : facilityList.entrySet()){
               if (facilityIntegerEntry.getKey() instanceof Room){
                   System.out.println(facilityIntegerEntry.getKey());
                   System.out.println(facilityIntegerEntry.getValue());
           }
       }

   }




    public void addNew(int a)  {
        boolean check = false;
        String[] propetyFacility = createFacility();
        if (a == 1){

            System.out.println("Nhập vào tiêu chuẩn phòng");
            String roomStandard = scanner.nextLine();
            double poolArea = 0;

            do {
                check = false;
                try {
                    System.out.println("Nhập vào diện tích hồ bơi");
                    poolArea = Double.parseDouble(scanner.nextLine());
                    check = false;
                    break;

                }catch (NumberFormatException e){
                    System.out.println("Hãy nhập cho đúng..");
                    check = true;
                    continue;
                }

            }while (check);

            int numberLoors = 0;
    do {
        check = false;
        try {
            System.out.println("Nhập vào số tầng.");
             numberLoors = Integer.parseInt(scanner.nextLine());
             check = false;
             break;
        }catch (NumberFormatException e){
            System.out.println("Hãy nhập số.....");
            check = true;
            continue;
        }
    }while (check);
            Villa villa = new Villa(inputIdService("villa"), "Villa",Double.parseDouble(propetyFacility[0]),
                    Integer.parseInt(propetyFacility[1]),Integer.parseInt(propetyFacility[2]),
                    propetyFacility[3],roomStandard,poolArea,numberLoors);
            updateFaciliy(villa);
            try {
                writeFileVila();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (a == 2){
            System.out.println("Nhập vào tiêu chuẩn phòng ");
            String roomStandard = scanner.nextLine();

            int numberFloors = 0;
           do {
               check = false;
               try {
                   System.out.println("Nhập vào số tầng  ");
                    numberFloors = Integer.parseInt(scanner.nextLine());
                   check = false;
                   break;
               }catch (NumberFormatException e){
                   System.out.println("Hãy nhập đúng ....");
                   check = true;
                   continue;
               }
           }while (check);
            House house = new House(inputIdService("house"),"House",Double.parseDouble(propetyFacility[0]),
                    Integer.parseInt(propetyFacility[1]),Integer.parseInt(propetyFacility[2]),propetyFacility[3],roomStandard,numberFloors);
            updateFaciliy(house);
            try {
                writerFileHouse();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        if (a == 3){
            String freeserviceIncluded = null;
           try {
               System.out.println("Nhập vào dịch vụ miễn phí đi kèm..");
               freeserviceIncluded = scanner.nextLine();
           }catch (NumberFormatException e){
               System.out.println("Hãy là người dùng thông minh");
           }
           Room room = new Room(inputIdService("room"),"Room",Double.parseDouble(propetyFacility[0]),
                   Integer.parseInt(propetyFacility[1]),
                   Integer.parseInt(propetyFacility[2]),
                   propetyFacility[3],freeserviceIncluded);
           updateFaciliy(room);
            try {
                writerFileRoom();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public void updateFaciliy(Facility facility){
           if (facilityList.containsKey(facility)){
               int num = facilityList.get(facility)+1;
               facilityList.put(facility,num);
           }else {
               facilityList.put(facility,1);
           }
    }


    @Override
    public void listMaintenanace() {
       for (Map.Entry<Facility,Integer> facility : facilityList.entrySet()){
           if (facility.getValue() == 5){
               if (facility.getKey() instanceof Villa){
                   System.out.println("Villa đã quá lần sử dụng cần phải bảo trì..");
               }else if (facility.getKey() instanceof House){
                   System.out.println("House đã quá lần sử dụng cần phải bảo trì..");
               }else {
                   System.out.println("Room đã quá lần sử dụng cần phải bảo trì");
               }

           }else {
               System.out.println("Điện nước đầy đủ...");
           }
       }

    }
    public static void writeFileVila() throws IOException {
        FileWriter fileWriter = new FileWriter(VILLA_CSV,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Map.Entry<Facility, Integer > villa : facilityList.entrySet()){
            if (villa.getKey() instanceof Villa){
                Villa villa1 = (Villa) villa.getKey();
                bufferedWriter.write(inputIdService("villa")+","+villa1.getServiceName()+","+villa1.getUsableArea()+
                        ","+villa1.getRentalCosts()+","+villa1.getMaximumNumberofPeople()+
                        ","+villa1.getPertiveType()+","+villa1.getRoomStandard()+","+villa1.getPoolArea()+
                        ","+villa1.getNumberLoors());
                bufferedWriter.newLine();

            }
        }
        bufferedWriter.close();
    }
    public static void writerFileHouse() throws IOException {
        FileWriter fileWriter = new FileWriter(HOUSE_CSV,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Map.Entry<Facility,Integer> house : facilityList.entrySet()){
            if (house.getKey() instanceof House){
                House house1 = (House) house.getKey();
                bufferedWriter.write(inputIdService("house")+","+house1.getServiceName()+","+house1.getUsableArea()+
                        ","+house1.getRentalCosts()+","+house1.getMaximumNumberofPeople()+","+house1.getPertiveType()+
                        ","+house1.getRoomStandard()+","+house1.getNumberFloors());
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.close();
    }
    public static void writerFileRoom() throws IOException {
        FileWriter fileWriter = new FileWriter(ROOM_CSV,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Map.Entry<Facility,Integer> room : facilityList.entrySet()){
            if (room.getKey() instanceof Room){
                Room room1 = (Room) room.getKey();
                bufferedWriter.write(inputIdService("room")+","+room1.getServiceName()+","+room1.getUsableArea()+
                        ","+room1.getRentalCosts()+","+room1.getMaximumNumberofPeople()+
                        ","+room1.getPertiveType()+","+room1.getFreeserviceIncluded());
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.close();

    }


    public static Map<Facility,Integer> readFileVilla()  {
        Map<Facility,Integer> facilityIntegerMap  = new LinkedHashMap<>();

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(VILLA_CSV);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;

          while ((data = bufferedReader.readLine())!=null){
              String arr[] = data.split(",");
              Villa villa = new Villa(arr[0],arr[1],Double.parseDouble(arr[2]),
                      Integer.parseInt(arr[3]),Integer.parseInt(arr[4]),arr[5],
                      arr[6],Double.parseDouble(arr[7]),Integer.parseInt(arr[8]));
              facilityIntegerMap.put(villa,1);
          }
          bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilityIntegerMap;
    }


    public static Map<Facility,Integer> readFileHouse(){
        Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(HOUSE_CSV);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;

            while ((data = bufferedReader.readLine())!=null){
                String arr[] = data.split(",");
                House house = new House(arr[0],arr[1],Double.parseDouble(arr[2]),Integer.parseInt(arr[3]),
                        Integer.parseInt(arr[4]),arr[5],arr[6],Integer.parseInt(arr[7]));
                facilityIntegerMap.put(house,1);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilityIntegerMap;

    }

    public static Map<Facility,Integer> readFileRoom(){
        Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(HOUSE_CSV);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;

            while ((data = bufferedReader.readLine())!=null){
                String arr[] = data.split(",");
                Room room = new Room(arr[0],arr[1],Double.parseDouble(arr[2]),Integer.parseInt(arr[3]),Integer.parseInt(arr[4]),arr[5],arr[6]);
                facilityIntegerMap.put(room,1);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilityIntegerMap;
    }
}
