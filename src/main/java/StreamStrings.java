package main.java;


public class StreamStrings {
    public static void main(String[] args) {
        StreamString streamString = new StreamString();
        String[] list = {"One", "Two", "Three", "Four", "Five", "Six"};
        String[] list1 = {"1, 12, 20", "44, 5"};
        streamString.metod1(list);
        streamString.metod2(list);
        System.out.println();
        streamString.metodStream(list1);
    }
}
