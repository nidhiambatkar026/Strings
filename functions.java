public class functions {
    public static void main(String args[]){
        String firstName = "Nidhi";
        String LastName = "Ambatkar";
        String FullName = firstName + LastName;
        System.out.println(FullName);
        //length
        System.out.println(FullName.length());
        //chartAt
        for(int i=0; i<FullName.length();i++){
            System.out.println(FullName.charAt(i));
        }
    }
}
