
package pendahuluanarraystrukturdata;


public class PendahuluanArrayStrukturData {

    
    public static void main(String[] args) {
        int array[]=new int[10];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            
        }
        System.out.println("");
        
        array=new int[20];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            
        }
        System.out.println("");
        
    }
    
}
