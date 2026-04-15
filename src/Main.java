import java.util.Arrays;

public class TrainConsistUC19 {

    public static boolean binarySearch(String[] bogieIds, String searchKey) {

        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = searchKey.compareTo(bogieIds[mid]);

            if (result == 0) {
                return true;
            }
            else if (result < 0) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        String searchKey = "BG309";

        boolean found = binarySearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie Found: " + searchKey);
        } else {
            System.out.println("Bogie Not Found: " + searchKey);
        }
    }
}