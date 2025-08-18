package BlackList;


import java.util.List;


public class Main {
    
    public static void main(String a[]){
        HostBlackListsValidator hblv=new HostBlackListsValidator();
        List<Integer> blackListOcurrences=hblv.checkHost("202.24.34.54",100);
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
        
    }
    
}
