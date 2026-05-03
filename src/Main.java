public class Main {

    public static void main(String[] args) {

        DataProvider provider = new DataProvider();
        DataHandler dataHandler = new DataHandler();

        researchProcessing("Products: ", dataHandler, provider.getProductNames());
        researchProcessing("Sales, EUR: ", dataHandler, provider.getSalesAmounts());
    }

    private static void getOutPut(String output) {
        System.out.println(output);
    }

    private static <T> void researchProcessing(String title, DataHandler dataHandler, T[] data) {
        try {
            System.out.print(title);
            String result = dataHandler.handleData(data);
            getOutPut(result);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}