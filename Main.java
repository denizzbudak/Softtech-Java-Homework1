import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<House> houseList = new ArrayList<House>();
        houseList.add(new House("Ankara", 300000,100, 2, 1));
        houseList.add(new House("İstanbul", 400000, 100, 1, 1));
        houseList.add(new House("İzmir", 450000,150, 3, 1));

        List<House> villaList = new ArrayList<House>();
        villaList.add(new House("Bolu",5500000 ,250, 5, 2));
        villaList.add(new House("Bursa", 7600000, 200, 6, 1));
        villaList.add(new House("Muğla", 12300000,  800, 5, 2));

        List<House> summerhouseList = new ArrayList<House>();
        summerhouseList.add(new House("Antalya", 3000000, 320, 4, 2));
        summerhouseList.add(new House("Kuşadası", 1500000, 190, 3, 1));
        summerhouseList.add(new House("Mersin", 2200000, 130, 2, 1));

        Service service = new Service();
        int sumHouse = service.sumPriceOfHouses(houseList);
        int sumVilla = service.sumPriceOfVillas(villaList);
        int sumSummerhouse = service.sumPriceOfSummerhouses(summerhouseList);
        int totalPriceHousing = service.totalPriceHousing(houseList,villaList,summerhouseList);


        int averageAreaOfHouses = service.averageAreaOfHouses(houseList);
        int averageAreaOfVillas = service.averageAreaOfVillas(villaList);
        int averageAreaOfSummerhouses = service.averageAreaOfSummerhouses(summerhouseList);
        int averageAreaOfHousing = service.averageAreaOfHousing(houseList,villaList,summerhouseList);

        System.out.println("Evlerin toplam fiyatı: " + sumHouse + " ₺");
        System.out.println("Villaların toplam fiyatı: " + sumVilla + " ₺");
        System.out.println("Yazlıkların toplam fiyatı: " + sumSummerhouse + " ₺");
        System.out.println("Tüm evlerin toplam fiyatı: " + totalPriceHousing + " ₺\n");

        System.out.println("Evlerin ortalama alanı: " + averageAreaOfHouses + " m²");
        System.out.println("Villaların ortalama alanı: " + averageAreaOfVillas + " m²");
        System.out.println("Yazlıkların ortalama alanı: " + averageAreaOfSummerhouses + " m²");
        System.out.println("Tüm evlerin ortalama alanı: " + averageAreaOfHousing + " m²\n");

        String filterHouses = service.filterRoomRestroom(houseList,villaList,summerhouseList);
        System.out.println(filterHouses);



    }
}
