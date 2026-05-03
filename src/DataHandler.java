public class DataHandler {

    public <T> String handleData(T[] array){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (T item : array){
            count++;
            sb.append(String.format("(%d) %s; ", count, item));
        }
        return sb.toString();
    }
}
