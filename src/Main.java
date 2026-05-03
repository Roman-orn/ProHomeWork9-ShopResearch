public class Main {

    public static void main(String[] args){

        DataProvider provider = new DataProvider();
        DataHandler dataHandler = new DataHandler();

        String productsName = dataHandler.handleData(provider.getProductNames());
        getOutPut("Products: " + productsName);

        String salesAmount = dataHandler.handleData(provider.getSalesAmounts());
        getOutPut("Sales, EUR: " + salesAmount);
    }

    private static void getOutPut(String output){
        System.out.println(output);
    }

}