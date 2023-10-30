package filter;

public class FilterService {
    public String[] filter(String[] values, CustomFilter customFilter){
        String[] names = new String[2];
        int count = 0;
        for (String name: values){
            if (customFilter.filter(name)){
                names[count] = name;
                count++;
            }
        }
        return names;
    }
}
