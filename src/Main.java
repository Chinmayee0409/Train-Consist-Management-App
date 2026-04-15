public class TrainConsistUC18 {

    public static boolean searchBogie(String[] bogieIds, String searchKey) {

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                return true;
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

        boolean found = searchBogie(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie Found: " + searchKey);
        } else {
            System.out.println("Bogie Not Found: " + searchKey);
        }
    }
}