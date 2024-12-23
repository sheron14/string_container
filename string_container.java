import java.util.ArrayList;  	
class StringArray {  
    private ArrayList<String> strings;  
    public StringArray() {  
        strings = new ArrayList<>();  
    }  
    public void add(String element) {  
        int l = strings.size();
        if (strings.size() == 0){
            strings.add(element);   
        }
        else if (strings.getFirst().length() > element.length()) {
            strings.add(0, element);
        }
        else if (strings.getLast().length() < element.length()) {
            strings.add(element);
        }
        else {
            for (int i = 0; i < l ; i++)
            {
                if (strings.get(i).length() >= element.length()) {
                    strings.add(i, element);
                }
            }
        }
    }  
    public String getMaxLengthElement() {  
        if (strings.isEmpty()) {  
            return null;  
        }  
        return strings.get(strings.size() - 1);  
    }  
    public double getAverageLength() {  
        if (strings.isEmpty()) {  
            return 0;  
        }  
          
        double totalLength = 0;  
        for (String str : strings) {  
            totalLength += str.length();  
        }  
          
        return totalLength / strings.size();  
    }  
    public void display() {  
        for (String str : strings) {  
            System.out.println(str);  
        }  
    }  
    public static void main(String[] args) {  
        StringArray stringArray = new StringArray();    
        stringArray.add("Hello");  
        stringArray.add("World");  
        stringArray.add("Java");  
        stringArray.add("Programming");  
        System.out.println("Все строки:");  
        stringArray.display();   
        System.out.println("Самый длинный эллемент: " + stringArray.getMaxLengthElement());  
        System.out.println("Средняя длина строк: " + stringArray.getAverageLength());  
    }  
}  