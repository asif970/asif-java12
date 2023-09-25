package ad_patterns;

public class floyds_triangle {

    public static void floyds_triangles(int n){
      int counter=1;
      for(int i=0;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(counter + " " );
            counter++;
        }
        System.out.println();
      }
      
    }
    public static void main(String args[]){
        floyds_triangles(5);
    }
}
