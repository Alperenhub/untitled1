public class Main {
    public static void main(String[] args) {

    toplam(new int[]{2, 34, 2, 14, 34, 3},3);



    }
    public static boolean toplam(int arr[], int b) {
        boolean varMi = false;
        for (int ar : arr){
            if(ar==b){
                varMi=true;

            }
            else{
                varMi =false;
            }
   
        }  
        if (varMi==true){
            System.out.println(b+"Sayi mevcut");
        }else {
            System.out.println(b+"mevcut değil");
        }
    return true;
    }
}
//   String sehirler[]= {"Mecmua","Giresun","Meshul"};
//for(String sehir : sehirler){
//        System.out.println(sehir);
//        }