package case_study.service;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.repository.FacilityRepository;
import case_study.validate.FacilityValidate;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityService implements IFacilityService {
    FacilityRepository facilityRepository = new FacilityRepository();
    Map<Facility, Integer> linkedHashMap = facilityRepository.display();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addHouse() {
        linkedHashMap = facilityRepository.display();
//        int idService, String nameService, double area, double rentalCosts,
//        int quantity, String rentalType, String roomStandardHouse, int floorHouse
        String idHouse;
        do {
            System.out.print("nhập idHouse:");
            idHouse = scanner.nextLine();
        } while (!FacilityValidate.checkIdHouse(idHouse));

        String nameHouseService;
        do {
            System.out.print("nhập tên dịch vụ phòng: ");
            nameHouseService = scanner.nextLine();
        } while (!FacilityValidate.checkName(nameHouseService));
        double areaHouse;
        do {
            System.out.println("nhập diện tích phòng: ");
            areaHouse = Double.parseDouble(scanner.nextLine());
        } while (areaHouse < 30);
        double rentalHouseCosts;
        do {
            System.out.println("nhập chi phí thuê");
            rentalHouseCosts = Double.parseDouble(scanner.nextLine());
        } while (rentalHouseCosts < 0);

        int quantity;
        do {
            System.out.println("nhập số lượng người");
            quantity = Integer.parseInt(scanner.nextLine());
        } while (quantity < 0 || quantity > 20);
        String rentalType = null;
        boolean flag = true;
        do {
            System.out.println("chọn kiểu thuê: \n" +
                    "1. Thuê theo năm \n" +
                    "2. Thuê theo tháng \n" +
                    "3. Thuê theo ngày \n" +
                    "4. Thuê theo giờ\n");
            System.out.println("nhập kiểu thuê: ");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    rentalType = "thuê theo năm";
                    flag = false;
                    break;
                case 2:
                    rentalType = "thuê theo tháng";
                    flag = false;
                    break;
                case 3:
                    rentalType = "thuê theo ngày";
                    flag = false;
                    break;
                case 4:
                    rentalType = "thuê theo giờ";
                    flag = false;
                    break;
                default:
                    System.out.println("nhập ko hợp lệ");
                    break;
            }
        } while (flag);
        String roomStandardHouse = null;
        do {
            System.out.println("chọn kiểu phòng:\n" +
                    "1. Cao cấp\n" +
                    "2. Trung bình\n" +
                    "3. Bình dân\n" +
                    "chọn kiểu thuê: ");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    roomStandardHouse = "cao cấp:";
                    break;
                case 2:
                    roomStandardHouse = "trung bình";
                    flag = false;
                    break;
                case 3:
                    roomStandardHouse = "bình dân";
                    flag = false;
                    break;
                default:
                    System.out.println("nhập ko hợp lệ");
                    break;
            }
        } while (flag);
        int floorHouse;
        do {
            System.out.print("nhập số tầng toà nhà:");
            floorHouse = Integer.parseInt(scanner.nextLine());
        } while (floorHouse < 0 || floorHouse > 5);
        House house = new House(idHouse, nameHouseService, areaHouse, rentalHouseCosts, quantity, rentalType, roomStandardHouse, floorHouse);
        facilityRepository.addHouse(house);
        System.out.println("thêm mới thành công!");
    }

    @Override
    public void addVilla() {
        linkedHashMap = facilityRepository.display();
//        int idService, String nameService, double area, double rentalCosts,
//        int quantity, String rentalType, String roomStandardHouse, int floorVilla
        String idVilla;
        do {
            System.out.print("nhập idHouse:");
            idVilla = scanner.nextLine();
        } while (!FacilityValidate.checkIdVilla(idVilla));

        String nameVillaService;
        do {
            System.out.print("nhập tên dịch vụ phòng: ");
            nameVillaService = scanner.nextLine();
        } while (!FacilityValidate.checkName(nameVillaService));
        double areaVilla;
        do {
            System.out.println("nhập diện tích phòng: ");
            areaVilla = Double.parseDouble(scanner.nextLine());
        } while (areaVilla < 30);
        double rentalVillaCosts;
        do {
            System.out.println("nhập chi phí thuê");
            rentalVillaCosts = Double.parseDouble(scanner.nextLine());
        } while (rentalVillaCosts < 0);

        int quantity;
        do {
            System.out.println("nhập số lượng người");
            quantity = Integer.parseInt(scanner.nextLine());
        } while (quantity < 0 || quantity > 20);
        String rentalType = null;
        boolean flag = true;
        do {
            System.out.println("chọn kiểu thuê: \n" +
                    "1. Thuê theo năm \n" +
                    "2. Thuê theo tháng \n" +
                    "3. Thuê theo ngày \n" +
                    "4. Thuê theo giờ\n");
            System.out.println("nhập kiểu thuê: ");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    rentalType = "thuê theo năm";
                    flag = false;
                    break;
                case 2:
                    rentalType = "thuê theo tháng";
                    flag = false;
                    break;
                case 3:
                    rentalType = "thuê theo ngày";
                    flag = false;
                    break;
                case 4:
                    rentalType = "thuê theo giờ";
                    flag = false;
                    break;
                default:
                    System.out.println("nhập ko hợp lệ");
                    break;
            }
        } while (flag);
        String roomStandardHouse = null;
        do {
            System.out.println("chọn kiểu phòng:\n" +
                    "1. Cao cấp\n" +
                    "2. Trung bình\n" +
                    "3. Bình dân\n" +
                    "chọn kiểu thuê: ");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    roomStandardHouse = "cao cấp:";
                    break;
                case 2:
                    roomStandardHouse = "trung bình";
                    flag = false;
                    break;
                case 3:
                    roomStandardHouse = "bình dân";
                    flag = false;
                    break;
                default:
                    System.out.println("nhập ko hợp lệ");
                    break;
            }
        } while (flag);
        double areaSwimmingPool;
        do {
            System.out.println("nhập diện tích hồ bơi");
            areaSwimmingPool = Integer.parseInt(scanner.nextLine());
        } while (areaSwimmingPool < 30);
        int floorVilla;
        do {
            System.out.print("nhập số tầng toà nhà:");
            floorVilla = Integer.parseInt(scanner.nextLine());
        } while (floorVilla < 0 || floorVilla > 5);
//        String idService, String nameService, double area, double rentalCosts, int quantity, String rentalType, String roomStandard, double areaSwimmingPool, int floor
        Villa villa = new Villa(idVilla, nameVillaService, areaVilla, rentalVillaCosts, quantity, rentalType, roomStandardHouse, areaSwimmingPool, floorVilla);
        facilityRepository.addVilla(villa);
        System.out.println("thêm mới thành công!");
    }

    @Override
    public void addRoom() {
        linkedHashMap = facilityRepository.display();
//        int idService, String nameService, double area, double rentalCosts,
//        int quantity, String rentalType, String roomStandardHouse, int floorHouse
        String idRoom;
        do {
            System.out.print("nhập idRoom: ");
            idRoom = scanner.nextLine();
        } while (!FacilityValidate.checkIdRoom(idRoom));

        String nameRoomService;
        do {
            System.out.print("nhập tên dịch vụ phòng: ");
            nameRoomService = scanner.nextLine();
        } while (!FacilityValidate.checkName(nameRoomService));
        double areaRoom;
        do {
            System.out.print("nhập diện tích phòng: ");
            areaRoom = Double.parseDouble(scanner.nextLine());
        } while (areaRoom < 30);
        double rentalRoomCosts;
        do {
            System.out.print("nhập chi phí thuê: ");
            rentalRoomCosts = Double.parseDouble(scanner.nextLine());
        } while (rentalRoomCosts < 0);

        int quantity;
        do {
            System.out.print("nhập số lượng người: ");
            quantity = Integer.parseInt(scanner.nextLine());
        } while (quantity < 0 || quantity > 20);
        String rentalType = null;
        boolean flag = true;
        do {
            System.out.println("chọn kiểu thuê: \n" +
                    "1. Thuê theo năm \n" +
                    "2. Thuê theo tháng \n" +
                    "3. Thuê theo ngày \n" +
                    "4. Thuê theo giờ\n");
            System.out.print("nhập kiểu thuê: ");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    rentalType = "thuê theo năm";
                    flag = false;
                    break;
                case 2:
                    rentalType = "thuê theo tháng";
                    flag = false;
                    break;
                case 3:
                    rentalType = "thuê theo ngày";
                    flag = false;
                    break;
                case 4:
                    rentalType = "thuê theo giờ";
                    flag = false;
                    break;
                default:
                    System.out.println("nhập ko hợp lệ");
                    break;
            }
        } while (flag);
        System.out.print("nhập dịch vụ miễn phí đi kèm: ");
        String freeService = scanner.nextLine();

        Room room = new Room(idRoom, nameRoomService, areaRoom, rentalRoomCosts, quantity, rentalType, freeService);
        facilityRepository.addRoom(room);
        System.out.println("thêm mới thành công!");
    }


    @Override
    public void display() {
        linkedHashMap = facilityRepository.display();
        Set<Facility> set = linkedHashMap.keySet();
        for (Facility f : set) {
            System.out.println(f);
        }
    }

    @Override
    public void displayValue() {
        linkedHashMap = facilityRepository.display();
        Set<Facility> set = linkedHashMap.keySet();
        for (Facility f : set) {
            if (linkedHashMap.get(f) >= 5) {
                System.out.println(f);
            }
        }
    }
}
