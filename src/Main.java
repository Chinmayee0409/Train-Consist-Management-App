import java.util.Arrays;

public class TrainConsistUC20 {

    public static boolean searchBogie(String[] bogieIds, String searchKey) {

        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Cannot search. No bogies available in train consist.");
        }

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
                "BG309"
        };

        String searchKey = "BG205";

        try {
            boolean found = searchBogie(bogieIds, searchKey);

            if (found) {
                System.out.println("Bogie Found: " + searchKey);
            } else {
                System.out.println("Bogie Not Found: " + searchKey);
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}