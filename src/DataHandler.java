public class DataHandler {

    public <T> String handleData(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("No data available!");
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (T item : array) {
            count++;
            sb.append(String.format("(%d) %s; ", count, item));
        }
        return sb.toString();
    }
}
