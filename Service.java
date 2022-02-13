import java.util.List;

public class Service {

    public int sumPriceOfHouses(List<House> houseList) {
        int sumHouse = 0;

        for (int i = 0; i < houseList.size(); i++) {

            sumHouse += houseList.get(i).price;

        }
        return sumHouse;
    }

    public int sumPriceOfVillas(List<House> villaList) {
        int sumVilla = 0;

        for (int i = 0; i < villaList.size(); i++) {

            sumVilla += villaList.get(i).price;

        }
        return sumVilla;
    }

    public int sumPriceOfSummerhouses(List<House> summerhouseList) {
        int sumSummerhouse = 0;

        for (int i = 0; i < summerhouseList.size(); i++) {

            sumSummerhouse += summerhouseList.get(i).price;

        }
        return sumSummerhouse;
    }

    public int totalPriceHousing(List<House> houseList, List<House> villaList, List<House> summerhouseList) {
        int sumHouse = 0;
        int sumVilla = 0;
        int sumSummerhouse = 0;
        int totalPrice;

        for (int i = 0; i < houseList.size(); i++) {
            sumHouse += houseList.get(i).price;
        }

        for (int i = 0; i < villaList.size(); i++) {
            sumVilla += villaList.get(i).price;
        }

        for (int i = 0; i < summerhouseList.size(); i++) {
            sumSummerhouse += summerhouseList.get(i).price;
        }

        totalPrice = sumHouse + sumVilla + sumSummerhouse;
        return totalPrice;
    }


    public int averageAreaOfHouses(List<House> houseList) {
        int averageHouse;
        int sumAreaHouse = 0;

        for (int i = 0; i < houseList.size(); i++) {

            sumAreaHouse += houseList.get(i).area;
        }

        averageHouse = sumAreaHouse / houseList.size();
        return averageHouse;
    }

    public int averageAreaOfVillas(List<House> villaList) {
        int averageVilla;
        int sumAreaVilla = 0;

        for (int i = 0; i < villaList.size(); i++) {

            sumAreaVilla += villaList.get(i).area;
        }

        averageVilla = sumAreaVilla / villaList.size();
        return averageVilla;
    }

    public int averageAreaOfSummerhouses(List<House> summerhouseList) {
        int averageSummerhouse;
        int sumAreaSummerhouse = 0;

        for (int i = 0; i < summerhouseList.size(); i++) {

            sumAreaSummerhouse += summerhouseList.get(i).area;
        }

        averageSummerhouse = sumAreaSummerhouse / summerhouseList.size();
        return averageSummerhouse;
    }

    public int averageAreaOfHousing(List<House> houseList, List<House> villaList, List<House> summerhouseList) {
        int averageArea;
        int sumAreaHouse = 0;
        int sumAreaVilla = 0;
        int sumAreaSummerhouse = 0;

        for (int i = 0; i < houseList.size(); i++) {

            sumAreaHouse += houseList.get(i).area;
        }

        for (int i = 0; i < villaList.size(); i++) {

            sumAreaVilla += villaList.get(i).area;
        }

        for (int i = 0; i < summerhouseList.size(); i++) {

            sumAreaSummerhouse += summerhouseList.get(i).area;
        }

        averageArea = (sumAreaHouse + sumAreaVilla + sumAreaSummerhouse) / (houseList.size() + villaList.size() + summerhouseList.size());
        return averageArea;
    }

    public String filterRoomRestroom(List<House> houseList, List<House> villaList, List<House> summerhouseList){
        String filterHouses;
        String filterHouse = null;
        String filterVilla = null;
        String filterSummerhouse = null;

        for (int i = 0; i < houseList.size(); i++) {

            filterHouse = houseList.get(i).location + " konumunda bulunan evin " + houseList.get(i).room + " odası, " + houseList.get(i).restroom + " salonu vardır.";
            System.out.println(filterHouse);
        }

        for (int i = 0; i < villaList.size(); i++) {

            filterVilla = villaList.get(i).location + " konumunda bulunan villanın " + villaList.get(i).room + " odası, " + villaList.get(i).restroom + " salonu vardır.";
            System.out.println(filterVilla);
        }

        for (int i = 0; i < summerhouseList.size(); i++) {

            filterSummerhouse = summerhouseList.get(i).location + " konumunda bulunan yazlığın " + summerhouseList.get(i).room + " odası, " + summerhouseList.get(i).restroom + " salonu vardır.";
            System.out.println(filterSummerhouse);
        }

        filterHouses = "";
        return filterHouses;
    }


}



